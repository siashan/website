package com.web.site.entity.product;

import java.io.Serializable;

/**
 *
 * @author Small 2018-10-15
 * database table category_spec
 * @mbg.generated do_not_delete_during_merge
 */
public class CategorySpec implements Serializable {

	/**
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   叶子类目id
     *
     * @mbg.generated
     */
private Long categoryId;

	/**
     *   规格id
     *
     * @mbg.generated
     */
private Long specId;

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
	public Long getSpecId() {
	    return specId;
	}

	/**
	     * @mbg.generated
	     */
	public void setSpecId(Long specId) {
	    this.specId = specId;
	}


}