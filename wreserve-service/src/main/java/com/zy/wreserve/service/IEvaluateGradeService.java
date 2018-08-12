package com.zy.wreserve.service;

import com.baomidou.mybatisplus.service.IService;
import com.zy.wreserve.entity.EvaluateGrade;

/**
 * <p>
 * 评价登记表 服务类
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public interface IEvaluateGradeService extends IService<EvaluateGrade> {

    public String selectEvaluateNameByid(int id);

}
