package com.zy.wreserve.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.zy.wreserve.wechat.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public interface UserMapper extends BaseMapper<User> {

    User findByName(String name);

    List<User> selectUserList(Page page);
}
