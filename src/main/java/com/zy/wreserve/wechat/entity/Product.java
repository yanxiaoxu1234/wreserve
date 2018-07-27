package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Long product_id;
    private String product_title;
    private String product_name;
    private Long product_menu_id;
    private Integer product_price;
    private String product_img;
    private Integer sales;
    private Integer inventory;
    /**
     * 是否推荐 0否 1是
     */
    private Integer is_recommend;
    private String product_detail_img;


    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getProduct_menu_id() {
        return product_menu_id;
    }

    public void setProduct_menu_id(Long product_menu_id) {
        this.product_menu_id = product_menu_id;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getIs_recommend() {
        return is_recommend;
    }

    public void setIs_recommend(Integer is_recommend) {
        this.is_recommend = is_recommend;
    }

    public String getProduct_detail_img() {
        return product_detail_img;
    }

    public void setProduct_detail_img(String product_detail_img) {
        this.product_detail_img = product_detail_img;
    }

    @Override
    protected Serializable pkVal() {
        return this.product_id;
    }

    @Override
    public String toString() {
        return "Product{" +
        "product_id=" + product_id +
        ", product_title=" + product_title +
        ", product_name=" + product_name +
        ", product_menu_id=" + product_menu_id +
        ", product_price=" + product_price +
        ", product_img=" + product_img +
        ", sales=" + sales +
        ", inventory=" + inventory +
        ", is_recommend=" + is_recommend +
        ", product_detail_img=" + product_detail_img +
        "}";
    }
}
