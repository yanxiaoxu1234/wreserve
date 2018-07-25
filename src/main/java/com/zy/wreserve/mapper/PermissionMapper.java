package com.zy.wreserve.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.wechat.entity.Permission;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Lucare
 * @since 2017-03-06
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> selectPermList(Page page);

}