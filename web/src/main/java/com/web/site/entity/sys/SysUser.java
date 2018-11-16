package com.web.site.entity.sys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Small 2018-09-29
 * database table sys_user
 * @mbg.generated do_not_delete_during_merge
 */
public class SysUser implements Serializable {

	/**
     *   主键 自增
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   真实姓名
     *
     * @mbg.generated
     */
private String realName;

	/**
     *   加密盐
     *
     * @mbg.generated
     */
private String salt;

	/**
     *   性别
     *
     * @mbg.generated
     */
private String gender;

	/**
     *   登录密码
     *
     * @mbg.generated
     */
private String password;

	/**
     *   联系电话
     *
     * @mbg.generated
     */
private String phoneNo;

	/**
     *   邮箱
     *
     * @mbg.generated
     */
private String email;

	/**
     *   创建日期
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   最近登录时间
     *
     * @mbg.generated
     */
private Date lastLoginDate;

	/**
     *   openID
     *
     * @mbg.generated
     */
private String openId;

	/**
     *   微信关注状态
     *
     * @mbg.generated
     */
private String wechatAttentionStatus;

	/**
     *   所属部门id
     *
     * @mbg.generated
     */
private Long deptId;

	/**
     *   状态
     *
     * @mbg.generated
     */
private String status;

	/**
     *   用户名
     *
     * @mbg.generated
     */
private String name;

	/**
     *   用户类型
     *
     * @mbg.generated
     */
private String userType;

	/**
     *   首次登陆是否修改过密码 0 没有 1 已修改
     *
     * @mbg.generated
     */
private String isPasswordChanged;

	/**
     * @mbg.generated
     */
private static final long serialVersionUID = 1L;

	private ArrayList<SysMenu> userMenus;

	private Set<String> shiroPerSet;

	/**
	     * @mbg.generated
	     */
	public Long getId() {
	    return id;
	}

	/**
	     * @mbg.generated
	     */
	public void setId(Long id) {
	    this.id = id;
	}

	/**
	     * @mbg.generated
	     */
	public String getRealName() {
	    return realName;
	}

	/**
	     * @mbg.generated
	     */
	public void setRealName(String realName) {
	    this.realName = realName == null ? null : realName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getSalt() {
	    return salt;
	}

	/**
	     * @mbg.generated
	     */
	public void setSalt(String salt) {
	    this.salt = salt == null ? null : salt.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getGender() {
	    return gender;
	}

	/**
	     * @mbg.generated
	     */
	public void setGender(String gender) {
	    this.gender = gender == null ? null : gender.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getPassword() {
	    return password;
	}

	/**
	     * @mbg.generated
	     */
	public void setPassword(String password) {
	    this.password = password == null ? null : password.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getPhoneNo() {
	    return phoneNo;
	}

	/**
	     * @mbg.generated
	     */
	public void setPhoneNo(String phoneNo) {
	    this.phoneNo = phoneNo == null ? null : phoneNo.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getEmail() {
	    return email;
	}

	/**
	     * @mbg.generated
	     */
	public void setEmail(String email) {
	    this.email = email == null ? null : email.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Date getCreateTime() {
	    return createTime;
	}

	/**
	     * @mbg.generated
	     */
	public void setCreateTime(Date createTime) {
	    this.createTime = createTime;
	}

	/**
	     * @mbg.generated
	     */
	public Date getLastLoginDate() {
	    return lastLoginDate;
	}

	/**
	     * @mbg.generated
	     */
	public void setLastLoginDate(Date lastLoginDate) {
	    this.lastLoginDate = lastLoginDate;
	}

	/**
	     * @mbg.generated
	     */
	public String getOpenId() {
	    return openId;
	}

	/**
	     * @mbg.generated
	     */
	public void setOpenId(String openId) {
	    this.openId = openId == null ? null : openId.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getWechatAttentionStatus() {
	    return wechatAttentionStatus;
	}

	/**
	     * @mbg.generated
	     */
	public void setWechatAttentionStatus(String wechatAttentionStatus) {
	    this.wechatAttentionStatus = wechatAttentionStatus == null ? null : wechatAttentionStatus.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Long getDeptId() {
	    return deptId;
	}

	/**
	     * @mbg.generated
	     */
	public void setDeptId(Long deptId) {
	    this.deptId = deptId;
	}

	/**
	     * @mbg.generated
	     */
	public String getStatus() {
	    return status;
	}

	/**
	     * @mbg.generated
	     */
	public void setStatus(String status) {
	    this.status = status == null ? null : status.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getName() {
	    return name;
	}

	/**
	     * @mbg.generated
	     */
	public void setName(String name) {
	    this.name = name == null ? null : name.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getUserType() {
	    return userType;
	}

	/**
	     * @mbg.generated
	     */
	public void setUserType(String userType) {
	    this.userType = userType == null ? null : userType.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getIsPasswordChanged() {
	    return isPasswordChanged;
	}

	/**
	     * @mbg.generated
	     */
	public void setIsPasswordChanged(String isPasswordChanged) {
	    this.isPasswordChanged = isPasswordChanged == null ? null : isPasswordChanged.trim();
	}

	public ArrayList<SysMenu> getUserMenus() {
	    return userMenus;
	}

	public void setUserMenus(ArrayList<SysMenu> userMenus) {
	    this.userMenus = userMenus;
	}

	public Set<String> getShiroPerSet() {
	    return shiroPerSet;
	}

	public void setShiroPerSet(Set<String> shiroPerSet) {
	    this.shiroPerSet = shiroPerSet;
	}


}