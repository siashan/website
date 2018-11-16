package com.web.site.service.product;

import com.web.site.dao.product.BrandMapper;
import com.web.site.entity.product.Brand;
import com.web.site.entity.product.BrandExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class BrandService extends BaseService<BrandMapper, Brand, BrandExample> {

	public List<Map<String, Object>> selectCatBrand(Integer id) {
	    return baseMapper.selectCatBrand(id);
	}


}