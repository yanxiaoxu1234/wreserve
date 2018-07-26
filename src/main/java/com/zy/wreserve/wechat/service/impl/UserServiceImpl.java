package com.zy.wreserve.wechat.service.impl;

import com.zy.wreserve.wechat.entity.User;
import com.zy.wreserve.mapper.UserMapper;
import com.zy.wreserve.wechat.service.IUserService;
import com.zy.wreserve.wechat.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {

}
