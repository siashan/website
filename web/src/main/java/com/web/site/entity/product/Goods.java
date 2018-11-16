package com.web.site.entity.product;

import java.io.Serializable;
import java.util.Date;

/**
 *   商品表
 *
 * @author Small 2018-09-29
 * database table goods
 * @mbg.generated do_not_delete_during_merge
 */
public class Goods implements Serializable {

	/**
     *
     * @mbg.generated
     */
private Long id;

	/**
     *   商品名称
     *
     * @mbg.generated
     */
private String goodsName;

	/**
     *   商品编码
     *
     * @mbg.generated
     */
private String goodsSn;

	/**
     *   品牌id
     *
     * @mbg.generated
     */
private Long brandId;

	/**
     *   类目id
     *
     * @mbg.generated
     */
private Long catId;

	/**
     *   商品描述
     *
     * @mbg.generated
     */
private String goodsIntro;

	/**
     *   价格 （单位/分）
     *
     * @mbg.generated
     */
private Double price;

	/**
     *   折扣价格
     *
     * @mbg.generated
     */
private Double cost;

	/**
     *   市场价格
     *
     * @mbg.generated
     */
private Double mkPrice;

	/**
     *   上架状态（0 未上架 1 已上架 2 已下架） 
     *
     * @mbg.generated
     */
private String mkEnable;

	/**
     *   创建时间
     *
     * @mbg.generated
     */
private Date createTime;

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
	public String getGoodsName() {
	    return goodsName;
	}

	/**
	     * @mbg.generated
	     */
	public void setGoodsName(String goodsName) {
	    this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	/**
	     * @mbg.generated
	     */
	public String getGoodsSn() {
	    return goodsSn;
	}

	/**
	     * @mbg.generated
	     */
	public void setGoodsSn(String goodsSn) {
	    this.goodsSn = goodsSn == null ? null : goodsSn.trim();
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

	/**
	     * @mbg.generated
	     */
	public Long getCatId() {
	    return catId;
	}

	/**
	     * @mbg.generated
	     */
	public void setCatId(Long catId) {
	    this.catId = catId;
	}

	/**
	     * @mbg.generated
	     */
	public String getGoodsIntro() {
	    return goodsIntro;
	}

	/**
	     * @mbg.generated
	     */
	public void setGoodsIntro(String goodsIntro) {
	    this.goodsIntro = goodsIntro == null ? null : goodsIntro.trim();
	}

	/**
	     * @mbg.generated
	     */
	public Double getPrice() {
	    return price;
	}

	/**
	     * @mbg.generated
	     */
	public void setPrice(Double price) {
	    this.price = price;
	}

	/**
	     * @mbg.generated
	     */
	public Double getCost() {
	    return cost;
	}

	/**
	     * @mbg.generated
	     */
	public void setCost(Double cost) {
	    this.cost = cost;
	}

	/**
	     * @mbg.generated
	     */
	public Double getMkPrice() {
	    return mkPrice;
	}

	/**
	     * @mbg.generated
	     */
	public void setMkPrice(Double mkPrice) {
	    this.mkPrice = mkPrice;
	}

	/**
	     * @mbg.generated
	     */
	public String getMkEnable() {
	    return mkEnable;
	}

	/**
	     * @mbg.generated
	     */
	public void setMkEnable(String mkEnable) {
	    this.mkEnable = mkEnable == null ? null : mkEnable.trim();
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


}