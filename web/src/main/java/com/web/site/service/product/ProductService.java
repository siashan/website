package com.web.site.service.product;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.web.site.common.support.keygen.MyKeyGenerator;
import com.web.site.dao.product.ProductMapper;
import com.web.site.entity.product.Product;
import com.web.site.entity.product.ProductExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
    * 商品sku 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-10-20
 */
@Service
public class ProductService extends BaseService<ProductMapper, Product, ProductExample> {

	@Transactional
	public void create(JSONArray jArr) {
	    for (int i = 0; i < jArr.size(); i++) {
	        JSONObject obj = (JSONObject) jArr.get(i);
	        Long id = obj.getLong("id");
	        Long goodsId = obj.getLong("goodsId");
	        Integer productStock = obj.getInteger("productStock");
	        Double price = obj.getDouble("price");
	        Double costPrice = obj.getDouble("costPrice");
	        String productImg = obj.getString("productImg");
	        String productSn = obj.getString("productSn");
	        String productSku = obj.getString("productSku");
	        String productSkuRemark = obj.getString("productSkuRemark");
	        if (null == id) {
	            Product product = new Product();
	            product.setId(MyKeyGenerator.genKey());
	            product.setGoodsId(goodsId);
	            product.setCostPrice(costPrice);
	            product.setPrice(price);
	            //                product.setProductName();
	            product.setProductSku(productSku);
	            product.setProductSkuRemark(productSkuRemark);
	            product.setProductSn(productSn);
	            product.setProductStock(productStock);
	            product.setProductImg(productImg);
	            product.setCreateTime(new Date());
	            insertSelective(product);
	        } else {
	            Product product = selectByPrimaryKey(id);
	            product.setCostPrice(costPrice);
	            product.setPrice(price);
	            //                product.setProductName();
	            product.setProductSku(productSku);
	            product.setProductSkuRemark(productSkuRemark);
	            product.setProductSn(productSn);
	            product.setProductImg(productImg);
	            product.setProductStock(productStock);
	            updateByPrimaryKeySelective(product);
	        }
	    }
	}

	public List<Product> selectByGoodsId(Long id) {
	    return baseMapper.selectByGoodsId(id);
	}


}