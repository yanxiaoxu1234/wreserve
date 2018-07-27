package com.zy.wreserve.mapper;

import com.zy.wreserve.wechat.entity.RolePermission;
import com.baomidou.mybatisplus.mapper.BaseMapper;

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
