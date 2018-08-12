package com.zy.wreserve.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.entity.Role;
import com.zy.wreserve.entity.UserRole;

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
