package com.zy.wreserve.wechat.controller;
import com.zy.wreserve.common.redis.MyRedisSessionDao;
import com.zy.wreserve.common.redis.ShiroRedisCache;
import com.zy.wreserve.wechat.entity.OAuth2Token;
import com.zy.wreserve.wechat.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;

import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by zy
 * OAuth2 客户端实现
 */
@RestController
public class ClientController {

    private static Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private WxMpService wxService;

    @Autowired
    private RedisTemplate redisTemplate;
    /*
        response_type：表示授权类型，必选项，此处的值固定为"code"
        client_id：表示客户端的ID，必选项
        redirect_uri：表示重定向URI，可选项
        scope：表示申请的权限范围，可选项
        state：表示客户端的当前状态，可以指定任意值，认证服务器会原封不动地返回这个值
    */










    /**
     * 获得授权码
     *
     * @return
     */
    @ApiOperation(value="登陆验证", notes="根据session信息判断登陆")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping("/login")
    public String index(HttpServletRequest request,HttpServletResponse response) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();

        String code = request.getParameter("code");
        //如果不包含code，说明不是回调请求，组合登陆url，重定向
        if (Objects.isNull(code)){
            //不是回调请求,
            String url = "http://zhyonk.tunnel.echomod.cn/login";
            String getCodeurl = wxService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_BASE, null);
            return "redirect:"+getCodeurl;
        }else {
            //是回调请求，执行登陆验证
            String openId = null;
            try {
                WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxService.oauth2getAccessToken(code);
                openId = wxMpOAuth2AccessToken.getOpenId();
            } catch (WxErrorException e) {
                e.printStackTrace();
            }
            String password = "";

            if (openId != null) {
//            String md5Pwd = new Md5Hash(password, AuthConstant.salt).toString();
//            String md5Pwd = new Md5Hash(password).toString();
                UsernamePasswordToken token = new UsernamePasswordToken(openId, password,"");

                logger.info("对用户[" + openId + "]进行登录验证..验证开始");
                try {
                    subject.login(token);
                    //验证是否登录成功
                    if (subject.isAuthenticated()) {
                        logger.info("系统中有openid为:"+openId+"的用户，登陆成功");
                        return "redirect:/index";
                    } else {
                        token.clear();
                        logger.info("用户的openid以及获得，但用户没有关注公众号，系统中没有该用户的信息");
                        return "redirect:/error";
                    }
                } catch (UnknownAccountException uae) {
                    logger.info("对用户[" + openId + "]进行登录验证..验证失败-username wasn't in the system");
                } catch (IncorrectCredentialsException ice) {
                    logger.info("对用户[" + openId + "]进行登录验证..验证失败-password didn't match");
                } catch (LockedAccountException lae) {
                    logger.info("对用户[" + openId + "]进行登录验证..验证失败-account is locked in the system");
                } catch (AuthenticationException ae) {
                    logger.error(ae.getMessage());
                }
            }
            return "/";
        }

    }

    @RequestMapping("/getCode")
    public String client(HttpServletRequest request1) {

        String code = request1.getParameter("code");
        Subject currentUser = SecurityUtils.getSubject();
        SecurityManager manager = new SecurityManager();
        String nickName = null;
        try {
            OAuth2Token token = new OAuth2Token(code);
            currentUser.login(token);
            return "redirect:" +"/home";
        } catch ( UnknownAccountException uae ) {
            logger.info("对用户[" + nickName + "]进行登录验证..验证失败-username wasn't in the system");
        } catch ( IncorrectCredentialsException ice ) {
            logger.info("对用户[" + nickName + "]进行登录验证..验证失败-password didn't match");
        } catch ( LockedAccountException lae ) {
            logger.info("对用户[" + nickName + "]进行登录验证..验证失败-account is locked in the system");
        } catch ( AuthenticationException ae ) {
            logger.error(ae.getMessage());
        }
        return "/zhyonk";
    }

    /*
        grant_type：表示使用的授权模式，必选项，此处的值固定为"authorization_code"
        code：表示上一步获得的授权码，必选项。
        redirect_uri：表示重定向URI，必选项，且必须与A步骤中的该参数值保持一致
        client_id：表示客户端ID，必选项
    */

    /**
     * 获得令牌
     *
     * @return
     */
    @RequestMapping(value = "/getAccessToken", method = RequestMethod.GET)
    public String getToken(HttpServletRequest request, Model model) {
        String code = request.getParameter("code");
        try {
            WxMpOAuth2AccessToken token = wxService.oauth2getAccessToken(code);
            boolean valid = wxService.oauth2validateAccessToken(token);
            // 如果不存在/过期了，返回未验证错误，需重新验证
            if (!valid){

            }
            WxMpUser user = wxService.oauth2getUserInfo(token, null);

        } catch (WxErrorException e) {
            e.printStackTrace();
        }

        return "";
    }
}

