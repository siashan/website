package com.web.site.dao.product;

import java.util.List;
import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.ProductExample;
import com.web.site.entity.product.Product;

public interface ProductMapper extends BaseMapper<Product, ProductExample> {

	List<Product> selectByGoodsId(Long id);


}