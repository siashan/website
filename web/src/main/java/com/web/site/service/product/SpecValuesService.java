package com.web.site.service.product;

import com.web.site.dao.product.SpecValuesMapper;
import com.web.site.entity.product.SpecValues;
import com.web.site.entity.product.SpecValuesExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
    * 规格值 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class SpecValuesService extends BaseService<SpecValuesMapper, SpecValues, SpecValuesExample> {

	public List<SpecValues> selectBySpecId(Long id) {
	    SpecValuesExample example = new SpecValuesExample();
	    example.setOrderByClause(" order_by ");
	    SpecValuesExample.Criteria criteria = example.createCriteria();
	    criteria.andSpecIdEqualTo(id);
	    return selectByExample(example);
	}


}