package com.zy.wreserve.wechat.service.impl;

import com.zy.wreserve.wechat.entity.OrderProgress;
import com.zy.wreserve.wechat.mapper.OrderProgressMapper;
import com.zy.wreserve.wechat.service.IOrderProgressService;
import com.zy.wreserve.wechat.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单状态记录表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@Service
public class OrderProgressServiceImpl extends BaseServiceImpl<OrderProgressMapper, OrderProgress> implements IOrderProgressService {

}
