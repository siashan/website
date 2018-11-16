package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.CategoryParams;
import com.web.site.entity.product.CategoryParamsExample;

public interface CategoryParamsMapper extends BaseMapper<CategoryParams, CategoryParamsExample> {
    void deleteParamGroup(Integer id);
}