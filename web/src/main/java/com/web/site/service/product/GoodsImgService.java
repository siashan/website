package com.web.site.service.product;

import com.web.site.common.support.keygen.MyKeyGenerator;
import com.web.site.dao.product.GoodsImgMapper;
import com.web.site.entity.product.GoodsImg;
import com.web.site.entity.product.GoodsImgExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 商品图片表 服务实现类
 * </p>
 *
 * @author Small
 * @since 2018-10-08
 */
@Service
public class GoodsImgService extends BaseService<GoodsImgMapper, GoodsImg, GoodsImgExample> {

    @Transactional
    public void create(Long goodsId, String[] imgList) {
        List<GoodsImg> goodsImgs = selectByGoodsId(goodsId);
        if (!goodsImgs.isEmpty()) {
            delByGoodsId(goodsId);
        }
        for (String img : imgList) {
            String[] split = img.split("_");
            String order = split[1];
            GoodsImg goodsImg = new GoodsImg();
            Long gid = MyKeyGenerator.genKey();
            goodsImg.setId(gid);
            goodsImg.setGoodsId(goodsId);
            goodsImg.setGoodsImg(split[0]);
            goodsImg.setOrderBy(Integer.parseInt(order));
            insertSelective(goodsImg);
        }
    }

    public void delByGoodsId(Long goodsId) {
        baseMapper.delByGoodsId(goodsId);
    }

    public List<GoodsImg> selectByGoodsId(Long goodsId) {
        GoodsImgExample example = new GoodsImgExample();
        example.setOrderByClause(" order_by ");
        return selectByExample(example);
    }

}