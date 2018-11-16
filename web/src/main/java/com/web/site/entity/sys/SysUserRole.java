package com.web.site.entity.sys;

import java.io.Serializable;

/**
 *
 * @author Small 2018-07-27
 * database table sys_user_role
 * @mbg.generated do_not_delete_during_merge
 */
public class SysUserRole implements Serializable {

	/**
     *   主键 自增
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   角色id
     *
     * @mbg.generated
     */
private Long roleId;

	/**
     *   用户id
     *
     * @mbg.generated
     */
private Long userId;

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
	public Long getRoleId() {
	    return roleId;
	}

	/**
	     * @mbg.generated
	     */
	public void setRoleId(Long roleId) {
	    this.roleId = roleId;
	}

	/**
	     * @mbg.generated
	     */
	public Long getUserId() {
	    return userId;
	}

	/**
	     * @mbg.generated
	     */
	public void setUserId(Long userId) {
	    this.userId = userId;
	}


}