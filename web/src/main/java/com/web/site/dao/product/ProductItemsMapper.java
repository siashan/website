package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.ProductItems;
import com.web.site.entity.product.ProductItemsExample;

import java.util.List;

public interface ProductItemsMapper extends BaseMapper<ProductItems, ProductItemsExample> {

	List<ProductItems> selectTop2Level();

	int updateByPrimaryKeySelectiveOptimistic(ProductItems items);


}