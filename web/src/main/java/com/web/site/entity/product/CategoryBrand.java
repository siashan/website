package com.web.site.entity.product;

import java.io.Serializable;

/**
 *   类目-品牌关联表
 *
 * @author Small 2018-09-29
 * database table category_brand
 * @mbg.generated do_not_delete_during_merge
 */
public class CategoryBrand implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   类目id
     *
     * @mbg.generated
     */
private Long categoryId;

	/**
     *   品牌id
     *
     * @mbg.generated
     */
private Long brandId;

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
	public Long getCategoryId() {
	    return categoryId;
	}

	/**
	     * @mbg.generated
	     */
	public void setCategoryId(Long categoryId) {
	    this.categoryId = categoryId;
	}

	/**
	     * @mbg.generated
	     */
	public Long getBrandId() {
	    return brandId;
	}

	/**
	     * @mbg.generated
	     */
	public void setBrandId(Long brandId) {
	    this.brandId = brandId;
	}


}