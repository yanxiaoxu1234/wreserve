package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 评价登记表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class EvaluateGrade extends Model<EvaluateGrade> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluate_grade_id", type = IdType.AUTO)
    private Long evaluate_grade_id;
    private String evaluate_grade_name;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getEvaluate_grade_id() {
        return evaluate_grade_id;
    }

    public void setEvaluate_grade_id(Long evaluate_grade_id) {
        this.evaluate_grade_id = evaluate_grade_id;
    }

    public String getEvaluate_grade_name() {
        return evaluate_grade_name;
    }

    public void setEvaluate_grade_name(String evaluate_grade_name) {
        this.evaluate_grade_name = evaluate_grade_name;
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
        return this.evaluate_grade_id;
    }

    @Override
    public String toString() {
        return "Evaluate_grade{" +
        "evaluate_grade_id=" + evaluate_grade_id +
        ", evaluate_grade_name=" + evaluate_grade_name +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
