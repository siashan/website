package com.web.site.entity.product;

import java.io.Serializable;

/**
 *   商品参数
 *
 * @author Small 2018-09-29
 * database table goods_params
 * @mbg.generated do_not_delete_during_merge
 */
public class GoodsParams implements Serializable {

	/**
     *   id
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   商品id
     *
     * @mbg.generated
     */
private Long goodsId;

	/**
     *   参数id
     *
     * @mbg.generated
     */
private Long paramsId;

	/**
     *   参数值
     *
     * @mbg.generated
     */
private String paramValue;

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
	public Long getGoodsId() {
	    return goodsId;
	}

	/**
	     * @mbg.generated
	     */
	public void setGoodsId(Long goodsId) {
	    this.goodsId = goodsId;
	}

	/**
	     * @mbg.generated
	     */
	public Long getParamsId() {
	    return paramsId;
	}

	/**
	     * @mbg.generated
	     */
	public void setParamsId(Long paramsId) {
	    this.paramsId = paramsId;
	}

	/**
	     * @mbg.generated
	     */
	public String getParamValue() {
	    return paramValue;
	}

	/**
	     * @mbg.generated
	     */
	public void setParamValue(String paramValue) {
	    this.paramValue = paramValue == null ? null : paramValue.trim();
	}


}