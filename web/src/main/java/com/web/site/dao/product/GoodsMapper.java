package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.Goods;
import com.web.site.entity.product.GoodsExample;

import java.util.List;
import java.util.Map;

public interface GoodsMapper extends BaseMapper<Goods, GoodsExample> {


    List<Map<String,Object>> selectAllWithPage();
}