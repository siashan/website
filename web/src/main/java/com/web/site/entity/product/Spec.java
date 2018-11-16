package com.web.site.entity.product;

import java.io.Serializable;
import java.util.Date;

/**
 *   规格
 *
 * @author Small 2018-09-29
 * database table spec
 * @mbg.generated do_not_delete_during_merge
 */
public class Spec implements Serializable {

	/**
     *   规格名称
     *
     * @mbg.generated
     */
private Long id;

	/**
     *
     * @mbg.generated
     */
private String specName;

	/**
     *   展示类型（文字1，图片2）
     *
     * @mbg.generated
     */
private String showType;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

	/**
     *   版本号
     *
     * @mbg.generated
     */
private Integer version;

	/**
     *   排序
     *
     * @mbg.generated
     */
private Integer orderBy;

	/**
     *   规格状态
     *
     * @mbg.generated
     */
private String showStatus;

	/**
     *   规格描述
     *
     * @mbg.generated
     */
private String specMeno;

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
	public String getSpecName() {
	    return specName;
	}

	/**
	     * @mbg.generated
	     */
	public void setSpecName(String specName) {
	    this.specName = specName == null ? null : specName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getShowType() {
	    return showType;
	}

	/**
	     * @mbg.generated
	     */
	public void setShowType(String showType) {
	    this.showType = showType == null ? null : showType.trim();
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
	public String getShowStatus() {
	    return showStatus;
	}

	/**
	     * @mbg.generated
	     */
	public void setShowStatus(String showStatus) {
	    this.showStatus = showStatus == null ? null : showStatus.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getSpecMeno() {
	    return specMeno;
	}

	/**
	     * @mbg.generated
	     */
	public void setSpecMeno(String specMeno) {
	    this.specMeno = specMeno == null ? null : specMeno.trim();
	}


}