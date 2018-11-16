package com.web.site.entity.product;

import java.io.Serializable;

/**
 *
 * @author Small 2018-09-11
 * database table category_params
 * @mbg.generated do_not_delete_during_merge
 */
public class CategoryParams implements Serializable {
    /**
     *   id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *   叶子类目id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *   参数名
     *
     * @mbg.generated
     */
    private String paramName;

    /**
     *   父id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *   排序字段
     *
     * @mbg.generated
     */
    private Integer orderBy;

    /**
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @mbg.generated
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @mbg.generated
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    /**
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
}