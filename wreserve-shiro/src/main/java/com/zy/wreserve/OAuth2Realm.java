package com.zy.wreserve;

import com.zy.wreserve.exception.OAuth2AuthenticationException;
import com.zy.wreserve.shiro.AuthSubjectUtil;
import com.zy.wreserve.entity.OAuth2Token;
import com.zy.wreserve.entity.Role;
import com.zy.wreserve.entity.User;
import com.zy.wreserve.service.IUserService;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class OAuth2Realm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(OAuth2Realm.class);

    private String clientId;
    private String clientSecret;
    private String accessTokenUrl;
    private String userInfoUrl;
    private String redirectUrl;

    @Autowired
    private WxMpService wxService;

    @Autowired
    private IUserService userService;
    //省略setter
    public boolean supports(AuthenticationToken token) {
        return token instanceof WxMpOAuth2AccessToken; //表示此Realm只支持WxMpOAuth2AccessToken类型
    }

    /**
     * 权限认证
     * @param principals
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("##################执行Shiro权限认证##################");

        User user = (User) principals.getPrimaryPrincipal();

        if (user != null) {
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

            if (AuthSubjectUtil.isPatformAdmin()) {
                authorizationInfo.addStringPermission("*");
            }

            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            for (Role role : user.getRoleList()) {
                authorizationInfo.addRole(role.getName());
                authorizationInfo.addStringPermissions(role.getPerNameSet());
            }
            return authorizationInfo;
        }
        return null;
    }

    /**
     * 登陆认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        OAuth2Token oAuth2Token = (OAuth2Token) token;
        //获取code
        String code = oAuth2Token.getAuthCode();
        SimpleAuthenticationInfo info = extractUserInfo(code);
        System.out.print(info);

//        User user = userService.findUserByOpenId(openId);
//        //数据库中有此用户
//        if(user!=null){
//            List<Role> list = userService.findRolePermissions(user.getOpen_id());
//            user.setRoleList(list);
//            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,openId, getName());
//            return info;
//
//        }else {
//            //用户首次登陆系统
//        }
        return info;
    }

    private SimpleAuthenticationInfo extractUserInfo(String code) {
        SimpleAuthenticationInfo info = null;
        try {
            WxMpOAuth2AccessToken token = wxService.oauth2getAccessToken(code);

            info = new SimpleAuthenticationInfo(token.getOpenId(),token.getAccessToken(),getName());
            return info;
        } catch (WxErrorException e) {
            e.printStackTrace();
            throw new OAuth2AuthenticationException(e);
        }

    }

}