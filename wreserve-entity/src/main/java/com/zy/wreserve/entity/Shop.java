package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 商家表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class Shop extends Model<Shop> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shop_id", type = IdType.AUTO)
    private Long shop_id;
    /**
     * 商家名称
     */
    private String shop_name;
    /**
     * 商家电话
     */
    private String shop_phone;
    /**
     * 商家地址详情
     */
    private String shop_address_detail;
    private String shop_img;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_phone() {
        return shop_phone;
    }

    public void setShop_phone(String shop_phone) {
        this.shop_phone = shop_phone;
    }

    public String getShop_address_detail() {
        return shop_address_detail;
    }

    public void setShop_address_detail(String shop_address_detail) {
        this.shop_address_detail = shop_address_detail;
    }

    public String getShop_img() {
        return shop_img;
    }

    public void setShop_img(String shop_img) {
        this.shop_img = shop_img;
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
        return this.shop_id;
    }

    @Override
    public String toString() {
        return "Shop{" +
        "shop_id=" + shop_id +
        ", shop_name=" + shop_name +
        ", shop_phone=" + shop_phone +
        ", shop_address_detail=" + shop_address_detail +
        ", shop_img=" + shop_img +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
