package com.web.site.entity.product;

import java.io.Serializable;
import java.util.Date;

/**
 *   商品类目表
 *
 * @author Small 2018-09-29
 * database table category
 * @mbg.generated do_not_delete_during_merge
 */
public class Category implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   父id
     *
     * @mbg.generated
     */
private Long parentId;

	/**
     *   类目名称
     *
     * @mbg.generated
     */
private String catName;

	/**
     *   排序
     *
     * @mbg.generated
     */
private Integer orderBy;

	/**
     *   版本号
     *
     * @mbg.generated
     */
private Integer version;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   类别等级
     *
     * @mbg.generated
     */
private String catLevel;

	/**
     *   状态
     *
     * @mbg.generated
     */
private String status;

	/**
     *   当前分类定位
     *
     * @mbg.generated
     */
private String catPath;

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
	public Long getParentId() {
	    return parentId;
	}

	/**
	     * @mbg.generated
	     */
	public void setParentId(Long parentId) {
	    this.parentId = parentId;
	}

	/**
	     * @mbg.generated
	     */
	public String getCatName() {
	    return catName;
	}

	/**
	     * @mbg.generated
	     */
	public void setCatName(String catName) {
	    this.catName = catName == null ? null : catName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Integer getOrderBy() {
	    return orderBy;
	}

	/**
	     * @mbg.generated
	     */
	public void setOrderBy(Integer orderBy) {
	    this.orderBy = orderBy;
	}

	/**
	     * @mbg.generated
	     */
	public Integer getVersion() {
	    return version;
	}

	/**
	     * @mbg.generated
	     */
	public void setVersion(Integer version) {
	    this.version = version;
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
	public String getCatLevel() {
	    return catLevel;
	}

	/**
	     * @mbg.generated
	     */
	public void setCatLevel(String catLevel) {
	    this.catLevel = catLevel == null ? null : catLevel.trim();
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
	public String getCatPath() {
	    return catPath;
	}

	/**
	     * @mbg.generated
	     */
	public void setCatPath(String catPath) {
	    this.catPath = catPath == null ? null : catPath.trim();
	}


}