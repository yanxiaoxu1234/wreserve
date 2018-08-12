package com.zy.wreserve.controller;


import com.zy.wreserve.entity.User;
import com.zy.wreserve.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@Controller
@RequestMapping("/wechat/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {

        String sourcrUrl = "http://zhyonk.tunnel.echomod.cn/getCode";
        User openId = userService.findUserByOpenId("oWHgww8nu-U3qWWJaHvy5I5ZyVMQ");
        return "redirect:" +openId;
    }


}

