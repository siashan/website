package com.web.site.controller.product;

import com.github.pagehelper.PageInfo;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.spring.Responses;
import com.web.site.entity.product.Goods;
import com.web.site.entity.product.GoodsExample;
import com.web.site.entity.product.GoodsSpec;
import com.web.site.entity.product.Product;
import com.web.site.service.product.GoodsService;
import com.web.site.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/22 13:38
 * @Modified By:
 */
@RestController
@RequestMapping("admin/product")
public class ProductController extends BaseController {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ProductService productService;

    /**
     * Description:商品列表  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/22 13:47
     */
    @RequestMapping("goodsList")
    public Object list() {
        PageInfo pageInfo = goodsService.selectAllWithPage(initPage());
        return Responses.bt((int) pageInfo.getTotal(),pageInfo.getList());
    }

    @RequestMapping("getProducts")
    public  Object getProducts(Long id){
        List<Product> products = productService.selectByGoodsId(id);
        return Responses.success(products);
    }

    @RequestMapping("saveStock")
    public Object saveStock(Product product){
        productService.updateByPrimaryKeySelective(product);
        return Responses.success();
    }
}
