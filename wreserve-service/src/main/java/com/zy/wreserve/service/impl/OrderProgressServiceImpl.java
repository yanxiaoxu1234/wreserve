package com.zy.wreserve.service.impl;

import com.zy.wreserve.entity.OrderProgress;
import com.zy.wreserve.mapper.OrderProgressMapper;
import com.zy.wreserve.service.IOrderProgressService;
import com.zy.wreserve.service.support.BaseServiceImpl;
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
