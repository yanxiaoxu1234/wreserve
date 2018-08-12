package com.zy.wreserve.controller;

import com.alibaba.druid.util.StringUtils;
import com.zy.wreserve.constant.ConstantKey;
import com.zy.wreserve.entity.User;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zy
 */
@Controller
@RequestMapping("/oauth2")
public class AuthController {

    @Autowired
    private WxMpService wxService;
    private static Logger logger = LoggerFactory.getLogger(AuthController.class);


    @RequestMapping("/authorize")
    public String authorize(HttpServletRequest request, HttpSession session,HttpServletResponse response){

        String url = "";
        String getCodeurl = wxService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_BASE, null);

        if(session.getAttribute(ConstantKey.MEMBER_SESSION_KEY)==null) {
            //用户登录
            if(!validateOAuth2Pwd(request)) {
                //登录失败跳转到登陆页
                return "/oauth2/login";
            }
        }
        return null;
    }
    public boolean validateOAuth2Pwd(HttpServletRequest request){

        if("get".equalsIgnoreCase(request.getMethod())) {
            return false;
        }
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(pwd)) {
            return false;
        }
        try {
            if(name.equalsIgnoreCase("Irving")&&pwd.equalsIgnoreCase("123456")){
                //登录成功
                request.getSession().setAttribute(ConstantKey.MEMBER_SESSION_KEY,"Irving");
                return true;
            }
            return false;
        } catch (Exception ex) {
            logger.error("validateOAuth2Pwd Exception: " + ex.getMessage());
            return false;
        }
    }

    public String home(User user) {

        String userName = user.getUser_name();
        String password = user.getPassword();
        if (userName != null && password != null) {
            String md5Pwd = new Md5Hash(password).toString();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, md5Pwd, "login");
            Subject currentUser = SecurityUtils.getSubject();
            logger.info("对用户[" + userName + "]进行登录验证..验证开始");
            try {
                currentUser.login( token );
                //验证是否登录成功
                if (currentUser.isAuthenticated()) {
                    logger.info("用户[" + userName + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                    return "redirect:/";
                } else {
                    token.clear();
                    return "redirect:/login";
                }
            } catch ( UnknownAccountException uae ) {
                logger.info("对用户[" + userName + "]进行登录验证..验证失败-username wasn't in the system");
            } catch ( IncorrectCredentialsException ice ) {
                logger.info("对用户[" + userName + "]进行登录验证..验证失败-password didn't match");
            } catch ( LockedAccountException lae ) {
                logger.info("对用户[" + userName + "]进行登录验证..验证失败-account is locked in the system");
            } catch ( AuthenticationException ae ) {
                logger.error(ae.getMessage());
            }
        }
        return "login";
    }
}
