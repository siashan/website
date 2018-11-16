package com.web.site.entity.product;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;

/**
 * 商品属性
 *
 * @author Small 2018-10-12
 * database table category_props
 * @mbg.generated do_not_delete_during_merge
 */
@JSONType(ignores = {})
public class CategoryProps implements Serializable {

    /**
     * id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing= ToStringSerializer.class)
    private Long id;

    /**
     * 叶子类目id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing= ToStringSerializer.class)
    private Long categoryId;

    /**
     * 属性名
     *
     * @mbg.generated
     */
    private String propName;

    /**
     * 是否可搜索
     *
     * @mbg.generated
     */
    private String isSearchable;

    /**
     * 选项值（|分割）
     *
     * @mbg.generated
     */
    private String optionArr;

    /**
     * 是否必填
     *
     * @mbg.generated
     */
    private String isRequired;

    /**
     * 排序字段
     *
     * @mbg.generated
     */
    private Integer orderBy;

    /**
     * 版本号
     *
     * @mbg.generated
     */
    private Integer version;

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
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * @mbg.generated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @mbg.generated
     */
    public String getPropName() {
        return propName;
    }

    /**
     * @mbg.generated
     */
    public void setPropName(String propName) {
        this.propName = propName == null ? null : propName.trim();
    }

    /**
     * @mbg.generated
     */
    public String getIsSearchable() {
        return isSearchable;
    }

    /**
     * @mbg.generated
     */
    public void setIsSearchable(String isSearchable) {
        this.isSearchable = isSearchable == null ? null : isSearchable.trim();
    }

    /**
     * @mbg.generated
     */
    public String getOptionArr() {
        return optionArr;
    }

    /**
     * @mbg.generated
     */
    public void setOptionArr(String optionArr) {
        this.optionArr = optionArr == null ? null : optionArr.trim();
    }

    /**
     * @mbg.generated
     */
    public String getIsRequired() {
        return isRequired;
    }

    /**
     * @mbg.generated
     */
    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired == null ? null : isRequired.trim();
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
    public Integer getVersion() {
        return version;
    }

    /**
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }


}