package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.Spec;
import com.web.site.entity.product.SpecExample;

import java.util.List;
import java.util.Map;

public interface SpecMapper extends BaseMapper<Spec, SpecExample> {


    List<Map<String,Object>> selectByCatId(Long catId);
}