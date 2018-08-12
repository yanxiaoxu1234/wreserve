package com.zy.wreserve.common;

import com.zy.wreserve.wechat.entity.Role;
import com.zy.wreserve.wechat.entity.User;
import com.zy.wreserve.wechat.service.IUserService;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRealm  extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private IUserService userService;

    /**
     *权限验证
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {


        return null;
    }

    /**
     * 登陆验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        logger.info("验证当前Subject时获取到token为：" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));

        User hasUser = userService.findUserByOpenId(token.getUsername());
        String open_id = hasUser.getOpen_id();
        String password = hasUser.getPassword();

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(open_id, password, getName());
//        if (hasUser != null) {
//            // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            // @link org.apache.shiro.realm.AuthenticatingRealm#assertCredentialsMatch
//            List<Role> list = userService.findRolePermissions(hasUser.getOpen_id());
//            hasUser.setRoleList(list);
//            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(hasUser, hasUser.getPassword(), getName());
//            // @link HashedCredentialsMatcher#doCredentialsMatch
////            info.setCredentialsSalt(ByteSource.Util.bytes(AuthConstant.salt));
//            return info;
//        }
        return info;
    }
}
