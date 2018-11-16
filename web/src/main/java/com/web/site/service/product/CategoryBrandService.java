package com.web.site.service.product;

import com.web.site.dao.product.CategoryBrandMapper;
import com.web.site.entity.product.Brand;
import com.web.site.entity.product.CategoryBrand;
import com.web.site.entity.product.CategoryBrandExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
    * 类目-品牌关联表 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class CategoryBrandService extends BaseService<CategoryBrandMapper, CategoryBrand, CategoryBrandExample> {

	public List<Integer> loadBrands(Integer id) {
	    return baseMapper.loadBrands(id);
	}

	public List<Brand> loadBrandsAll() {
	    return baseMapper.loadBrandsAll();
	}

	@Transactional
	public void create(Long categoryId, Long[] brandIds) {
	    baseMapper.deleteByCatId(categoryId);
	    for (Long i : brandIds) {
	        CategoryBrand categorySpec = new CategoryBrand();
	        categorySpec.setCategoryId(categoryId);
	        categorySpec.setBrandId(i);
	        insertSelective(categorySpec);
	    }
	}


}