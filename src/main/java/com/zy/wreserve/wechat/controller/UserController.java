package com.zy.wreserve.wechat.controller;


import com.zy.wreserve.wechat.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

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



}

