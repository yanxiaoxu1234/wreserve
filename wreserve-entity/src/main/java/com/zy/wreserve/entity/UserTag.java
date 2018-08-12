package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 工作人员标签表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class UserTag extends Model<UserTag> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "user_tag_id", type = IdType.AUTO)
    private Long user_tag_id;
    /**
     * 标签名称
     */
    private String tag_name;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getUser_tag_id() {
        return user_tag_id;
    }

    public void setUser_tag_id(Long user_tag_id) {
        this.user_tag_id = user_tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
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
        return this.user_tag_id;
    }

    @Override
    public String toString() {
        return "User_tag{" +
        "user_tag_id=" + user_tag_id +
        ", tag_name=" + tag_name +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
