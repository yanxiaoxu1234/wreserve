package com.zy.wreserve.wechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 评价等级标签表
 * </p>
 *
 * @author zy123
 * @since 2018-07-25
 */
public class Evaluate_grade_tag extends Model<Evaluate_grade_tag> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluate_grade_tag_id", type = IdType.AUTO)
    private Long evaluate_grade_tag_id;
    private Long evaluate_grade_id;
    private String tag_name;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getEvaluate_grade_tag_id() {
        return evaluate_grade_tag_id;
    }

    public void setEvaluate_grade_tag_id(Long evaluate_grade_tag_id) {
        this.evaluate_grade_tag_id = evaluate_grade_tag_id;
    }

    public Long getEvaluate_grade_id() {
        return evaluate_grade_id;
    }

    public void setEvaluate_grade_id(Long evaluate_grade_id) {
        this.evaluate_grade_id = evaluate_grade_id;
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
        return this.evaluate_grade_tag_id;
    }

    @Override
    public String toString() {
        return "Evaluate_grade_tag{" +
        "evaluate_grade_tag_id=" + evaluate_grade_tag_id +
        ", evaluate_grade_id=" + evaluate_grade_id +
        ", tag_name=" + tag_name +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
