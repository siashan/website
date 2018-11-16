package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.Brand;
import com.web.site.entity.product.CategoryBrand;
import com.web.site.entity.product.CategoryBrandExample;

import java.util.List;

public interface CategoryBrandMapper extends BaseMapper<CategoryBrand, CategoryBrandExample> {

	List<Integer> loadBrands(Integer id);

	List<Brand> loadBrandsAll();

	void deleteByCatId(Long categoryId);


}