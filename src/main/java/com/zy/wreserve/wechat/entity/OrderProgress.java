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
 * 订单状态记录表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("order_progress")
public class OrderProgress extends Model<OrderProgress> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_progress_id", type = IdType.AUTO)
    private Long orderProgressId;
    @TableField("order_id")
    private Long orderId;
    @TableField("order_status")
    private Integer orderStatus;
    @TableField("pay_status")
    private Integer payStatus;
    @TableField("operation_user_id")
    private Long operationUserId;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Long isDel;


    public Long getOrderProgressId() {
        return orderProgressId;
    }

    public void setOrderProgressId(Long orderProgressId) {
        this.orderProgressId = orderProgressId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
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

    public Long getIsDel() {
        return isDel;
    }

    public void setIsDel(Long isDel) {
        this.isDel = isDel;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderProgressId;
    }

    @Override
    public String toString() {
        return "OrderProgress{" +
        "orderProgressId=" + orderProgressId +
        ", orderId=" + orderId +
        ", orderStatus=" + orderStatus +
        ", payStatus=" + payStatus +
        ", operationUserId=" + operationUserId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
