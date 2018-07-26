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
 * 服务项目表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("reservation_project")
public class ReservationProject extends Model<ReservationProject> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "reservation_project_id", type = IdType.AUTO)
    private Long reservationProjectId;
    @TableField("reservation_project_name")
    private String reservationProjectName;
    private Integer sort;


    public Long getReservationProjectId() {
        return reservationProjectId;
    }

    public void setReservationProjectId(Long reservationProjectId) {
        this.reservationProjectId = reservationProjectId;
    }

    public String getReservationProjectName() {
        return reservationProjectName;
    }

    public void setReservationProjectName(String reservationProjectName) {
        this.reservationProjectName = reservationProjectName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.reservationProjectId;
    }

    @Override
    public String toString() {
        return "ReservationProject{" +
        "reservationProjectId=" + reservationProjectId +
        ", reservationProjectName=" + reservationProjectName +
        ", sort=" + sort +
        "}";
    }
}
