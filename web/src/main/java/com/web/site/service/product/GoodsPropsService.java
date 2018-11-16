package com.web.site.service.product;

import com.alibaba.fastjson.JSONObject;
import com.web.site.common.support.keygen.MyKeyGenerator;
import com.web.site.dao.product.GoodsPropsMapper;
import com.web.site.entity.product.GoodsProps;
import com.web.site.entity.product.GoodsPropsExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.Set;

/**
 * <p>
    * 商品属性 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class GoodsPropsService extends BaseService<GoodsPropsMapper, GoodsProps, GoodsPropsExample> {


    @Transactional
    public void create(JSONObject o) {
        Long goodsId = Long.parseLong(o.getString("goodsId"));
        Set<String> keySet = o.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            if (!"goodsId".equals(key)){
                String cnt = o.getString(key);
                JSONObject obj = (JSONObject) JSONObject.parseObject(cnt);
                Long id = obj.getLong("id");
                String value = obj.getString("value");
                if (null != id){
                    GoodsProps goodsProps = selectByPrimaryKey(id);
                    goodsProps.setPropValue(value);
                    updateByPrimaryKeySelective(goodsProps);
                }else{
                    GoodsProps goodsProps = new GoodsProps();
                    goodsProps.setGoodsId(goodsId);
                    goodsProps.setPropValue(value);
                    goodsProps.setPropId(Long.parseLong(key));
                    goodsProps.setId(MyKeyGenerator.genKey());
                    insertSelective(goodsProps);
                }

            }
        }
    }
}