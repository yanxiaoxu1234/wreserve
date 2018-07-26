package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 作品展示评价表
 * </p>
 *
 * @author zy123
 * @since 2018-07-25
 */
public class Evaluate_works_show extends Model<Evaluate_works_show> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "evaluate_works_show_id", type = IdType.AUTO)
    private Long evaluate_works_show_id;
    /**
     * 所在评论主Id
     */
    private Long evaluate_primary_id;
    /**
     * 作品Id
     */
    private Long works_show_id;
    /**
     * 评论/回复内容
     */
    private String content;
    /**
     * 回复Id
     */
    private Long reply_id;
    /**
     * 用户Id
     */
    private Long user_id;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getEvaluate_works_show_id() {
        return evaluate_works_show_id;
    }

    public void setEvaluate_works_show_id(Long evaluate_works_show_id) {
        this.evaluate_works_show_id = evaluate_works_show_id;
    }

    public Long getEvaluate_primary_id() {
        return evaluate_primary_id;
    }

    public void setEvaluate_primary_id(Long evaluate_primary_id) {
        this.evaluate_primary_id = evaluate_primary_id;
    }

    public Long getWorks_show_id() {
        return works_show_id;
    }

    public void setWorks_show_id(Long works_show_id) {
        this.works_show_id = works_show_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getReply_id() {
        return reply_id;
    }

    public void setReply_id(Long reply_id) {
        this.reply_id = reply_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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
        return this.evaluate_works_show_id;
    }

    @Override
    public String toString() {
        return "Evaluate_works_show{" +
        "evaluate_works_show_id=" + evaluate_works_show_id +
        ", evaluate_primary_id=" + evaluate_primary_id +
        ", works_show_id=" + works_show_id +
        ", content=" + content +
        ", reply_id=" + reply_id +
        ", user_id=" + user_id +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
