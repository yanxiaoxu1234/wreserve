package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 服务项目表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class ReservationProject extends Model<ReservationProject> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "reservation_project_id", type = IdType.AUTO)
    private Long reservation_project_id;
    private String reservation_project_name;
    private Integer sort;


    public Long getReservation_project_id() {
        return reservation_project_id;
    }

    public void setReservation_project_id(Long reservation_project_id) {
        this.reservation_project_id = reservation_project_id;
    }

    public String getReservation_project_name() {
        return reservation_project_name;
    }

    public void setReservation_project_name(String reservation_project_name) {
        this.reservation_project_name = reservation_project_name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.reservation_project_id;
    }

    @Override
    public String toString() {
        return "Reservation_project{" +
        "reservation_project_id=" + reservation_project_id +
        ", reservation_project_name=" + reservation_project_name +
        ", sort=" + sort +
        "}";
    }
}
