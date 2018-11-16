package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.Category;
import com.web.site.entity.product.CategoryExample;

import java.util.List;
import java.util.Map;

public interface CategoryMapper extends BaseMapper<Category, CategoryExample> {

	List<Map<String, Object>> selectAllForSelect();


}