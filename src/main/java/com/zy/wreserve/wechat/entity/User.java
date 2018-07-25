package com.zy.wreserve.wechat.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


/**
 * <p>
 * 
 * </p>
 *
 * @author Lucare
 * @since 2017-02-24
 */
@TableName("t_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String username;
	private String password;
	private String phone;
	private int state;
	private int sex;
	private String remarks;

	@TableField(exist = false)
	private List<Role> roleList;

	public User() {
	}

	public User(String username, String password, String phone) {
		this.username = username;
		this.password = password;
		this.phone = phone;
	}

	public User(Long id, String username, String phone) {
		this.id = id;
		this.username = username;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
