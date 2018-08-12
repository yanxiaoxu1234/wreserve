package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 用户-角色表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 用户openid
     */
    private String open_id;
    /**
     * 角色ID
     */
    private Long role_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserRole{" +
        "id=" + id +
        ", open_id=" + open_id +
        ", role_id=" + role_id +
        "}";
    }
}
