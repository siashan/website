package com.web.site.entity.sys;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Small 2018-07-27
 * database table sys_role
 * @mbg.generated do_not_delete_during_merge
 */
public class SysRole implements Serializable {

	/**
     *   主键 自增
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   角色名称
     *
     * @mbg.generated
     */
private String name;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   备注
     *
     * @mbg.generated
     */
private String remark;

	/**
     *   状态 0 禁用 1可用
     *
     * @mbg.generated
     */
private String status;

	/**
     * @mbg.generated
     */
private static final long serialVersionUID = 1L;

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
	public String getRemark() {
	    return remark;
	}

	/**
	     * @mbg.generated
	     */
	public void setRemark(String remark) {
	    this.remark = remark == null ? null : remark.trim();
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


}