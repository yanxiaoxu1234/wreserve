package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;
    @TableField("user_id")
    private Long userId;
    @TableField("order_sn")
    private String orderSn;
    /**
     * 状态 0 待处理  1已完成
     */
    @TableField("desk_status")
    private Integer deskStatus;
    /**
     * -1 已取消 0待接单 1已接单 2已发货 3已完成
     */
    private Integer status;
    /**
     * 支付状态 0未支付 1已支付
     */
    @TableField("pay_status")
    private Integer payStatus;
    /**
     * 支付方式 1微信 2其他
     */
    @TableField("pay_type")
    private Integer payType;
    @TableField("product_price")
    private Integer productPrice;
    @TableField("delivery_price")
    private Integer deliveryPrice;
    @TableField("tootal_price")
    private Integer tootalPrice;
    @TableField("address_detail")
    private String addressDetail;
    private String province;
    private String city;
    @TableField("add_conn_name")
    private String addConnName;
    @TableField("add_conn_phone")
    private String addConnPhone;
    /**
     * 性别 0女 1男
     */
    @TableField("add_conn_sex")
    private Integer addConnSex;
    @TableField("order_remark")
    private String orderRemark;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getDeskStatus() {
        return deskStatus;
    }

    public void setDeskStatus(Integer deskStatus) {
        this.deskStatus = deskStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Integer deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Integer getTootalPrice() {
        return tootalPrice;
    }

    public void setTootalPrice(Integer tootalPrice) {
        this.tootalPrice = tootalPrice;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddConnName() {
        return addConnName;
    }

    public void setAddConnName(String addConnName) {
        this.addConnName = addConnName;
    }

    public String getAddConnPhone() {
        return addConnPhone;
    }

    public void setAddConnPhone(String addConnPhone) {
        this.addConnPhone = addConnPhone;
    }

    public Integer getAddConnSex() {
        return addConnSex;
    }

    public void setAddConnSex(Integer addConnSex) {
        this.addConnSex = addConnSex;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
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
        return this.orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderId=" + orderId +
        ", userId=" + userId +
        ", orderSn=" + orderSn +
        ", deskStatus=" + deskStatus +
        ", status=" + status +
        ", payStatus=" + payStatus +
        ", payType=" + payType +
        ", productPrice=" + productPrice +
        ", deliveryPrice=" + deliveryPrice +
        ", tootalPrice=" + tootalPrice +
        ", addressDetail=" + addressDetail +
        ", province=" + province +
        ", city=" + city +
        ", addConnName=" + addConnName +
        ", addConnPhone=" + addConnPhone +
        ", addConnSex=" + addConnSex +
        ", orderRemark=" + orderRemark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
