package com.zy.wreserve.wechat.service.impl;

import com.zy.wreserve.wechat.entity.Order;
import com.zy.wreserve.mapper.OrderMapper;
import com.zy.wreserve.wechat.service.IOrderService;
import com.zy.wreserve.wechat.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements IOrderService {

}
