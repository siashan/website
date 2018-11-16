package com.web.site.entity.product;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;

/**
 * 商品属性
 *
 * @author Small 2018-09-29
 * database table goods_props
 * @mbg.generated do_not_delete_during_merge
 */
@JSONType(ignores = {})
public class GoodsProps implements Serializable {

    /**
     * id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing= ToStringSerializer.class)
    private Long id;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing= ToStringSerializer.class)
    private Long goodsId;

    /**
     * 属性id
     *
     * @mbg.generated
     */
    @JSONField(serializeUsing= ToStringSerializer.class)
    private Long propId;

    /**
     * 属性值
     *
     * @mbg.generated
     */
    private String propValue;

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
    public Long getPropId() {
        return propId;
    }

    /**
     * @mbg.generated
     */
    public void setPropId(Long propId) {
        this.propId = propId;
    }

    /**
     * @mbg.generated
     */
    public String getPropValue() {
        return propValue;
    }

    /**
     * @mbg.generated
     */
    public void setPropValue(String propValue) {
        this.propValue = propValue == null ? null : propValue.trim();
    }


}