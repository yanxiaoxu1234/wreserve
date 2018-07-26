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
 * 职务-项目关系表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("position_project_realtion")
public class PositionProjectRealtion extends Model<PositionProjectRealtion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "position_project_realtion_id", type = IdType.AUTO)
    private Long positionProjectRealtionId;
    @TableField("position_id")
    private Long positionId;
    @TableField("project_id")
    private Long projectId;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getPositionProjectRealtionId() {
        return positionProjectRealtionId;
    }

    public void setPositionProjectRealtionId(Long positionProjectRealtionId) {
        this.positionProjectRealtionId = positionProjectRealtionId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
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
        return this.positionProjectRealtionId;
    }

    @Override
    public String toString() {
        return "PositionProjectRealtion{" +
        "positionProjectRealtionId=" + positionProjectRealtionId +
        ", positionId=" + positionId +
        ", projectId=" + projectId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
