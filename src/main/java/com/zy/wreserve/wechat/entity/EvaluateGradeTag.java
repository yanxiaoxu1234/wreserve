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
 * 评价等级标签表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("evaluate_grade_tag")
public class EvaluateGradeTag extends Model<EvaluateGradeTag> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluate_grade_tag_id", type = IdType.AUTO)
    private Long evaluateGradeTagId;
    @TableField("evaluate_grade_id")
    private Long evaluateGradeId;
    @TableField("tag_name")
    private String tagName;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getEvaluateGradeTagId() {
        return evaluateGradeTagId;
    }

    public void setEvaluateGradeTagId(Long evaluateGradeTagId) {
        this.evaluateGradeTagId = evaluateGradeTagId;
    }

    public Long getEvaluateGradeId() {
        return evaluateGradeId;
    }

    public void setEvaluateGradeId(Long evaluateGradeId) {
        this.evaluateGradeId = evaluateGradeId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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
        return this.evaluateGradeTagId;
    }

    @Override
    public String toString() {
        return "EvaluateGradeTag{" +
        "evaluateGradeTagId=" + evaluateGradeTagId +
        ", evaluateGradeId=" + evaluateGradeId +
        ", tagName=" + tagName +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
