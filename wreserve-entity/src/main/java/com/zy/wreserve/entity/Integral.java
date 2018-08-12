package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 积分表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class Integral extends Model<Integral> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "integral_id", type = IdType.AUTO)
    private Long integral_id;
    private Long user_id;
    private Integer online_integral;
    private Integer offline_integral;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getIntegral_id() {
        return integral_id;
    }

    public void setIntegral_id(Long integral_id) {
        this.integral_id = integral_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getOnline_integral() {
        return online_integral;
    }

    public void setOnline_integral(Integer online_integral) {
        this.online_integral = online_integral;
    }

    public Integer getOffline_integral() {
        return offline_integral;
    }

    public void setOffline_integral(Integer offline_integral) {
        this.offline_integral = offline_integral;
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
        return this.integral_id;
    }

    @Override
    public String toString() {
        return "Integral{" +
        "integral_id=" + integral_id +
        ", user_id=" + user_id +
        ", online_integral=" + online_integral +
        ", offline_integral=" + offline_integral +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
