package com.web.site.service.product;

import com.web.site.dao.product.SpecMapper;
import com.web.site.entity.product.Spec;
import com.web.site.entity.product.SpecExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
    * 规格 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class SpecService extends BaseService<SpecMapper, Spec, SpecExample> {


    public List<Map<String,Object>> selectByCatId(Long catId) {
        return baseMapper.selectByCatId(catId);
    }
}