package com.zy.wreserve.wechat.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.zy.wreserve.wechat.mapper.RolePermissionMapper;
import com.zy.wreserve.wechat.mapper.UserMapper;
import com.zy.wreserve.wechat.mapper.UserRoleMapper;
import com.zy.wreserve.wechat.entity.Role;
import com.zy.wreserve.wechat.entity.User;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zy.wreserve.wechat.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public User findUserByOpenId(String openid) {
        return userMapper.findUserByOpenId(openid);
    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public List<Role> findRolePermissions(String openid) {
        List<Role> roleIdList = userRoleMapper.findRoleListByUserId(openid);
        for (Role role : roleIdList) {
            Set<String> everyRolePer = rolePermissionMapper.findPermissions(role.getId());
            role.setPerNameSet(everyRolePer);
        }
        return roleIdList;
    }

    @Override
    public Page<User> selectUserPage(Page<User> page) {
        page.setRecords(userMapper.selectUserList(page));
        return page;
    }
}
