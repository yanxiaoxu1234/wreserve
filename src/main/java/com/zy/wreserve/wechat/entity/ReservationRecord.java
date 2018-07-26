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
 * 预约记录表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("reservation_record")
public class ReservationRecord extends Model<ReservationRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "reservation_record_id", type = IdType.AUTO)
    private Long reservationRecordId;
    @TableField("user_id")
    private Long userId;
    @TableField("service_user_id")
    private Long serviceUserId;
    @TableField("service_user_name")
    private String serviceUserName;
    @TableField("reservation_time")
    private Long reservationTime;
    @TableField("reservation_project")
    private Integer reservationProject;
    @TableField("reservation_project_name")
    private String reservationProjectName;
    @TableField("reservation_number")
    private Integer reservationNumber;
    @TableField("reservation_remark")
    private String reservationRemark;
    /**
     * 预约状态 -1已取消 0已预约 1已完成
     */
    private Integer status;
    /**
     * 通知
     */
    private String advice;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getReservationRecordId() {
        return reservationRecordId;
    }

    public void setReservationRecordId(Long reservationRecordId) {
        this.reservationRecordId = reservationRecordId;
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

    public String getServiceUserName() {
        return serviceUserName;
    }

    public void setServiceUserName(String serviceUserName) {
        this.serviceUserName = serviceUserName;
    }

    public Long getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Long reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Integer getReservationProject() {
        return reservationProject;
    }

    public void setReservationProject(Integer reservationProject) {
        this.reservationProject = reservationProject;
    }

    public String getReservationProjectName() {
        return reservationProjectName;
    }

    public void setReservationProjectName(String reservationProjectName) {
        this.reservationProjectName = reservationProjectName;
    }

    public Integer getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(Integer reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getReservationRemark() {
        return reservationRemark;
    }

    public void setReservationRemark(String reservationRemark) {
        this.reservationRemark = reservationRemark;
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
        return this.reservationRecordId;
    }

    @Override
    public String toString() {
        return "ReservationRecord{" +
        "reservationRecordId=" + reservationRecordId +
        ", userId=" + userId +
        ", serviceUserId=" + serviceUserId +
        ", serviceUserName=" + serviceUserName +
        ", reservationTime=" + reservationTime +
        ", reservationProject=" + reservationProject +
        ", reservationProjectName=" + reservationProjectName +
        ", reservationNumber=" + reservationNumber +
        ", reservationRemark=" + reservationRemark +
        ", status=" + status +
        ", advice=" + advice +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
