package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Long productId;
    @TableField("product_title")
    private String productTitle;
    @TableField("product_name")
    private String productName;
    @TableField("product_menu_id")
    private Long productMenuId;
    @TableField("product_price")
    private Integer productPrice;
    @TableField("product_img")
    private String productImg;
    private Integer sales;
    private Integer inventory;
    /**
     * 是否推荐 0否 1是
     */
    @TableField("is_recommend")
    private Integer isRecommend;
    @TableField("product_detail_img")
    private String productDetailImg;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductMenuId() {
        return productMenuId;
    }

    public void setProductMenuId(Long productMenuId) {
        this.productMenuId = productMenuId;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
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

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getProductDetailImg() {
        return productDetailImg;
    }

    public void setProductDetailImg(String productDetailImg) {
        this.productDetailImg = productDetailImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.productId;
    }

    @Override
    public String toString() {
        return "Product{" +
        "productId=" + productId +
        ", productTitle=" + productTitle +
        ", productName=" + productName +
        ", productMenuId=" + productMenuId +
        ", productPrice=" + productPrice +
        ", productImg=" + productImg +
        ", sales=" + sales +
        ", inventory=" + inventory +
        ", isRecommend=" + isRecommend +
        ", productDetailImg=" + productDetailImg +
        "}";
    }
}
