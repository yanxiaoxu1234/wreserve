package com.zy.wreserve.wechat.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zy.wreserve.wechat.entity.MemberCard;
import com.zy.wreserve.wechat.mapper.MemberCardMapper;
import com.zy.wreserve.wechat.service.IMemberCardService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员卡表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@Service
public class MemberCardServiceImpl extends ServiceImpl<MemberCardMapper, MemberCard> implements IMemberCardService {

}
