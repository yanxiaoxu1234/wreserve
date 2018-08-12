package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 积分表更表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class IntegralRecord extends Model<IntegralRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "integral_record_id", type = IdType.AUTO)
    private Long integral_record_id;
    /**
     * 积分变化类型 1线上 2线下
     */
    private Integer integral_record_type;
    /**
     * 变化类型 
     */
    private Integer change_type;
    /**
     * 积分变化数量
     */
    private Integer integral_number;
    private Long order_id;
    private String change_reason;
    /**
     * 变化类型 0增加 1减少
     */
    private Integer change_record_type;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getIntegral_record_id() {
        return integral_record_id;
    }

    public void setIntegral_record_id(Long integral_record_id) {
        this.integral_record_id = integral_record_id;
    }

    public Integer getIntegral_record_type() {
        return integral_record_type;
    }

    public void setIntegral_record_type(Integer integral_record_type) {
        this.integral_record_type = integral_record_type;
    }

    public Integer getChange_type() {
        return change_type;
    }

    public void setChange_type(Integer change_type) {
        this.change_type = change_type;
    }

    public Integer getIntegral_number() {
        return integral_number;
    }

    public void setIntegral_number(Integer integral_number) {
        this.integral_number = integral_number;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getChange_reason() {
        return change_reason;
    }

    public void setChange_reason(String change_reason) {
        this.change_reason = change_reason;
    }

    public Integer getChange_record_type() {
        return change_record_type;
    }

    public void setChange_record_type(Integer change_record_type) {
        this.change_record_type = change_record_type;
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

    public Integer getIs_del() {
        return is_del;
    }

    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }

    @Override
    protected Serializable pkVal() {
        return this.integral_record_id;
    }

    @Override
    public String toString() {
        return "Integral_record{" +
        "integral_record_id=" + integral_record_id +
        ", integral_record_type=" + integral_record_type +
        ", change_type=" + change_type +
        ", integral_number=" + integral_number +
        ", order_id=" + order_id +
        ", change_reason=" + change_reason +
        ", change_record_type=" + change_record_type +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
