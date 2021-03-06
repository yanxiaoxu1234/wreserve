package com.zy.wreserve.wechat.service.impl;

import com.zy.wreserve.wechat.mapper.EvaluateGradeMapper;
import com.zy.wreserve.wechat.entity.EvaluateGrade;
import com.zy.wreserve.wechat.service.IEvaluateGradeService;
import com.zy.wreserve.wechat.service.support.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评价登记表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@Service
public class EvaluateGradeServiceImpl extends BaseServiceImpl<EvaluateGradeMapper, EvaluateGrade> implements IEvaluateGradeService {

    @Autowired
    private EvaluateGradeMapper evaluateGradeMapper;


    @Override
    public String selectEvaluateNameByid(int id) {
        EvaluateGrade id1 = evaluateGradeMapper.selectById(id);

        return id1.getEvaluate_grade_name();
    }
}
