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
 * 积分表更表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("integral_record")
public class IntegralRecord extends Model<IntegralRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "integral_record_id", type = IdType.AUTO)
    private Long integralRecordId;
    /**
     * 积分变化类型 1线上 2线下
     */
    @TableField("integral_record_type")
    private Integer integralRecordType;
    /**
     * 变化类型 
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 积分变化数量
     */
    @TableField("integral_number")
    private Integer integralNumber;
    @TableField("order_id")
    private Long orderId;
    @TableField("change_reason")
    private String changeReason;
    /**
     * 变化类型 0增加 1减少
     */
    @TableField("change_record_type")
    private Integer changeRecordType;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getIntegralRecordId() {
        return integralRecordId;
    }

    public void setIntegralRecordId(Long integralRecordId) {
        this.integralRecordId = integralRecordId;
    }

    public Integer getIntegralRecordType() {
        return integralRecordType;
    }

    public void setIntegralRecordType(Integer integralRecordType) {
        this.integralRecordType = integralRecordType;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getIntegralNumber() {
        return integralNumber;
    }

    public void setIntegralNumber(Integer integralNumber) {
        this.integralNumber = integralNumber;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public Integer getChangeRecordType() {
        return changeRecordType;
    }

    public void setChangeRecordType(Integer changeRecordType) {
        this.changeRecordType = changeRecordType;
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
        return this.integralRecordId;
    }

    @Override
    public String toString() {
        return "IntegralRecord{" +
        "integralRecordId=" + integralRecordId +
        ", integralRecordType=" + integralRecordType +
        ", changeType=" + changeType +
        ", integralNumber=" + integralNumber +
        ", orderId=" + orderId +
        ", changeReason=" + changeReason +
        ", changeRecordType=" + changeRecordType +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
