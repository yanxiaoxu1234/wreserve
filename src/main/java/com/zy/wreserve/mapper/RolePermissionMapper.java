package com.zy.wreserve.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.wechat.entity.RolePermission;

import java.util.Set;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Lucare
 * @since 2017-03-08
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    Set<String> findPermissions(long roleId);

}