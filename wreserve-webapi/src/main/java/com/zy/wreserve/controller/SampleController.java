package com.zy.wreserve.controller;

import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.security.token.SSOToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * KISSO 演示
 * </p>
 *
 * @author 青苗
 * @since 2017-08-08
 */
//@Controller
public class SampleController {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;

    @ResponseBody
    @RequestMapping("/kisso")
    public String home() {
        return "Hello Kisso!";
    }

//    // 授权登录
//    @ResponseBody
//    @RequestMapping("/login")
//    public String login() {
//        // 设置登录 COOKIE
////        SSOHelper.setCookie(request, response, SSOToken.create().setIp(request).setId(1000).setIssuer("kisso"), false);
//
//        return "login success!";
//    }

    // 查看登录信息
    @ResponseBody
    @RequestMapping("/token")
    public String token() {
        String msg = "暂未登录";
        SSOToken ssoToken = SSOHelper.attrToken(request);
        if (null != ssoToken) {
            msg = "登录信息 ip=" + ssoToken.getIp();
            msg += "， id=" + ssoToken.getId();
            msg += "， issuer=" + ssoToken.getIssuer();
        }
        return msg;
    }

    // 退出登录
    @ResponseBody
    @RequestMapping("/logout")
    public String logout() {
        SSOHelper.clearLogin(request, response);
        return "Logout Kisso!";
    }
}