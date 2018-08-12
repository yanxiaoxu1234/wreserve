package com.zy.wreserve.wechat.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.zy.wreserve.wechat.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
//@CacheConfig(cacheNames = "users")
public interface UserMapper extends BaseMapper<User> {

    User findByName(String name);

    List<User> selectUserList(Page page);

    User findUserByOpenId(@Param("openid") String openid);
}
