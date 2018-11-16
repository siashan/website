package com.web.site.entity.product;

import java.io.Serializable;

/**
 *   商品规格sku
 *
 * @author Small 2018-10-15
 * database table goods_spec
 * @mbg.generated do_not_delete_during_merge
 */
public class GoodsSpec implements Serializable {

	/**
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
     *   规格id
     *
     * @mbg.generated
     */
private Long specId;

	/**
     *   规格值id
     *
     * @mbg.generated
     */
private Long specValueId;

	/**
     *   货品id
     *
     * @mbg.generated
     */
private Long productId;

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
	public Long getSpecId() {
	    return specId;
	}

	/**
	     * @mbg.generated
	     */
	public void setSpecId(Long specId) {
	    this.specId = specId;
	}

	/**
	     * @mbg.generated
	     */
	public Long getSpecValueId() {
	    return specValueId;
	}

	/**
	     * @mbg.generated
	     */
	public void setSpecValueId(Long specValueId) {
	    this.specValueId = specValueId;
	}

	/**
	     * @mbg.generated
	     */
	public Long getProductId() {
	    return productId;
	}

	/**
	     * @mbg.generated
	     */
	public void setProductId(Long productId) {
	    this.productId = productId;
	}


}