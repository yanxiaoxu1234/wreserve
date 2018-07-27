package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    private Long order_id;
    private Long user_id;
    private String order_sn;
    /**
     * 状态 0 待处理  1已完成
     */
    private Integer desk_status;
    /**
     * -1 已取消 0待接单 1已接单 2已发货 3已完成
     */
    private Integer status;
    /**
     * 支付状态 0未支付 1已支付
     */
    private Integer pay_status;
    /**
     * 支付方式 1微信 2其他
     */
    private Integer pay_type;
    private Integer product_price;
    private Integer delivery_price;
    private Integer tootal_price;
    private String address_detail;
    private String province;
    private String city;
    private String add_conn_name;
    private String add_conn_phone;
    /**
     * 性别 0女 1男
     */
    private Integer add_conn_sex;
    private String order_remark;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Integer getDesk_status() {
        return desk_status;
    }

    public void setDesk_status(Integer desk_status) {
        this.desk_status = desk_status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPay_status() {
        return pay_status;
    }

    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public Integer getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(Integer delivery_price) {
        this.delivery_price = delivery_price;
    }

    public Integer getTootal_price() {
        return tootal_price;
    }

    public void setTootal_price(Integer tootal_price) {
        this.tootal_price = tootal_price;
    }

    public String getAddress_detail() {
        return address_detail;
    }

    public void setAddress_detail(String address_detail) {
        this.address_detail = address_detail;
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

    public String getAdd_conn_name() {
        return add_conn_name;
    }

    public void setAdd_conn_name(String add_conn_name) {
        this.add_conn_name = add_conn_name;
    }

    public String getAdd_conn_phone() {
        return add_conn_phone;
    }

    public void setAdd_conn_phone(String add_conn_phone) {
        this.add_conn_phone = add_conn_phone;
    }

    public Integer getAdd_conn_sex() {
        return add_conn_sex;
    }

    public void setAdd_conn_sex(Integer add_conn_sex) {
        this.add_conn_sex = add_conn_sex;
    }

    public String getOrder_remark() {
        return order_remark;
    }

    public void setOrder_remark(String order_remark) {
        this.order_remark = order_remark;
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
        return this.order_id;
    }

    @Override
    public String toString() {
        return "Order{" +
        "order_id=" + order_id +
        ", user_id=" + user_id +
        ", order_sn=" + order_sn +
        ", desk_status=" + desk_status +
        ", status=" + status +
        ", pay_status=" + pay_status +
        ", pay_type=" + pay_type +
        ", product_price=" + product_price +
        ", delivery_price=" + delivery_price +
        ", tootal_price=" + tootal_price +
        ", address_detail=" + address_detail +
        ", province=" + province +
        ", city=" + city +
        ", add_conn_name=" + add_conn_name +
        ", add_conn_phone=" + add_conn_phone +
        ", add_conn_sex=" + add_conn_sex +
        ", order_remark=" + order_remark +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
