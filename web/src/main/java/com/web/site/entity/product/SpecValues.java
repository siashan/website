package com.web.site.entity.product;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;

/**
 * 规格值
 *
 * @author Small 2018-09-29
 * database table spec_values
 * @mbg.generated do_not_delete_during_merge
 */
@JSONType(ignores = {})
public class SpecValues implements Serializable {

    /**
     * id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 关联规格id
     *
     * @mbg.generated
     */
    private Long specId;

    /**
     * 规格值
     *
     * @mbg.generated
     */
    private String specValue;

    /**
     * 规格图片
     *
     * @mbg.generated
     */
    private String specImg;

    /**
     * 排序
     *
     * @mbg.generated
     */
    private String orderBy;

    /**
     * 固有规格 “0”  添加商品修改规格“1”
     *
     * @mbg.generated
     */
    private String inherentOrAdd;

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
    public String getSpecValue() {
        return specValue;
    }

    /**
     * @mbg.generated
     */
    public void setSpecValue(String specValue) {
        this.specValue = specValue == null ? null : specValue.trim();
    }

    /**
     * @mbg.generated
     */
    public String getSpecImg() {
        return specImg;
    }

    /**
     * @mbg.generated
     */
    public void setSpecImg(String specImg) {
        this.specImg = specImg == null ? null : specImg.trim();
    }

    /**
     * @mbg.generated
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * @mbg.generated
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy == null ? null : orderBy.trim();
    }

    /**
     * @mbg.generated
     */
    public String getInherentOrAdd() {
        return inherentOrAdd;
    }

    /**
     * @mbg.generated
     */
    public void setInherentOrAdd(String inherentOrAdd) {
        this.inherentOrAdd = inherentOrAdd == null ? null : inherentOrAdd.trim();
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