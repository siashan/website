package com.web.site.entity.admin;

import java.io.Serializable;

/**
 *   行政区划
 *
 * @author Small 2018-09-29
 * database table city_area
 * @mbg.generated do_not_delete_during_merge
 */
public class CityArea implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   行政区划代码
     *
     * @mbg.generated
     */
private String areaCode;

	/**
     *   行政区划名称
     *
     * @mbg.generated
     */
private String areaName;

	/**
     *   级别
     *
     * @mbg.generated
     */
private String areaLevel;

	/**
     *   父类区划代码
     *
     * @mbg.generated
     */
private String parentCode;

	/**
     *   邮编
     *
     * @mbg.generated
     */
private String zipCode;

	/**
     *   版本号
     *
     * @mbg.generated
     */
private Byte version;

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
	public String getAreaCode() {
	    return areaCode;
	}

	/**
	     * @mbg.generated
	     */
	public void setAreaCode(String areaCode) {
	    this.areaCode = areaCode == null ? null : areaCode.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getAreaName() {
	    return areaName;
	}

	/**
	     * @mbg.generated
	     */
	public void setAreaName(String areaName) {
	    this.areaName = areaName == null ? null : areaName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getAreaLevel() {
	    return areaLevel;
	}

	/**
	     * @mbg.generated
	     */
	public void setAreaLevel(String areaLevel) {
	    this.areaLevel = areaLevel == null ? null : areaLevel.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getParentCode() {
	    return parentCode;
	}

	/**
	     * @mbg.generated
	     */
	public void setParentCode(String parentCode) {
	    this.parentCode = parentCode == null ? null : parentCode.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getZipCode() {
	    return zipCode;
	}

	/**
	     * @mbg.generated
	     */
	public void setZipCode(String zipCode) {
	    this.zipCode = zipCode == null ? null : zipCode.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Byte getVersion() {
	    return version;
	}

	/**
	     * @mbg.generated
	     */
	public void setVersion(Byte version) {
	    this.version = version;
	}


}