package com.zy.wreserve.mapper;

import com.zy.wreserve.wechat.entity.Role;
import com.zy.wreserve.wechat.entity.UserRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户-角色表 Mapper 接口
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<Role> findRoleListByUserId(String openid);

}
