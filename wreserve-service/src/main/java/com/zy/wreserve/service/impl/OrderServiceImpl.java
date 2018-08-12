package com.zy.wreserve.service.impl;

import com.zy.wreserve.entity.Order;
import com.zy.wreserve.mapper.OrderMapper;
import com.zy.wreserve.service.IOrderService;
import com.zy.wreserve.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements IOrderService {

}
