package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.CategorySpec;
import com.web.site.entity.product.CategorySpecExample;
import com.web.site.entity.product.Spec;

import java.util.List;

public interface CategorySpecMapper extends BaseMapper<CategorySpec, CategorySpecExample> {

	List<Integer> loadSpecs(Integer id);

	List<Spec> loadAllForTranfer();

	void deleteByCatId(Long catId);


}