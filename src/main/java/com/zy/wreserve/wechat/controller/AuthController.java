package com.zy.wreserve.wechat.controller;

import com.alibaba.druid.util.StringUtils;
import com.zy.wreserve.common.constant.ConstantKey;
import com.zy.wreserve.common.utils.Resp;
import com.zy.wreserve.wechat.entity.User;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String authorize(HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        String url = "http://zhyonk.tunnel.echomod.cn/login";
        String getCodeurl = wxService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_BASE, null);
        logger.info("重定向至:"+getCodeurl);
        return "redirect:"+getCodeurl;
    }

    @RequestMapping("/getCode")
    public Resp getCode(HttpServletRequest request, HttpServletResponse response) {
        return Resp.success("这是getCode页面");
    }


}
