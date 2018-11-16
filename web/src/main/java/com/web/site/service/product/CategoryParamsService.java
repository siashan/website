package com.web.site.service.product;

import com.web.site.dao.product.CategoryParamsMapper;
import com.web.site.entity.product.CategoryParams;
import com.web.site.entity.product.CategoryParamsExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-11
 */
@Service
public class CategoryParamsService extends BaseService<CategoryParamsMapper,CategoryParams,CategoryParamsExample>  {

    public void deleteParamGroup(Integer id) {
        baseMapper.deleteParamGroup(id);
    }
}

