package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 作品展示集
 * </p>
 *
 * @author zy123
 * @since 2018-07-25
 */
public class Works_show extends Model<Works_show> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "works_show_id", type = IdType.AUTO)
    private Long works_show_id;
    /**
     * 用户Id
     */
    private Long user_id;
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
    private Integer like_number;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getWorks_show_id() {
        return works_show_id;
    }

    public void setWorks_show_id(Long works_show_id) {
        this.works_show_id = works_show_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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

    public Integer getLike_number() {
        return like_number;
    }

    public void setLike_number(Integer like_number) {
        this.like_number = like_number;
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
        return this.works_show_id;
    }

    @Override
    public String toString() {
        return "Works_show{" +
        "works_show_id=" + works_show_id +
        ", user_id=" + user_id +
        ", pic1=" + pic1 +
        ", pic2=" + pic2 +
        ", pic3=" + pic3 +
        ", pic4=" + pic4 +
        ", pic5=" + pic5 +
        ", pic6=" + pic6 +
        ", remark=" + remark +
        ", price=" + price +
        ", like_number=" + like_number +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
