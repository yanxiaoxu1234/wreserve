package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户微信信息表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("user_wechat")
public class UserWechat extends Model<UserWechat> {

    private static final long serialVersionUID = 1L;

    /**
     * 微信唯一标识
     */
    private String openId;
    private String subscribe;
    private String nickname;
    private Integer sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headImgUrl;
    private Long subscribeTime;
    private String unionId;
    private Integer sexId;
    private String remark;
    private Long groupId;
    private Long tagIds;
    /**
     * 是否删除 0否 1是
     */
    @TableField("is_del")
    private Integer isDel;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Long getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Long subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getTagIds() {
        return tagIds;
    }

    public void setTagIds(Long tagIds) {
        this.tagIds = tagIds;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    @Override
    protected Serializable pkVal() {
        return this.openId;
    }

    @Override
    public String toString() {
        return "UserWechat{" +
        "openId=" + openId +
        ", subscribe=" + subscribe +
        ", nickname=" + nickname +
        ", sex=" + sex +
        ", language=" + language +
        ", city=" + city +
        ", province=" + province +
        ", country=" + country +
        ", headImgUrl=" + headImgUrl +
        ", subscribeTime=" + subscribeTime +
        ", unionId=" + unionId +
        ", sexId=" + sexId +
        ", remark=" + remark +
        ", groupId=" + groupId +
        ", tagIds=" + tagIds +
        ", isDel=" + isDel +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
