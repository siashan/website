package com.web.site.entity.sys;

import java.io.Serializable;
import java.util.Date;

/**
 *   系统日志
 *
 * @author Small 2018-07-27
 * database table sys_log
 * @mbg.generated do_not_delete_during_merge
 */
public class SysLog implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   操作人
     *
     * @mbg.generated
     */
private Long operator;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   访问连接
     *
     * @mbg.generated
     */
private String url;

	/**
     *   备注
     *
     * @mbg.generated
     */
private String remark;

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
	public Long getOperator() {
	    return operator;
	}

	/**
	     * @mbg.generated
	     */
	public void setOperator(Long operator) {
	    this.operator = operator;
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
	public String getUrl() {
	    return url;
	}

	/**
	     * @mbg.generated
	     */
	public void setUrl(String url) {
	    this.url = url == null ? null : url.trim();
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


}