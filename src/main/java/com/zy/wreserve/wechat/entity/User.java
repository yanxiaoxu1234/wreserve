package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;
    /**
     * 微信open_id
     */
    @TableField("open_id")
    private String openId;
    /**
     * 用户电话-账号
     */
    @TableField("user_phone")
    private String userPhone;
    /**
     * 0 会员 1员工
     */
    @TableField("role_id")
    private Integer roleId;
    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;
    /**
     * 性别 0女 1男
     */
    private Integer sex;
    /**
     * 用户状态 0正常 1锁定
     */
    private Integer status;
    @TableField("is_authorize")
    private Long isAuthorize;
    /**
     * 职务Id
     */
    @TableField("position_id")
    private Integer positionId;
    /**
     * 标签列表
     */
    @TableField("tag_list")
    private String tagList;
    /**
     * 好评率
     */
    @TableField("praise_average")
    private String praiseAverage;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getIsAuthorize() {
        return isAuthorize;
    }

    public void setIsAuthorize(Long isAuthorize) {
        this.isAuthorize = isAuthorize;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public String getPraiseAverage() {
        return praiseAverage;
    }

    public void setPraiseAverage(String praiseAverage) {
        this.praiseAverage = praiseAverage;
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
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", openId=" + openId +
        ", userPhone=" + userPhone +
        ", roleId=" + roleId +
        ", userName=" + userName +
        ", sex=" + sex +
        ", status=" + status +
        ", isAuthorize=" + isAuthorize +
        ", positionId=" + positionId +
        ", tagList=" + tagList +
        ", praiseAverage=" + praiseAverage +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
