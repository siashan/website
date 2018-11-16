package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {

	/**
     * @mbg.generated
     */
protected String orderByClause;

	/**
     * @mbg.generated
     */
protected boolean distinct;

	/**
     * @mbg.generated
     */
protected List<Criteria> oredCriteria;

	/**
     * @mbg.generated
     */
protected Page page;

	/**
	     * @mbg.generated
	     */
	public ProductExample() {
	    oredCriteria = new ArrayList<Criteria>();
	}

	/**
	     * @mbg.generated
	     */
	public void setOrderByClause(String orderByClause) {
	    this.orderByClause = orderByClause;
	}

	/**
	     * @mbg.generated
	     */
	public String getOrderByClause() {
	    return orderByClause;
	}

	/**
	     * @mbg.generated
	     */
	public void setDistinct(boolean distinct) {
	    this.distinct = distinct;
	}

	/**
	     * @mbg.generated
	     */
	public boolean isDistinct() {
	    return distinct;
	}

	/**
	     * @mbg.generated
	     */
	public List<Criteria> getOredCriteria() {
	    return oredCriteria;
	}

	/**
	     * @mbg.generated
	     */
	public void or(Criteria criteria) {
	    oredCriteria.add(criteria);
	}

	/**
	     * @mbg.generated
	     */
	public Criteria or() {
	    Criteria criteria = createCriteriaInternal();
	    oredCriteria.add(criteria);
	    return criteria;
	}

	/**
	     * @mbg.generated
	     */
	public Criteria createCriteria() {
	    Criteria criteria = createCriteriaInternal();
	    if (oredCriteria.size() == 0) {
	        oredCriteria.add(criteria);
	    }
	    return criteria;
	}

	/**
	     * @mbg.generated
	     */
	protected Criteria createCriteriaInternal() {
	    Criteria criteria = new Criteria();
	    return criteria;
	}

	/**
	     * @mbg.generated
	     */
	public void clear() {
	    oredCriteria.clear();
	    orderByClause = null;
	    distinct = false;
	}

	/**
	     * @mbg.generated
	     */
	public void setPage(Page page) {
	    this.page = page;
	}

	/**
	     * @mbg.generated
	     */
	public Page getPage() {
	    return page;
	}

	/**
	     * product
	     * @author Small 2018-10-20
	     */
	protected abstract static class GeneratedCriteria {
	
	    protected List<Criterion> criteria;
	
	    protected GeneratedCriteria() {
	        super();
	        criteria = new ArrayList<Criterion>();
	    }
	
	    public boolean isValid() {
	        return criteria.size() > 0;
	    }
	
	    public List<Criterion> getAllCriteria() {
	        return criteria;
	    }
	
	    public List<Criterion> getCriteria() {
	        return criteria;
	    }
	
	    protected void addCriterion(String condition) {
	        if (condition == null) {
	            throw new RuntimeException("Value for condition cannot be null");
	        }
	        criteria.add(new Criterion(condition));
	    }
	
	    protected void addCriterion(String condition, Object value, String property) {
	        if (value == null) {
	            throw new RuntimeException("Value for " + property + " cannot be null");
	        }
	        criteria.add(new Criterion(condition, value));
	    }
	
	    protected void addCriterion(String condition, Object value1, Object value2, String property) {
	        if (value1 == null || value2 == null) {
	            throw new RuntimeException("Between values for " + property + " cannot be null");
	        }
	        criteria.add(new Criterion(condition, value1, value2));
	    }
	
	    public Criteria andIdIsNull() {
	        addCriterion("id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIsNotNull() {
	        addCriterion("id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdEqualTo(Long value) {
	        addCriterion("id =", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotEqualTo(Long value) {
	        addCriterion("id <>", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThan(Long value) {
	        addCriterion("id >", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("id >=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThan(Long value) {
	        addCriterion("id <", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdLessThanOrEqualTo(Long value) {
	        addCriterion("id <=", value, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdIn(List<Long> values) {
	        addCriterion("id in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotIn(List<Long> values) {
	        addCriterion("id not in", values, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdBetween(Long value1, Long value2) {
	        addCriterion("id between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andIdNotBetween(Long value1, Long value2) {
	        addCriterion("id not between", value1, value2, "id");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdIsNull() {
	        addCriterion("goods_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdIsNotNull() {
	        addCriterion("goods_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdEqualTo(Long value) {
	        addCriterion("goods_id =", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdNotEqualTo(Long value) {
	        addCriterion("goods_id <>", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdGreaterThan(Long value) {
	        addCriterion("goods_id >", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("goods_id >=", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdLessThan(Long value) {
	        addCriterion("goods_id <", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
	        addCriterion("goods_id <=", value, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdIn(List<Long> values) {
	        addCriterion("goods_id in", values, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdNotIn(List<Long> values) {
	        addCriterion("goods_id not in", values, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdBetween(Long value1, Long value2) {
	        addCriterion("goods_id between", value1, value2, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
	        addCriterion("goods_id not between", value1, value2, "goodsId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameIsNull() {
	        addCriterion("product_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameIsNotNull() {
	        addCriterion("product_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameEqualTo(String value) {
	        addCriterion("product_name =", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameNotEqualTo(String value) {
	        addCriterion("product_name <>", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameGreaterThan(String value) {
	        addCriterion("product_name >", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameGreaterThanOrEqualTo(String value) {
	        addCriterion("product_name >=", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameLessThan(String value) {
	        addCriterion("product_name <", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameLessThanOrEqualTo(String value) {
	        addCriterion("product_name <=", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameLike(String value) {
	        addCriterion("product_name like", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameNotLike(String value) {
	        addCriterion("product_name not like", value, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameIn(List<String> values) {
	        addCriterion("product_name in", values, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameNotIn(List<String> values) {
	        addCriterion("product_name not in", values, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameBetween(String value1, String value2) {
	        addCriterion("product_name between", value1, value2, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductNameNotBetween(String value1, String value2) {
	        addCriterion("product_name not between", value1, value2, "productName");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnIsNull() {
	        addCriterion("product_sn is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnIsNotNull() {
	        addCriterion("product_sn is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnEqualTo(String value) {
	        addCriterion("product_sn =", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnNotEqualTo(String value) {
	        addCriterion("product_sn <>", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnGreaterThan(String value) {
	        addCriterion("product_sn >", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnGreaterThanOrEqualTo(String value) {
	        addCriterion("product_sn >=", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnLessThan(String value) {
	        addCriterion("product_sn <", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnLessThanOrEqualTo(String value) {
	        addCriterion("product_sn <=", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnLike(String value) {
	        addCriterion("product_sn like", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnNotLike(String value) {
	        addCriterion("product_sn not like", value, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnIn(List<String> values) {
	        addCriterion("product_sn in", values, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnNotIn(List<String> values) {
	        addCriterion("product_sn not in", values, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnBetween(String value1, String value2) {
	        addCriterion("product_sn between", value1, value2, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSnNotBetween(String value1, String value2) {
	        addCriterion("product_sn not between", value1, value2, "productSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceIsNull() {
	        addCriterion("price is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceIsNotNull() {
	        addCriterion("price is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceEqualTo(Double value) {
	        addCriterion("price =", value, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceNotEqualTo(Double value) {
	        addCriterion("price <>", value, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceGreaterThan(Double value) {
	        addCriterion("price >", value, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceGreaterThanOrEqualTo(Double value) {
	        addCriterion("price >=", value, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceLessThan(Double value) {
	        addCriterion("price <", value, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceLessThanOrEqualTo(Double value) {
	        addCriterion("price <=", value, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceIn(List<Double> values) {
	        addCriterion("price in", values, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceNotIn(List<Double> values) {
	        addCriterion("price not in", values, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceBetween(Double value1, Double value2) {
	        addCriterion("price between", value1, value2, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andPriceNotBetween(Double value1, Double value2) {
	        addCriterion("price not between", value1, value2, "price");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgIsNull() {
	        addCriterion("product_img is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgIsNotNull() {
	        addCriterion("product_img is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgEqualTo(String value) {
	        addCriterion("product_img =", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgNotEqualTo(String value) {
	        addCriterion("product_img <>", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgGreaterThan(String value) {
	        addCriterion("product_img >", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgGreaterThanOrEqualTo(String value) {
	        addCriterion("product_img >=", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgLessThan(String value) {
	        addCriterion("product_img <", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgLessThanOrEqualTo(String value) {
	        addCriterion("product_img <=", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgLike(String value) {
	        addCriterion("product_img like", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgNotLike(String value) {
	        addCriterion("product_img not like", value, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgIn(List<String> values) {
	        addCriterion("product_img in", values, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgNotIn(List<String> values) {
	        addCriterion("product_img not in", values, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgBetween(String value1, String value2) {
	        addCriterion("product_img between", value1, value2, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductImgNotBetween(String value1, String value2) {
	        addCriterion("product_img not between", value1, value2, "productImg");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockIsNull() {
	        addCriterion("product_stock is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockIsNotNull() {
	        addCriterion("product_stock is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockEqualTo(Integer value) {
	        addCriterion("product_stock =", value, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockNotEqualTo(Integer value) {
	        addCriterion("product_stock <>", value, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockGreaterThan(Integer value) {
	        addCriterion("product_stock >", value, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockGreaterThanOrEqualTo(Integer value) {
	        addCriterion("product_stock >=", value, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockLessThan(Integer value) {
	        addCriterion("product_stock <", value, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockLessThanOrEqualTo(Integer value) {
	        addCriterion("product_stock <=", value, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockIn(List<Integer> values) {
	        addCriterion("product_stock in", values, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockNotIn(List<Integer> values) {
	        addCriterion("product_stock not in", values, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockBetween(Integer value1, Integer value2) {
	        addCriterion("product_stock between", value1, value2, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductStockNotBetween(Integer value1, Integer value2) {
	        addCriterion("product_stock not between", value1, value2, "productStock");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuIsNull() {
	        addCriterion("product_Sku is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuIsNotNull() {
	        addCriterion("product_Sku is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuEqualTo(String value) {
	        addCriterion("product_Sku =", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuNotEqualTo(String value) {
	        addCriterion("product_Sku <>", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuGreaterThan(String value) {
	        addCriterion("product_Sku >", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuGreaterThanOrEqualTo(String value) {
	        addCriterion("product_Sku >=", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuLessThan(String value) {
	        addCriterion("product_Sku <", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuLessThanOrEqualTo(String value) {
	        addCriterion("product_Sku <=", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuLike(String value) {
	        addCriterion("product_Sku like", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuNotLike(String value) {
	        addCriterion("product_Sku not like", value, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuIn(List<String> values) {
	        addCriterion("product_Sku in", values, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuNotIn(List<String> values) {
	        addCriterion("product_Sku not in", values, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuBetween(String value1, String value2) {
	        addCriterion("product_Sku between", value1, value2, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuNotBetween(String value1, String value2) {
	        addCriterion("product_Sku not between", value1, value2, "productSku");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkIsNull() {
	        addCriterion("product_Sku_Remark is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkIsNotNull() {
	        addCriterion("product_Sku_Remark is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkEqualTo(String value) {
	        addCriterion("product_Sku_Remark =", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkNotEqualTo(String value) {
	        addCriterion("product_Sku_Remark <>", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkGreaterThan(String value) {
	        addCriterion("product_Sku_Remark >", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkGreaterThanOrEqualTo(String value) {
	        addCriterion("product_Sku_Remark >=", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkLessThan(String value) {
	        addCriterion("product_Sku_Remark <", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkLessThanOrEqualTo(String value) {
	        addCriterion("product_Sku_Remark <=", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkLike(String value) {
	        addCriterion("product_Sku_Remark like", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkNotLike(String value) {
	        addCriterion("product_Sku_Remark not like", value, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkIn(List<String> values) {
	        addCriterion("product_Sku_Remark in", values, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkNotIn(List<String> values) {
	        addCriterion("product_Sku_Remark not in", values, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkBetween(String value1, String value2) {
	        addCriterion("product_Sku_Remark between", value1, value2, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andProductSkuRemarkNotBetween(String value1, String value2) {
	        addCriterion("product_Sku_Remark not between", value1, value2, "productSkuRemark");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceIsNull() {
	        addCriterion("cost_price is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceIsNotNull() {
	        addCriterion("cost_price is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceEqualTo(Double value) {
	        addCriterion("cost_price =", value, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceNotEqualTo(Double value) {
	        addCriterion("cost_price <>", value, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceGreaterThan(Double value) {
	        addCriterion("cost_price >", value, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceGreaterThanOrEqualTo(Double value) {
	        addCriterion("cost_price >=", value, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceLessThan(Double value) {
	        addCriterion("cost_price <", value, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceLessThanOrEqualTo(Double value) {
	        addCriterion("cost_price <=", value, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceIn(List<Double> values) {
	        addCriterion("cost_price in", values, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceNotIn(List<Double> values) {
	        addCriterion("cost_price not in", values, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceBetween(Double value1, Double value2) {
	        addCriterion("cost_price between", value1, value2, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostPriceNotBetween(Double value1, Double value2) {
	        addCriterion("cost_price not between", value1, value2, "costPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNull() {
	        addCriterion("create_time is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIsNotNull() {
	        addCriterion("create_time is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeEqualTo(Date value) {
	        addCriterion("create_time =", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotEqualTo(Date value) {
	        addCriterion("create_time <>", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThan(Date value) {
	        addCriterion("create_time >", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
	        addCriterion("create_time >=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThan(Date value) {
	        addCriterion("create_time <", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
	        addCriterion("create_time <=", value, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeIn(List<Date> values) {
	        addCriterion("create_time in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotIn(List<Date> values) {
	        addCriterion("create_time not in", values, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeBetween(Date value1, Date value2) {
	        addCriterion("create_time between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	
	    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
	        addCriterion("create_time not between", value1, value2, "createTime");
	        return (Criteria) this;
	    }
	}	/**
	     * This class was generated by MyBatis Generator.
	     * This class corresponds to the database table product
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * product
	     * @author Small 2018-10-20
	     */
	public static class Criterion {
	
	    private String condition;
	
	    private Object value;
	
	    private Object secondValue;
	
	    private boolean noValue;
	
	    private boolean singleValue;
	
	    private boolean betweenValue;
	
	    private boolean listValue;
	
	    private String typeHandler;
	
	    public String getCondition() {
	        return condition;
	    }
	
	    public Object getValue() {
	        return value;
	    }
	
	    public Object getSecondValue() {
	        return secondValue;
	    }
	
	    public boolean isNoValue() {
	        return noValue;
	    }
	
	    public boolean isSingleValue() {
	        return singleValue;
	    }
	
	    public boolean isBetweenValue() {
	        return betweenValue;
	    }
	
	    public boolean isListValue() {
	        return listValue;
	    }
	
	    public String getTypeHandler() {
	        return typeHandler;
	    }
	
	    protected Criterion(String condition) {
	        super();
	        this.condition = condition;
	        this.typeHandler = null;
	        this.noValue = true;
	    }
	
	    protected Criterion(String condition, Object value, String typeHandler) {
	        super();
	        this.condition = condition;
	        this.value = value;
	        this.typeHandler = typeHandler;
	        if (value instanceof List<?>) {
	            this.listValue = true;
	        } else {
	            this.singleValue = true;
	        }
	    }
	
	    protected Criterion(String condition, Object value) {
	        this(condition, value, null);
	    }
	
	    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
	        super();
	        this.condition = condition;
	        this.value = value;
	        this.secondValue = secondValue;
	        this.typeHandler = typeHandler;
	        this.betweenValue = true;
	    }
	
	    protected Criterion(String condition, Object value, Object secondValue) {
	        this(condition, value, secondValue, null);
	    }
	}
}