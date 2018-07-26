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
 * 服务人员评价表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("evaluate_service")
public class EvaluateService extends Model<EvaluateService> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluate_detail_id", type = IdType.AUTO)
    private Long evaluateDetailId;
    @TableField("user_id")
    private Long userId;
    @TableField("service_user_id")
    private Long serviceUserId;
    @TableField("evaluate_grade")
    private Integer evaluateGrade;
    @TableField("evaluate_tag_name")
    private String evaluateTagName;
    @TableField("evaluate_remark")
    private String evaluateRemark;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getEvaluateDetailId() {
        return evaluateDetailId;
    }

    public void setEvaluateDetailId(Long evaluateDetailId) {
        this.evaluateDetailId = evaluateDetailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getServiceUserId() {
        return serviceUserId;
    }

    public void setServiceUserId(Long serviceUserId) {
        this.serviceUserId = serviceUserId;
    }

    public Integer getEvaluateGrade() {
        return evaluateGrade;
    }

    public void setEvaluateGrade(Integer evaluateGrade) {
        this.evaluateGrade = evaluateGrade;
    }

    public String getEvaluateTagName() {
        return evaluateTagName;
    }

    public void setEvaluateTagName(String evaluateTagName) {
        this.evaluateTagName = evaluateTagName;
    }

    public String getEvaluateRemark() {
        return evaluateRemark;
    }

    public void setEvaluateRemark(String evaluateRemark) {
        this.evaluateRemark = evaluateRemark;
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
        return this.evaluateDetailId;
    }

    @Override
    public String toString() {
        return "EvaluateService{" +
        "evaluateDetailId=" + evaluateDetailId +
        ", userId=" + userId +
        ", serviceUserId=" + serviceUserId +
        ", evaluateGrade=" + evaluateGrade +
        ", evaluateTagName=" + evaluateTagName +
        ", evaluateRemark=" + evaluateRemark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
