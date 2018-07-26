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
 * 商品菜单表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("product_menu")
public class ProductMenu extends Model<ProductMenu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_menu_id", type = IdType.AUTO)
    private Long productMenuId;
    @TableField("product_menu_name")
    private String productMenuName;
    private Integer sort;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getProductMenuId() {
        return productMenuId;
    }

    public void setProductMenuId(Long productMenuId) {
        this.productMenuId = productMenuId;
    }

    public String getProductMenuName() {
        return productMenuName;
    }

    public void setProductMenuName(String productMenuName) {
        this.productMenuName = productMenuName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        return this.productMenuId;
    }

    @Override
    public String toString() {
        return "ProductMenu{" +
        "productMenuId=" + productMenuId +
        ", productMenuName=" + productMenuName +
        ", sort=" + sort +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
