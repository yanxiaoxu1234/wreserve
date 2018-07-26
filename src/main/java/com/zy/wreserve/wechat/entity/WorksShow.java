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
 * 作品展示集
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("works_show")
public class WorksShow extends Model<WorksShow> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "works_show_id", type = IdType.AUTO)
    private Long worksShowId;
    /**
     * 用户Id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 作品1
     */
    private String pic1;
    /**
     * 作品2
     */
    private String pic2;
    /**
     * 作品3
     */
    private String pic3;
    /**
     * 作品4
     */
    private String pic4;
    /**
     * 作品5
     */
    private String pic5;
    /**
     * 作品6
     */
    private String pic6;
    /**
     * 备注
     */
    private String remark;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 点赞次数
     */
    @TableField("like_number")
    private Integer likeNumber;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getWorksShowId() {
        return worksShowId;
    }

    public void setWorksShowId(Long worksShowId) {
        this.worksShowId = worksShowId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5;
    }

    public String getPic6() {
        return pic6;
    }

    public void setPic6(String pic6) {
        this.pic6 = pic6;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
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
        return this.worksShowId;
    }

    @Override
    public String toString() {
        return "WorksShow{" +
        "worksShowId=" + worksShowId +
        ", userId=" + userId +
        ", pic1=" + pic1 +
        ", pic2=" + pic2 +
        ", pic3=" + pic3 +
        ", pic4=" + pic4 +
        ", pic5=" + pic5 +
        ", pic6=" + pic6 +
        ", remark=" + remark +
        ", price=" + price +
        ", likeNumber=" + likeNumber +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
