package com.web.site.entity.sys;

import java.io.Serializable;

/**
 *
 * @author Small 2018-07-27
 * database table sys_dict
 * @mbg.generated do_not_delete_during_merge
 */
public class SysDict implements Serializable {

	/**
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   组别
     *
     * @mbg.generated
     */
private String dictGroup;

	/**
     *   code值
     *
     * @mbg.generated
     */
private String dictCode;

	/**
     *   名称
     *
     * @mbg.generated
     */
private String dictName;

	/**
     *   描述
     *
     * @mbg.generated
     */
private String dictDesp;

	/**
     *   排序
     *
     * @mbg.generated
     */
private Short orderBy;

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
	public String getDictGroup() {
	    return dictGroup;
	}

	/**
	     * @mbg.generated
	     */
	public void setDictGroup(String dictGroup) {
	    this.dictGroup = dictGroup == null ? null : dictGroup.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getDictCode() {
	    return dictCode;
	}

	/**
	     * @mbg.generated
	     */
	public void setDictCode(String dictCode) {
	    this.dictCode = dictCode == null ? null : dictCode.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getDictName() {
	    return dictName;
	}

	/**
	     * @mbg.generated
	     */
	public void setDictName(String dictName) {
	    this.dictName = dictName == null ? null : dictName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getDictDesp() {
	    return dictDesp;
	}

	/**
	     * @mbg.generated
	     */
	public void setDictDesp(String dictDesp) {
	    this.dictDesp = dictDesp == null ? null : dictDesp.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Short getOrderBy() {
	    return orderBy;
	}

	/**
	     * @mbg.generated
	     */
	public void setOrderBy(Short orderBy) {
	    this.orderBy = orderBy;
	}


}