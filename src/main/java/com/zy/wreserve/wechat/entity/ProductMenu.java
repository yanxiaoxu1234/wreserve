package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品菜单表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@TableName("product_menu")
public class ProductMenu extends Model<ProductMenu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_menu_id", type = IdType.AUTO)
    private Long product_menu_id;
    private String product_menu_name;
    private Integer sort;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getProduct_menu_id() {
        return product_menu_id;
    }

    public void setProduct_menu_id(Long product_menu_id) {
        this.product_menu_id = product_menu_id;
    }

    public String getProduct_menu_name() {
        return product_menu_name;
    }

    public void setProduct_menu_name(String product_menu_name) {
        this.product_menu_name = product_menu_name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        return this.product_menu_id;
    }

    @Override
    public String toString() {
        return "Product_menu{" +
        "product_menu_id=" + product_menu_id +
        ", product_menu_name=" + product_menu_name +
        ", sort=" + sort +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
