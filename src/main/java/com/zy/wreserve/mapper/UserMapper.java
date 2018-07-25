package com.zy.wreserve.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zy.wreserve.wechat.entity.User;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Lucare
 * @since 2017-02-24
 */
public interface UserMapper extends BaseMapper<User> {

    User findByName(String name);

    List<User> selectUserList(Page page);

}