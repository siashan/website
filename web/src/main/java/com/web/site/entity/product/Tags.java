package com.web.site.entity.product;

import java.io.Serializable;

/**
 *
 * @author Small 2018-09-29
 * database table tags
 * @mbg.generated do_not_delete_during_merge
 */
public class Tags implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   标签名称
     *
     * @mbg.generated
     */
private String tagName;

	/**
     *   标签类型（1，商品；2 品牌）
     *
     * @mbg.generated
     */
private String tagType;

	/**
     *   排序字段
     *
     * @mbg.generated
     */
private String orderBy;

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
	public String getTagName() {
	    return tagName;
	}

	/**
	     * @mbg.generated
	     */
	public void setTagName(String tagName) {
	    this.tagName = tagName == null ? null : tagName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getTagType() {
	    return tagType;
	}

	/**
	     * @mbg.generated
	     */
	public void setTagType(String tagType) {
	    this.tagType = tagType == null ? null : tagType.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getOrderBy() {
	    return orderBy;
	}

	/**
	     * @mbg.generated
	     */
	public void setOrderBy(String orderBy) {
	    this.orderBy = orderBy == null ? null : orderBy.trim();
	}


}