package com.zy.wreserve.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.wechat.entity.Role;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Lucare
 * @since 2017-03-06
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Long> findRoleIdListByUserId(long uid);

    List<Role> selectRoleList(Page page);

}