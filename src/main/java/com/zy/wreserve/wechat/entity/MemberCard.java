package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 会员卡表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class MemberCard extends Model<MemberCard> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "member_card_id", type = IdType.AUTO)
    private Long member_card_id;
    private Long member_card_type_id;
    private String member_card_type_name;
    private String member_card_type_color;
    private Long user_id;
    private String member_card_number;
    private Integer remainder_price;
    private String discounts;
    private Integer is_forver;
    private Long create_time;
    private Long deadline;
    /**
     * 状态 0正常 1冻结
     */
    private Integer status;
    /**
     * 是否删除 0否 1是
     */
    private Integer is_del;


    public Long getMember_card_id() {
        return member_card_id;
    }

    public void setMember_card_id(Long member_card_id) {
        this.member_card_id = member_card_id;
    }

    public Long getMember_card_type_id() {
        return member_card_type_id;
    }

    public void setMember_card_type_id(Long member_card_type_id) {
        this.member_card_type_id = member_card_type_id;
    }

    public String getMember_card_type_name() {
        return member_card_type_name;
    }

    public void setMember_card_type_name(String member_card_type_name) {
        this.member_card_type_name = member_card_type_name;
    }

    public String getMember_card_type_color() {
        return member_card_type_color;
    }

    public void setMember_card_type_color(String member_card_type_color) {
        this.member_card_type_color = member_card_type_color;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getMember_card_number() {
        return member_card_number;
    }

    public void setMember_card_number(String member_card_number) {
        this.member_card_number = member_card_number;
    }

    public Integer getRemainder_price() {
        return remainder_price;
    }

    public void setRemainder_price(Integer remainder_price) {
        this.remainder_price = remainder_price;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public Integer getIs_forver() {
        return is_forver;
    }

    public void setIs_forver(Integer is_forver) {
        this.is_forver = is_forver;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIs_del() {
        return is_del;
    }

    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }

    @Override
    protected Serializable pkVal() {
        return this.member_card_id;
    }

    @Override
    public String toString() {
        return "Member_card{" +
        "member_card_id=" + member_card_id +
        ", member_card_type_id=" + member_card_type_id +
        ", member_card_type_name=" + member_card_type_name +
        ", member_card_type_color=" + member_card_type_color +
        ", user_id=" + user_id +
        ", member_card_number=" + member_card_number +
        ", remainder_price=" + remainder_price +
        ", discounts=" + discounts +
        ", is_forver=" + is_forver +
        ", create_time=" + create_time +
        ", deadline=" + deadline +
        ", status=" + status +
        ", is_del=" + is_del +
        "}";
    }
}
