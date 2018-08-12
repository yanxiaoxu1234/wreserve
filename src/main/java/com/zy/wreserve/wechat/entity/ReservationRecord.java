package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 预约记录表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class ReservationRecord extends Model<ReservationRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "reservation_record_id", type = IdType.AUTO)
    private Long reservation_record_id;
    private Long user_id;
    private Long service_user_id;
    private String service_user_name;
    private Long reservation_time;
    private Integer reservation_project;
    private String reservation_project_name;
    private Integer reservation_number;
    private String reservation_remark;
    /**
     * 预约状态 -1已取消 0已预约 1已完成
     */
    private Integer status;
    /**
     * 通知
     */
    private String advice;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getReservation_record_id() {
        return reservation_record_id;
    }

    public void setReservation_record_id(Long reservation_record_id) {
        this.reservation_record_id = reservation_record_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getService_user_id() {
        return service_user_id;
    }

    public void setService_user_id(Long service_user_id) {
        this.service_user_id = service_user_id;
    }

    public String getService_user_name() {
        return service_user_name;
    }

    public void setService_user_name(String service_user_name) {
        this.service_user_name = service_user_name;
    }

    public Long getReservation_time() {
        return reservation_time;
    }

    public void setReservation_time(Long reservation_time) {
        this.reservation_time = reservation_time;
    }

    public Integer getReservation_project() {
        return reservation_project;
    }

    public void setReservation_project(Integer reservation_project) {
        this.reservation_project = reservation_project;
    }

    public String getReservation_project_name() {
        return reservation_project_name;
    }

    public void setReservation_project_name(String reservation_project_name) {
        this.reservation_project_name = reservation_project_name;
    }

    public Integer getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(Integer reservation_number) {
        this.reservation_number = reservation_number;
    }

    public String getReservation_remark() {
        return reservation_remark;
    }

    public void setReservation_remark(String reservation_remark) {
        this.reservation_remark = reservation_remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
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
        return this.reservation_record_id;
    }

    @Override
    public String toString() {
        return "Reservation_record{" +
        "reservation_record_id=" + reservation_record_id +
        ", user_id=" + user_id +
        ", service_user_id=" + service_user_id +
        ", service_user_name=" + service_user_name +
        ", reservation_time=" + reservation_time +
        ", reservation_project=" + reservation_project +
        ", reservation_project_name=" + reservation_project_name +
        ", reservation_number=" + reservation_number +
        ", reservation_remark=" + reservation_remark +
        ", status=" + status +
        ", advice=" + advice +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
