package com.zy.wreserve.wechat.service.impl;

import com.zy.wreserve.wechat.entity.Product;
import com.zy.wreserve.wechat.mapper.ProductMapper;
import com.zy.wreserve.wechat.service.IProductService;
import com.zy.wreserve.wechat.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<ProductMapper, Product> implements IProductService {

}
