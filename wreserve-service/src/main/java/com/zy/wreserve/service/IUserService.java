package com.zy.wreserve.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.zy.wreserve.entity.Role;
import com.zy.wreserve.entity.User;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public interface IUserService extends IService<User> {

    User findUserByOpenId(String openid);

    User findByName(String name);

    List<Role> findRolePermissions(String openid);

    Page<User> selectUserPage(Page<User> page);
}
