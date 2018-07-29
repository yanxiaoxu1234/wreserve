package com.zy.wreserve.common.shiro;

import com.zy.wreserve.wechat.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 */
public class AuthSubjectUtil {

    /**
     * 系统管理员账号
     */
    public static final Integer SUPPLIER_ADMIN_USERNAME = 1;


    /**
     * 判断是否平台管理员账号登录
     */
    public static boolean isPatformAdmin() {
        Subject subject = SecurityUtils.getSubject();
        if (subject == null)
            return false;
        User user = (User) subject.getPrincipal();
        return SUPPLIER_ADMIN_USERNAME.equals(user.getPosition_id());
    }
}
