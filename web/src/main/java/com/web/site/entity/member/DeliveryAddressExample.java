package com.web.site.entity.member;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.web.site.common.orm.Page;

public class DeliveryAddressExample {

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
	public DeliveryAddressExample() {
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
	     * delivery_address
	     * @author Small 2018-10-31
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
	
	    public Criteria andMemberIdIsNull() {
	        addCriterion("member_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdIsNotNull() {
	        addCriterion("member_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdEqualTo(Long value) {
	        addCriterion("member_id =", value, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdNotEqualTo(Long value) {
	        addCriterion("member_id <>", value, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdGreaterThan(Long value) {
	        addCriterion("member_id >", value, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("member_id >=", value, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdLessThan(Long value) {
	        addCriterion("member_id <", value, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdLessThanOrEqualTo(Long value) {
	        addCriterion("member_id <=", value, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdIn(List<Long> values) {
	        addCriterion("member_id in", values, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdNotIn(List<Long> values) {
	        addCriterion("member_id not in", values, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdBetween(Long value1, Long value2) {
	        addCriterion("member_id between", value1, value2, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andMemberIdNotBetween(Long value1, Long value2) {
	        addCriterion("member_id not between", value1, value2, "memberId");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultIsNull() {
	        addCriterion("is_default is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultIsNotNull() {
	        addCriterion("is_default is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultEqualTo(String value) {
	        addCriterion("is_default =", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultNotEqualTo(String value) {
	        addCriterion("is_default <>", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultGreaterThan(String value) {
	        addCriterion("is_default >", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
	        addCriterion("is_default >=", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultLessThan(String value) {
	        addCriterion("is_default <", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultLessThanOrEqualTo(String value) {
	        addCriterion("is_default <=", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultLike(String value) {
	        addCriterion("is_default like", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultNotLike(String value) {
	        addCriterion("is_default not like", value, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultIn(List<String> values) {
	        addCriterion("is_default in", values, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultNotIn(List<String> values) {
	        addCriterion("is_default not in", values, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultBetween(String value1, String value2) {
	        addCriterion("is_default between", value1, value2, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andIsDefaultNotBetween(String value1, String value2) {
	        addCriterion("is_default not between", value1, value2, "isDefault");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeIsNull() {
	        addCriterion("address_code is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeIsNotNull() {
	        addCriterion("address_code is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeEqualTo(String value) {
	        addCriterion("address_code =", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeNotEqualTo(String value) {
	        addCriterion("address_code <>", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeGreaterThan(String value) {
	        addCriterion("address_code >", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeGreaterThanOrEqualTo(String value) {
	        addCriterion("address_code >=", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeLessThan(String value) {
	        addCriterion("address_code <", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeLessThanOrEqualTo(String value) {
	        addCriterion("address_code <=", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeLike(String value) {
	        addCriterion("address_code like", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeNotLike(String value) {
	        addCriterion("address_code not like", value, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeIn(List<String> values) {
	        addCriterion("address_code in", values, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeNotIn(List<String> values) {
	        addCriterion("address_code not in", values, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeBetween(String value1, String value2) {
	        addCriterion("address_code between", value1, value2, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andAddressCodeNotBetween(String value1, String value2) {
	        addCriterion("address_code not between", value1, value2, "addressCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdIsNull() {
	        addCriterion("province_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdIsNotNull() {
	        addCriterion("province_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdEqualTo(Long value) {
	        addCriterion("province_id =", value, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdNotEqualTo(Long value) {
	        addCriterion("province_id <>", value, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdGreaterThan(Long value) {
	        addCriterion("province_id >", value, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("province_id >=", value, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdLessThan(Long value) {
	        addCriterion("province_id <", value, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
	        addCriterion("province_id <=", value, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdIn(List<Long> values) {
	        addCriterion("province_id in", values, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdNotIn(List<Long> values) {
	        addCriterion("province_id not in", values, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdBetween(Long value1, Long value2) {
	        addCriterion("province_id between", value1, value2, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
	        addCriterion("province_id not between", value1, value2, "provinceId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdIsNull() {
	        addCriterion("city_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdIsNotNull() {
	        addCriterion("city_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdEqualTo(Long value) {
	        addCriterion("city_id =", value, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdNotEqualTo(Long value) {
	        addCriterion("city_id <>", value, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdGreaterThan(Long value) {
	        addCriterion("city_id >", value, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("city_id >=", value, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdLessThan(Long value) {
	        addCriterion("city_id <", value, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdLessThanOrEqualTo(Long value) {
	        addCriterion("city_id <=", value, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdIn(List<Long> values) {
	        addCriterion("city_id in", values, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdNotIn(List<Long> values) {
	        addCriterion("city_id not in", values, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdBetween(Long value1, Long value2) {
	        addCriterion("city_id between", value1, value2, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andCityIdNotBetween(Long value1, Long value2) {
	        addCriterion("city_id not between", value1, value2, "cityId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdIsNull() {
	        addCriterion("area_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdIsNotNull() {
	        addCriterion("area_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdEqualTo(Long value) {
	        addCriterion("area_id =", value, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdNotEqualTo(Long value) {
	        addCriterion("area_id <>", value, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdGreaterThan(Long value) {
	        addCriterion("area_id >", value, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("area_id >=", value, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdLessThan(Long value) {
	        addCriterion("area_id <", value, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdLessThanOrEqualTo(Long value) {
	        addCriterion("area_id <=", value, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdIn(List<Long> values) {
	        addCriterion("area_id in", values, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdNotIn(List<Long> values) {
	        addCriterion("area_id not in", values, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdBetween(Long value1, Long value2) {
	        addCriterion("area_id between", value1, value2, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andAreaIdNotBetween(Long value1, Long value2) {
	        addCriterion("area_id not between", value1, value2, "areaId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdIsNull() {
	        addCriterion("town_id is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdIsNotNull() {
	        addCriterion("town_id is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdEqualTo(Long value) {
	        addCriterion("town_id =", value, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdNotEqualTo(Long value) {
	        addCriterion("town_id <>", value, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdGreaterThan(Long value) {
	        addCriterion("town_id >", value, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdGreaterThanOrEqualTo(Long value) {
	        addCriterion("town_id >=", value, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdLessThan(Long value) {
	        addCriterion("town_id <", value, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdLessThanOrEqualTo(Long value) {
	        addCriterion("town_id <=", value, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdIn(List<Long> values) {
	        addCriterion("town_id in", values, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdNotIn(List<Long> values) {
	        addCriterion("town_id not in", values, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdBetween(Long value1, Long value2) {
	        addCriterion("town_id between", value1, value2, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andTownIdNotBetween(Long value1, Long value2) {
	        addCriterion("town_id not between", value1, value2, "townId");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressIsNull() {
	        addCriterion("detail_address is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressIsNotNull() {
	        addCriterion("detail_address is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressEqualTo(String value) {
	        addCriterion("detail_address =", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressNotEqualTo(String value) {
	        addCriterion("detail_address <>", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressGreaterThan(String value) {
	        addCriterion("detail_address >", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
	        addCriterion("detail_address >=", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressLessThan(String value) {
	        addCriterion("detail_address <", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressLessThanOrEqualTo(String value) {
	        addCriterion("detail_address <=", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressLike(String value) {
	        addCriterion("detail_address like", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressNotLike(String value) {
	        addCriterion("detail_address not like", value, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressIn(List<String> values) {
	        addCriterion("detail_address in", values, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressNotIn(List<String> values) {
	        addCriterion("detail_address not in", values, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressBetween(String value1, String value2) {
	        addCriterion("detail_address between", value1, value2, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andDetailAddressNotBetween(String value1, String value2) {
	        addCriterion("detail_address not between", value1, value2, "detailAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeIsNull() {
	        addCriterion("zip_code is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeIsNotNull() {
	        addCriterion("zip_code is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeEqualTo(String value) {
	        addCriterion("zip_code =", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotEqualTo(String value) {
	        addCriterion("zip_code <>", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeGreaterThan(String value) {
	        addCriterion("zip_code >", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
	        addCriterion("zip_code >=", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeLessThan(String value) {
	        addCriterion("zip_code <", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeLessThanOrEqualTo(String value) {
	        addCriterion("zip_code <=", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeLike(String value) {
	        addCriterion("zip_code like", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotLike(String value) {
	        addCriterion("zip_code not like", value, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeIn(List<String> values) {
	        addCriterion("zip_code in", values, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotIn(List<String> values) {
	        addCriterion("zip_code not in", values, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeBetween(String value1, String value2) {
	        addCriterion("zip_code between", value1, value2, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andZipCodeNotBetween(String value1, String value2) {
	        addCriterion("zip_code not between", value1, value2, "zipCode");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileIsNull() {
	        addCriterion("mobile is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileIsNotNull() {
	        addCriterion("mobile is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileEqualTo(String value) {
	        addCriterion("mobile =", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotEqualTo(String value) {
	        addCriterion("mobile <>", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileGreaterThan(String value) {
	        addCriterion("mobile >", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileGreaterThanOrEqualTo(String value) {
	        addCriterion("mobile >=", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileLessThan(String value) {
	        addCriterion("mobile <", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileLessThanOrEqualTo(String value) {
	        addCriterion("mobile <=", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileLike(String value) {
	        addCriterion("mobile like", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotLike(String value) {
	        addCriterion("mobile not like", value, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileIn(List<String> values) {
	        addCriterion("mobile in", values, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotIn(List<String> values) {
	        addCriterion("mobile not in", values, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileBetween(String value1, String value2) {
	        addCriterion("mobile between", value1, value2, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andMobileNotBetween(String value1, String value2) {
	        addCriterion("mobile not between", value1, value2, "mobile");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeIsNull() {
	        addCriterion("consignee is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeIsNotNull() {
	        addCriterion("consignee is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeEqualTo(String value) {
	        addCriterion("consignee =", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeNotEqualTo(String value) {
	        addCriterion("consignee <>", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeGreaterThan(String value) {
	        addCriterion("consignee >", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
	        addCriterion("consignee >=", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeLessThan(String value) {
	        addCriterion("consignee <", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeLessThanOrEqualTo(String value) {
	        addCriterion("consignee <=", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeLike(String value) {
	        addCriterion("consignee like", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeNotLike(String value) {
	        addCriterion("consignee not like", value, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeIn(List<String> values) {
	        addCriterion("consignee in", values, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeNotIn(List<String> values) {
	        addCriterion("consignee not in", values, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeBetween(String value1, String value2) {
	        addCriterion("consignee between", value1, value2, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andConsigneeNotBetween(String value1, String value2) {
	        addCriterion("consignee not between", value1, value2, "consignee");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatIsNull() {
	        addCriterion("del_stat is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatIsNotNull() {
	        addCriterion("del_stat is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatEqualTo(String value) {
	        addCriterion("del_stat =", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatNotEqualTo(String value) {
	        addCriterion("del_stat <>", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatGreaterThan(String value) {
	        addCriterion("del_stat >", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatGreaterThanOrEqualTo(String value) {
	        addCriterion("del_stat >=", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatLessThan(String value) {
	        addCriterion("del_stat <", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatLessThanOrEqualTo(String value) {
	        addCriterion("del_stat <=", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatLike(String value) {
	        addCriterion("del_stat like", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatNotLike(String value) {
	        addCriterion("del_stat not like", value, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatIn(List<String> values) {
	        addCriterion("del_stat in", values, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatNotIn(List<String> values) {
	        addCriterion("del_stat not in", values, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatBetween(String value1, String value2) {
	        addCriterion("del_stat between", value1, value2, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andDelStatNotBetween(String value1, String value2) {
	        addCriterion("del_stat not between", value1, value2, "delStat");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressIsNull() {
	        addCriterion("full_address is null");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressIsNotNull() {
	        addCriterion("full_address is not null");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressEqualTo(String value) {
	        addCriterion("full_address =", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressNotEqualTo(String value) {
	        addCriterion("full_address <>", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressGreaterThan(String value) {
	        addCriterion("full_address >", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressGreaterThanOrEqualTo(String value) {
	        addCriterion("full_address >=", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressLessThan(String value) {
	        addCriterion("full_address <", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressLessThanOrEqualTo(String value) {
	        addCriterion("full_address <=", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressLike(String value) {
	        addCriterion("full_address like", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressNotLike(String value) {
	        addCriterion("full_address not like", value, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressIn(List<String> values) {
	        addCriterion("full_address in", values, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressNotIn(List<String> values) {
	        addCriterion("full_address not in", values, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressBetween(String value1, String value2) {
	        addCriterion("full_address between", value1, value2, "fullAddress");
	        return (Criteria) this;
	    }
	
	    public Criteria andFullAddressNotBetween(String value1, String value2) {
	        addCriterion("full_address not between", value1, value2, "fullAddress");
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
	     * This class corresponds to the database table delivery_address
	     * @mbg.generated do_not_delete_during_merge
	     */
	public static class Criteria extends GeneratedCriteria {
	
	    protected Criteria() {
	        super();
	    }
	}	/**
	     * delivery_address
	     * @author Small 2018-10-31
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