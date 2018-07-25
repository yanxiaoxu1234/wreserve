package com.zy.wreserve.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.wechat.entity.Role;
import com.zy.wreserve.wechat.entity.UserRole;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Lucare
 * @since 2017-03-08
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<Role> findRoleListByUserId(long uid);

}