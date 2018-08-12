package com.zy.wreserve.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.entity.RolePermission;

import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {
    Set<String> findPermissions(long roleId);
}
