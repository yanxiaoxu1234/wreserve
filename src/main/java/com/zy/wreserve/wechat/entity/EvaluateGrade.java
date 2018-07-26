package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 评价登记表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("evaluate_grade")
public class EvaluateGrade extends Model<EvaluateGrade> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluate_grade_id", type = IdType.AUTO)
    private Long evaluateGradeId;
    @TableField("evaluate_grade_name")
    private String evaluateGradeName;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getEvaluateGradeId() {
        return evaluateGradeId;
    }

    public void setEvaluateGradeId(Long evaluateGradeId) {
        this.evaluateGradeId = evaluateGradeId;
    }

    public String getEvaluateGradeName() {
        return evaluateGradeName;
    }

    public void setEvaluateGradeName(String evaluateGradeName) {
        this.evaluateGradeName = evaluateGradeName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    protected Serializable pkVal() {
        return this.evaluateGradeId;
    }

    @Override
    public String toString() {
        return "EvaluateGrade{" +
        "evaluateGradeId=" + evaluateGradeId +
        ", evaluateGradeName=" + evaluateGradeName +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
