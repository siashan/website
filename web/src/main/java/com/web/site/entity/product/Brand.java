package com.web.site.entity.product;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Small 2018-09-29
 * database table brand
 * @mbg.generated do_not_delete_during_merge
 */
public class Brand implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   英文名称
     *
     * @mbg.generated
     */
private String enName;

	/**
     *   中文名称
     *
     * @mbg.generated
     */
private String chName;

	/**
     *   描述
     *
     * @mbg.generated
     */
private String desp;

	/**
     *   logo图片
     *
     * @mbg.generated
     */
private String logo;

	/**
     *   状态
     *
     * @mbg.generated
     */
private String status;

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
     *   官网地址
     *
     * @mbg.generated
     */
private String url;

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
	public String getEnName() {
	    return enName;
	}

	/**
	     * @mbg.generated
	     */
	public void setEnName(String enName) {
	    this.enName = enName == null ? null : enName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getChName() {
	    return chName;
	}

	/**
	     * @mbg.generated
	     */
	public void setChName(String chName) {
	    this.chName = chName == null ? null : chName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getDesp() {
	    return desp;
	}

	/**
	     * @mbg.generated
	     */
	public void setDesp(String desp) {
	    this.desp = desp == null ? null : desp.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getLogo() {
	    return logo;
	}

	/**
	     * @mbg.generated
	     */
	public void setLogo(String logo) {
	    this.logo = logo == null ? null : logo.trim();
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
	public String getUrl() {
	    return url;
	}

	/**
	     * @mbg.generated
	     */
	public void setUrl(String url) {
	    this.url = url == null ? null : url.trim();
	}


}