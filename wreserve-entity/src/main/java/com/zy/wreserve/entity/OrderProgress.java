package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 订单状态记录表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class OrderProgress extends Model<OrderProgress> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_progress_id", type = IdType.AUTO)
    private Long order_progress_id;
    private Long order_id;
    private Integer order_status;
    private Integer pay_status;
    private Long operation_user_id;
    private Long create_time;
    private Long update_time;
    private Long is_del;


    public Long getOrder_progress_id() {
        return order_progress_id;
    }

    public void setOrder_progress_id(Long order_progress_id) {
        this.order_progress_id = order_progress_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Integer getPay_status() {
        return pay_status;
    }

    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    public Long getOperation_user_id() {
        return operation_user_id;
    }

    public void setOperation_user_id(Long operation_user_id) {
        this.operation_user_id = operation_user_id;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public Long getIs_del() {
        return is_del;
    }

    public void setIs_del(Long is_del) {
        this.is_del = is_del;
    }

    @Override
    protected Serializable pkVal() {
        return this.order_progress_id;
    }

    @Override
    public String toString() {
        return "Order_progress{" +
        "order_progress_id=" + order_progress_id +
        ", order_id=" + order_id +
        ", order_status=" + order_status +
        ", pay_status=" + pay_status +
        ", operation_user_id=" + operation_user_id +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
