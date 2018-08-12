package com.zy.wreserve.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 服务人员评价表
 * </p>
 *
 * @author zy
 * @since 2018-07-27
 */
public class EvaluateService extends Model<EvaluateService> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "evaluate_detail_id", type = IdType.AUTO)
    private Long evaluate_detail_id;
    private Long user_id;
    private Long service_user_id;
    private Integer evaluate_grade;
    private String evaluate_tag_name;
    private String evaluate_remark;
    private Long create_time;
    private Long update_time;
    private Integer is_del;


    public Long getEvaluate_detail_id() {
        return evaluate_detail_id;
    }

    public void setEvaluate_detail_id(Long evaluate_detail_id) {
        this.evaluate_detail_id = evaluate_detail_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getService_user_id() {
        return service_user_id;
    }

    public void setService_user_id(Long service_user_id) {
        this.service_user_id = service_user_id;
    }

    public Integer getEvaluate_grade() {
        return evaluate_grade;
    }

    public void setEvaluate_grade(Integer evaluate_grade) {
        this.evaluate_grade = evaluate_grade;
    }

    public String getEvaluate_tag_name() {
        return evaluate_tag_name;
    }

    public void setEvaluate_tag_name(String evaluate_tag_name) {
        this.evaluate_tag_name = evaluate_tag_name;
    }

    public String getEvaluate_remark() {
        return evaluate_remark;
    }

    public void setEvaluate_remark(String evaluate_remark) {
        this.evaluate_remark = evaluate_remark;
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
        return this.evaluate_detail_id;
    }

    @Override
    public String toString() {
        return "Evaluate_service{" +
        "evaluate_detail_id=" + evaluate_detail_id +
        ", user_id=" + user_id +
        ", service_user_id=" + service_user_id +
        ", evaluate_grade=" + evaluate_grade +
        ", evaluate_tag_name=" + evaluate_tag_name +
        ", evaluate_remark=" + evaluate_remark +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", is_del=" + is_del +
        "}";
    }
}
