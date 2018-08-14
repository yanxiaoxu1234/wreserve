package com.zy.wreserve.wechat.controller;
import com.zy.wreserve.common.Enum.ErrorCode;
import com.zy.wreserve.common.redis.MyRedisSessionDao;
import com.zy.wreserve.common.redis.ShiroRedisCache;
import com.zy.wreserve.common.utils.Resp;
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
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
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
    /**
     * 登陆
     *
     * @return
     */
    @ApiOperation(value="登陆验证", notes="根据session信息判断登陆")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping("/login")
    public Resp index(HttpServletRequest request, HttpServletResponse response) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        String code = request.getParameter("code");

        Serializable id = session.getId();


        //如果不包含code，说明不是回调请求，组合登陆url，重定向
        if (Objects.isNull(code)){
            //不是回调请求,
            String url = "http://zhyonk.tunnel.echomod.cn/login";
            String getCodeurl = wxService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_USERINFO, null);
            try {
                response.sendRedirect(getCodeurl);
                logger.info("重定向至:"+getCodeurl);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
                UsernamePasswordToken token = new UsernamePasswordToken(openId, password,"");
                logger.info("对用户[" + openId + "]进行登录验证..验证开始");
                try {
                    subject.login(token);
                    //验证是否登录成功
                    if (subject.isAuthenticated()) {
                        logger.info("系统中有openid为:"+openId+"的用户，登陆成功");
                        SavedRequest savedRequest= WebUtils.getSavedRequest(request);
                        if(null!=savedRequest){
                            String requestUrl = savedRequest.getRequestUrl();
                            logger.info("注意登录之前的路径是"+requestUrl);
                            response.sendRedirect(requestUrl);
                        }
                        return Resp.success("登陆成功");
                    } else {
                        //没有登陆过系统
                        token.clear();
                        logger.info("用户的openid以及获得，但用户没有关注公众号，系统中没有该用户的信息");
                        return Resp.fail();
                    }
                } catch (UnknownAccountException uae) {
                    logger.info("对用户[" + openId + "]进行登录验证..验证失败-username wasn't in the system");
                    return Resp.fail(ErrorCode.SYSTEM_ERROR);
                } catch (IncorrectCredentialsException ice) {
                    logger.info("对用户[" + openId + "]进行登录验证..验证失败-password didn't match");
                    return Resp.fail(ErrorCode.UNLOGIN_ERROR);
                } catch (LockedAccountException lae) {
                    logger.info("对用户[" + openId + "]进行登录验证..验证失败-account is locked in the system");
                    return Resp.fail(ErrorCode.AUTH_VALID_ERROR);
                } catch (AuthenticationException ae) {
                    logger.error(ae.getMessage());
                    return Resp.fail(ErrorCode.UNLOGIN_ERROR);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return Resp.fail(ErrorCode.SYSTEM_ERROR);
    }


}

