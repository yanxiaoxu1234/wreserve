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
 * 作品展示评价表
 * </p>
 *
 * @author zy123
 * @since 2018-07-26
 */
@TableName("evaluate_works_show")
public class EvaluateWorksShow extends Model<EvaluateWorksShow> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "evaluate_works_show_id", type = IdType.AUTO)
    private Long evaluateWorksShowId;
    /**
     * 所在评论主Id
     */
    @TableField("evaluate_primary_id")
    private Long evaluatePrimaryId;
    /**
     * 作品Id
     */
    @TableField("works_show_id")
    private Long worksShowId;
    /**
     * 评论/回复内容
     */
    private String content;
    /**
     * 回复Id
     */
    @TableField("reply_id")
    private Long replyId;
    /**
     * 用户Id
     */
    @TableField("user_id")
    private Long userId;
    @TableField("create_time")
    private Long createTime;
    @TableField("update_time")
    private Long updateTime;
    @TableField("is_del")
    private Integer isDel;


    public Long getEvaluateWorksShowId() {
        return evaluateWorksShowId;
    }

    public void setEvaluateWorksShowId(Long evaluateWorksShowId) {
        this.evaluateWorksShowId = evaluateWorksShowId;
    }

    public Long getEvaluatePrimaryId() {
        return evaluatePrimaryId;
    }

    public void setEvaluatePrimaryId(Long evaluatePrimaryId) {
        this.evaluatePrimaryId = evaluatePrimaryId;
    }

    public Long getWorksShowId() {
        return worksShowId;
    }

    public void setWorksShowId(Long worksShowId) {
        this.worksShowId = worksShowId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
        return this.evaluateWorksShowId;
    }

    @Override
    public String toString() {
        return "EvaluateWorksShow{" +
        "evaluateWorksShowId=" + evaluateWorksShowId +
        ", evaluatePrimaryId=" + evaluatePrimaryId +
        ", worksShowId=" + worksShowId +
        ", content=" + content +
        ", replyId=" + replyId +
        ", userId=" + userId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDel=" + isDel +
        "}";
    }
}
