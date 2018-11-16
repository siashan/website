package com.web.site.entity.product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *   商品类目表
 *
 * @author Small 2018-08-30
 * database table product_items
 * @mbg.generated do_not_delete_during_merge
 */
public class ProductItems implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Integer id;

	/**
     *   父id
     *
     * @mbg.generated
     */
private Integer parentId;

	/**
     *   类目名称
     *
     * @mbg.generated
     */
private String itemName;

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
private String itemLevel;

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
private String itemPath;

	/**
     * @mbg.generated
     */
private static final long serialVersionUID = 1L;

	private List<ProductItems> children;

	/**
	     * @mbg.generated
	     */
	public Integer getId() {
	    return id;
	}

	/**
	     * @mbg.generated
	     */
	public void setId(Integer id) {
	    this.id = id;
	}

	/**
	     * @mbg.generated
	     */
	public Integer getParentId() {
	    return parentId;
	}

	/**
	     * @mbg.generated
	     */
	public void setParentId(Integer parentId) {
	    this.parentId = parentId;
	}

	/**
	     * @mbg.generated
	     */
	public String getItemName() {
	    return itemName;
	}

	/**
	     * @mbg.generated
	     */
	public void setItemName(String itemName) {
	    this.itemName = itemName == null ? null : itemName.trim();
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
	public String getItemLevel() {
	    return itemLevel;
	}

	/**
	     * @mbg.generated
	     */
	public void setItemLevel(String itemLevel) {
	    this.itemLevel = itemLevel == null ? null : itemLevel.trim();
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
	public String getItemPath() {
	    return itemPath;
	}

	/**
	     * @mbg.generated
	     */
	public void setItemPath(String itemPath) {
	    this.itemPath = itemPath == null ? null : itemPath.trim();
	}

	public List<ProductItems> getChildren() {
	    return children;
	}

	public void setChildren(List<ProductItems> children) {
	    this.children = children;
	}


}