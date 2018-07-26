package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 积分表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
public class Integral extends Model<Integral> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "integral_id", type = IdType.AUTO)
    private Long integralId;
    @TableField("user_id")
    private Long userId;
    @TableField("online_integral")
    private Integer onlineIntegral;
    @TableField("offline_integral")
    private Integer offlineIntegral;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Long integralId) {
        this.integralId = integralId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getOnlineIntegral() {
        return onlineIntegral;
    }

    public void setOnlineIntegral(Integer onlineIntegral) {
        this.onlineIntegral = onlineIntegral;
    }

    public Integer getOfflineIntegral() {
        return offlineIntegral;
    }

    public void setOfflineIntegral(Integer offlineIntegral) {
        this.offlineIntegral = offlineIntegral;
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
        return this.integralId;
    }

    @Override
    public String toString() {
        return "Integral{" +
        "integralId=" + integralId +
        ", userId=" + userId +
        ", onlineIntegral=" + onlineIntegral +
        ", offlineIntegral=" + offlineIntegral +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
