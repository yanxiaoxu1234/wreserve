package com.zy.wreserve.wechat.controller;
import com.zy.wreserve.wechat.entity.OAuth2Token;
import com.zy.wreserve.wechat.entity.User;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;

import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by zy
 * OAuth2 客户端实现
 */
@Controller
public class ClientController {

    private static Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private WxMpService wxService;

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

    @RequestMapping("/login")
    public String index(HttpServletRequest request,HttpServletResponse response) {
        //判断有无session信息
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession(false);
        if (Objects.isNull(session)){
            //说明没有登陆信息，或者session有效期已过，重定向至授权页面

        }else {
            //有session信息,获取sessionID
            Serializable id = session.getId();

        }

        String userName = request.getParameter("openid");
        String password = request.getParameter("password");
        if (userName != null && password != null) {
//            String md5Pwd = new Md5Hash(password, AuthConstant.salt).toString();
//            String md5Pwd = new Md5Hash(password).toString();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, password,"");

            logger.info("对用户[" + userName + "]进行登录验证..验证开始");
            try {
                subject.login(token);
                //验证是否登录成功
                if (subject.isAuthenticated()) {
                    logger.info("用户[" + userName + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                    return "redirect:/";
                } else {
                    token.clear();
                    return "redirect:/login";
                }
            } catch (UnknownAccountException uae) {
                logger.info("对用户[" + userName + "]进行登录验证..验证失败-username wasn't in the system");
            } catch (IncorrectCredentialsException ice) {
                logger.info("对用户[" + userName + "]进行登录验证..验证失败-password didn't match");
            } catch (LockedAccountException lae) {
                logger.info("对用户[" + userName + "]进行登录验证..验证失败-account is locked in the system");
            } catch (AuthenticationException ae) {
                logger.error(ae.getMessage());
            }
        }
        return "/";
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

