package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.Brand;
import com.web.site.entity.product.BrandExample;

import java.util.List;
import java.util.Map;

public interface BrandMapper extends BaseMapper<Brand, BrandExample> {

	List<Map<String, Object>> selectCatBrand(Integer id);


}