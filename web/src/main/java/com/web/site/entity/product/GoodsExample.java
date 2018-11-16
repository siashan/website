package com.web.site.entity.product;

import com.web.site.common.orm.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {

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
	public GoodsExample() {
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
	     * goods
	     * @author Small 2018-09-29
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
	
	    public Criteria andGoodsNameIsNull() {
	        addCriterion("goods_name is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameIsNotNull() {
	        addCriterion("goods_name is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameEqualTo(String value) {
	        addCriterion("goods_name =", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameNotEqualTo(String value) {
	        addCriterion("goods_name <>", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameGreaterThan(String value) {
	        addCriterion("goods_name >", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
	        addCriterion("goods_name >=", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameLessThan(String value) {
	        addCriterion("goods_name <", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameLessThanOrEqualTo(String value) {
	        addCriterion("goods_name <=", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameLike(String value) {
	        addCriterion("goods_name like", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameNotLike(String value) {
	        addCriterion("goods_name not like", value, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameIn(List<String> values) {
	        addCriterion("goods_name in", values, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameNotIn(List<String> values) {
	        addCriterion("goods_name not in", values, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameBetween(String value1, String value2) {
	        addCriterion("goods_name between", value1, value2, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsNameNotBetween(String value1, String value2) {
	        addCriterion("goods_name not between", value1, value2, "goodsName");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnIsNull() {
	        addCriterion("goods_sn is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnIsNotNull() {
	        addCriterion("goods_sn is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnEqualTo(String value) {
	        addCriterion("goods_sn =", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnNotEqualTo(String value) {
	        addCriterion("goods_sn <>", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnGreaterThan(String value) {
	        addCriterion("goods_sn >", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
	        addCriterion("goods_sn >=", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnLessThan(String value) {
	        addCriterion("goods_sn <", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnLessThanOrEqualTo(String value) {
	        addCriterion("goods_sn <=", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnLike(String value) {
	        addCriterion("goods_sn like", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnNotLike(String value) {
	        addCriterion("goods_sn not like", value, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnIn(List<String> values) {
	        addCriterion("goods_sn in", values, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnNotIn(List<String> values) {
	        addCriterion("goods_sn not in", values, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnBetween(String value1, String value2) {
	        addCriterion("goods_sn between", value1, value2, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsSnNotBetween(String value1, String value2) {
	        addCriterion("goods_sn not between", value1, value2, "goodsSn");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdIsNull() {
	        addCriterion("brand_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdIsNotNull() {
	        addCriterion("brand_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdEqualTo(Long value) {
	        addCriterion("brand_id =", value, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdNotEqualTo(Long value) {
	        addCriterion("brand_id <>", value, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdGreaterThan(Long value) {
	        addCriterion("brand_id >", value, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("brand_id >=", value, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdLessThan(Long value) {
	        addCriterion("brand_id <", value, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdLessThanOrEqualTo(Long value) {
	        addCriterion("brand_id <=", value, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdIn(List<Long> values) {
	        addCriterion("brand_id in", values, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdNotIn(List<Long> values) {
	        addCriterion("brand_id not in", values, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdBetween(Long value1, Long value2) {
	        addCriterion("brand_id between", value1, value2, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andBrandIdNotBetween(Long value1, Long value2) {
	        addCriterion("brand_id not between", value1, value2, "brandId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdIsNull() {
	        addCriterion("cat_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdIsNotNull() {
	        addCriterion("cat_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdEqualTo(Long value) {
	        addCriterion("cat_id =", value, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdNotEqualTo(Long value) {
	        addCriterion("cat_id <>", value, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdGreaterThan(Long value) {
	        addCriterion("cat_id >", value, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("cat_id >=", value, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdLessThan(Long value) {
	        addCriterion("cat_id <", value, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdLessThanOrEqualTo(Long value) {
	        addCriterion("cat_id <=", value, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdIn(List<Long> values) {
	        addCriterion("cat_id in", values, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdNotIn(List<Long> values) {
	        addCriterion("cat_id not in", values, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdBetween(Long value1, Long value2) {
	        addCriterion("cat_id between", value1, value2, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCatIdNotBetween(Long value1, Long value2) {
	        addCriterion("cat_id not between", value1, value2, "catId");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroIsNull() {
	        addCriterion("goods_intro is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroIsNotNull() {
	        addCriterion("goods_intro is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroEqualTo(String value) {
	        addCriterion("goods_intro =", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroNotEqualTo(String value) {
	        addCriterion("goods_intro <>", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroGreaterThan(String value) {
	        addCriterion("goods_intro >", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroGreaterThanOrEqualTo(String value) {
	        addCriterion("goods_intro >=", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroLessThan(String value) {
	        addCriterion("goods_intro <", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroLessThanOrEqualTo(String value) {
	        addCriterion("goods_intro <=", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroLike(String value) {
	        addCriterion("goods_intro like", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroNotLike(String value) {
	        addCriterion("goods_intro not like", value, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroIn(List<String> values) {
	        addCriterion("goods_intro in", values, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroNotIn(List<String> values) {
	        addCriterion("goods_intro not in", values, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroBetween(String value1, String value2) {
	        addCriterion("goods_intro between", value1, value2, "goodsIntro");
	        return (Criteria) this;
	    }
	
	    public Criteria andGoodsIntroNotBetween(String value1, String value2) {
	        addCriterion("goods_intro not between", value1, value2, "goodsIntro");
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
	
	    public Criteria andCostIsNull() {
	        addCriterion("cost is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostIsNotNull() {
	        addCriterion("cost is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostEqualTo(Double value) {
	        addCriterion("cost =", value, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostNotEqualTo(Double value) {
	        addCriterion("cost <>", value, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostGreaterThan(Double value) {
	        addCriterion("cost >", value, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostGreaterThanOrEqualTo(Double value) {
	        addCriterion("cost >=", value, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostLessThan(Double value) {
	        addCriterion("cost <", value, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostLessThanOrEqualTo(Double value) {
	        addCriterion("cost <=", value, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostIn(List<Double> values) {
	        addCriterion("cost in", values, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostNotIn(List<Double> values) {
	        addCriterion("cost not in", values, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostBetween(Double value1, Double value2) {
	        addCriterion("cost between", value1, value2, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andCostNotBetween(Double value1, Double value2) {
	        addCriterion("cost not between", value1, value2, "cost");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceIsNull() {
	        addCriterion("mk_price is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceIsNotNull() {
	        addCriterion("mk_price is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceEqualTo(Double value) {
	        addCriterion("mk_price =", value, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceNotEqualTo(Double value) {
	        addCriterion("mk_price <>", value, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceGreaterThan(Double value) {
	        addCriterion("mk_price >", value, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceGreaterThanOrEqualTo(Double value) {
	        addCriterion("mk_price >=", value, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceLessThan(Double value) {
	        addCriterion("mk_price <", value, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceLessThanOrEqualTo(Double value) {
	        addCriterion("mk_price <=", value, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceIn(List<Double> values) {
	        addCriterion("mk_price in", values, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceNotIn(List<Double> values) {
	        addCriterion("mk_price not in", values, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceBetween(Double value1, Double value2) {
	        addCriterion("mk_price between", value1, value2, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkPriceNotBetween(Double value1, Double value2) {
	        addCriterion("mk_price not between", value1, value2, "mkPrice");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableIsNull() {
	        addCriterion("mk_enable is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableIsNotNull() {
	        addCriterion("mk_enable is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableEqualTo(String value) {
	        addCriterion("mk_enable =", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableNotEqualTo(String value) {
	        addCriterion("mk_enable <>", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableGreaterThan(String value) {
	        addCriterion("mk_enable >", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableGreaterThanOrEqualTo(String value) {
	        addCriterion("mk_enable >=", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableLessThan(String value) {
	        addCriterion("mk_enable <", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableLessThanOrEqualTo(String value) {
	        addCriterion("mk_enable <=", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableLike(String value) {
	        addCriterion("mk_enable like", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableNotLike(String value) {
	        addCriterion("mk_enable not like", value, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableIn(List<String> values) {
	        addCriterion("mk_enable in", values, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableNotIn(List<String> values) {
	        addCriterion("mk_enable not in", values, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableBetween(String value1, String value2) {
	        addCriterion("mk_enable between", value1, value2, "mkEnable");
	        return (Criteria) this;
	    }
	
	    public Criteria andMkEnableNotBetween(String value1, String value2) {
	        addCriterion("mk_enable not between", value1, value2, "mkEnable");
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
	     * This class corresponds to the database table goods
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * goods
	     * @author Small 2018-09-29
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