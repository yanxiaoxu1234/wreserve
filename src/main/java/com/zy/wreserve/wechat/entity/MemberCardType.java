package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 会员卡类型表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class MemberCardType extends Model<MemberCardType> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "member_card_type_id", type = IdType.AUTO)
    private Long member_card_type_id;
    private String member_card_type_name;
    /**
     * 最小单位分
     */
    private Integer member_type_price;
    private String member_card_type_color;
    private Long valid_time;
    /**
     * 折扣
     */
    private String discounts;
    /**
     * 是否永久 0否 1是
     */
    private Integer is_forever;
    private Long create_tame;
    private Long update_time;
    private Integer is_del;


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

    public Integer getMember_type_price() {
        return member_type_price;
    }

    public void setMember_type_price(Integer member_type_price) {
        this.member_type_price = member_type_price;
    }

    public String getMember_card_type_color() {
        return member_card_type_color;
    }

    public void setMember_card_type_color(String member_card_type_color) {
        this.member_card_type_color = member_card_type_color;
    }

    public Long getValid_time() {
        return valid_time;
    }

    public void setValid_time(Long valid_time) {
        this.valid_time = valid_time;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public Integer getIs_forever() {
        return is_forever;
    }

    public void setIs_forever(Integer is_forever) {
        this.is_forever = is_forever;
    }

    public Long getCreate_tame() {
        return create_tame;
    }

    public void setCreate_tame(Long create_tame) {
        this.create_tame = create_tame;
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
        return this.member_card_type_id;
    }

    @Override
    public String toString() {
        return "Member_card_type{" +
        "member_card_type_id=" + member_card_type_id +
        ", member_card_type_name=" + member_card_type_name +
        ", member_type_price=" + member_type_price +
        ", member_card_type_color=" + member_card_type_color +
        ", valid_time=" + valid_time +
        ", discounts=" + discounts +
        ", is_forever=" + is_forever +
        ", create_tame=" + create_tame +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
