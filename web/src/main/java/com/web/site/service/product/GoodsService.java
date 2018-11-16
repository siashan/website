package com.web.site.service.product;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.site.common.orm.Page;
import com.web.site.dao.product.GoodsMapper;
import com.web.site.entity.product.Goods;
import com.web.site.entity.product.GoodsExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
    * 商品表 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class GoodsService extends BaseService<GoodsMapper, Goods, GoodsExample> {


    public PageInfo selectAllWithPage(Page page) {
        PageHelper.startPage(page.getPageNum(),page.getLength(),true);
        List<Map<String,Object>> goods =  baseMapper.selectAllWithPage();
        PageInfo pageInfo = new PageInfo(goods);
        return pageInfo;
    }
}