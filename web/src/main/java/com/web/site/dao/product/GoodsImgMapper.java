package com.web.site.dao.product;

import com.web.site.dao.BaseMapper;
import com.web.site.entity.product.GoodsImg;
import com.web.site.entity.product.GoodsImgExample;

public interface GoodsImgMapper extends BaseMapper<GoodsImg, GoodsImgExample> {


    void delByGoodsId(Long goodsId);
}