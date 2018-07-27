package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 职务-项目关系表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
@TableName("position_project_realtion")
public class PositionProjectRealtion extends Model<PositionProjectRealtion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "position_project_realtion_id", type = IdType.AUTO)
    private Long position_project_realtion_id;
    private Long position_id;
    private Long project_id;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getPosition_project_realtion_id() {
        return position_project_realtion_id;
    }

    public void setPosition_project_realtion_id(Long position_project_realtion_id) {
        this.position_project_realtion_id = position_project_realtion_id;
    }

    public Long getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Long position_id) {
        this.position_id = position_id;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
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
        return this.position_project_realtion_id;
    }

    @Override
    public String toString() {
        return "Position_project_realtion{" +
        "position_project_realtion_id=" + position_project_realtion_id +
        ", position_id=" + position_id +
        ", project_id=" + project_id +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
