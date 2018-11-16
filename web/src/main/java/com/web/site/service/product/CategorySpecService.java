package com.web.site.service.product;

import com.web.site.dao.product.CategorySpecMapper;
import com.web.site.entity.product.CategorySpec;
import com.web.site.entity.product.CategorySpecExample;
import com.web.site.entity.product.Spec;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-10-15
 */
@Service
public class CategorySpecService extends BaseService<CategorySpecMapper, CategorySpec, CategorySpecExample> {

	public List<Integer> loadSpecs(Integer id) {
	    return baseMapper.loadSpecs(id);
	}

	public List<Spec> loadAllForTranfer() {
	    return baseMapper.loadAllForTranfer();
	}

	@Transactional
	public void create(Long categoryId, Long[] specIds) {
	    baseMapper.deleteByCatId(categoryId);
	    for (Long i : specIds) {
	        CategorySpec categorySpec = new CategorySpec();
	        categorySpec.setCategoryId(categoryId);
	        categorySpec.setSpecId(i);
	        insertSelective(categorySpec);
	    }
	}


}