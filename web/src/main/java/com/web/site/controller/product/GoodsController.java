package com.web.site.controller.product;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.orm.Table;
import com.web.site.common.support.response.Responses;
import com.web.site.common.support.keygen.MyKeyGenerator;
import com.web.site.entity.product.*;
import com.web.site.service.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 商品控制层
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/9/20 10:29
 * @Modified By:
 */
@RestController
@RequestMapping("admin/goods")
public class GoodsController extends BaseController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private GoodsImgService goodsImgService;
    @Autowired
    private GoodsPropsService goodsPropsService;
    @Autowired
    private GoodsParamsService goodsParamsService;
    @Autowired
    private GoodsSpecService goodsSpecService;
    @Autowired
    private CategoryPropsService categoryPropsService;
    @Autowired
    private CategorySpecService categorySpecService;
    @Autowired
    private SpecService specService;
    @Autowired
    private SpecValuesService specValuesService;
    @Autowired
    private ProductService productService;

    /**
     * Description:商品列表  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/20 15:04
     */
    @RequestMapping("list")
    public Object list() {
        GoodsExample example = new GoodsExample();
        example.setOrderByClause(" create_time desc ");
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) goodsService.countByExample(example));
        List<Goods> goods = goodsService.selectByExample(example);
        return Responses.table(page.getTotal(), goods);
    }

    /**
     * Description:加载商品类目  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/20 15:05
     */
    @RequestMapping("loadCat")
    public Object loadCat() {
        List<Map<String, Object>> catList = categoryService.selectAllForSelect();
        return Responses.success(catList);
    }

    /**
     * Description:加载品牌  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/22 11:55
     */
    @RequestMapping("loadBrand")
    public Object loadBrand(Integer id) {
        List<Map<String, Object>> brands = brandService.selectCatBrand(id);
        return Responses.success(brands);
    }

    /**
     * Description:保存商品基本信息  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/22 16:31
     */
    @RequestMapping("saveBasic")
    public Object saveBasic(Goods goods, String imgs) {
        System.out.println(imgs);

        if (null == goods.getId()) {

            Long gid = MyKeyGenerator.genKey();
            goods.setId(gid);
            goods.setMkEnable("0");
            goods.setCreateTime(new Date());
            goodsService.insertSelective(goods);
        } else {
            goodsService.updateByPrimaryKeySelective(goods);
        }
        return Responses.success();
    }

    /**
     * Description:加载商品基本信息  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/22 16:32
     */
    @RequestMapping("getGoods")
    public Object getGoods(Long id) {

        Goods goods = goodsService.selectByPrimaryKey(id);
        Long catId = goods.getCatId();
        Category category = categoryService.selectByPrimaryKey(catId);
        String[] catStr = category.getCatPath().split("\\|");
        Long[] catPath = new Long[catStr.length];
        for (int i = 0; i < catStr.length; i++) {
            catPath[i] = Long.parseLong(catStr[i]);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("catVal", catPath);
        map.put("goods", goods);
        return Responses.success(map);
    }

    /**
     * Description:保存商品图片信息  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/11 10:29
     */
    @RequestMapping("saveGoodsImg")
    public Object saveGoodsImg(Long goodsId, String imgs) {
        String[] imgList = imgs.split(",");
        // 保存商品图片信息
        goodsImgService.create(goodsId, imgList);
        return Responses.success();
    }

    /**
     * Description:加载商品图片信息  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/11 11:02
     */
    @RequestMapping("getGoodsImg")
    public Object getGoodsImg(Long id) {
        GoodsImgExample example = new GoodsImgExample();
        example.setOrderByClause(" order_by ");
        example.createCriteria().andGoodsIdEqualTo(id);
        List<GoodsImg> goodsImgs = goodsImgService.selectByExample(example);
        return Responses.success(goodsImgs);
    }

    /**
     * Description:加载商品参数信息  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/12 10:48
     */
    @RequestMapping("getGoodsProps")
    public Object getGoodsProps(Long id) {
        Goods goods = goodsService.selectByPrimaryKey(id);
        // 查询类目关联属性
        Long catId = goods.getCatId();
        CategoryPropsExample categoryPropsExample = new CategoryPropsExample();
        categoryPropsExample.setOrderByClause(" order_by ");
        categoryPropsExample.createCriteria().andCategoryIdEqualTo(catId);
        List<CategoryProps> categoryProps = categoryPropsService.selectByExample(categoryPropsExample);
        // 查询商品属性
        GoodsPropsExample example = new GoodsPropsExample();
        GoodsPropsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsIdEqualTo(id);
        List<GoodsProps> goodsProps = goodsPropsService.selectByExample(example);
        Map<String, Object> map = new HashMap<>();
        map.put("cp", categoryProps);
        map.put("gp", goodsProps);
        return Responses.success(map);
    }

    /**
     * Description:保存商品参数信息  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/13 14:59
     */
    @RequestMapping("saveGoodProps")
    public Object saveGoodProps(HttpServletRequest request) {
        Map<String, String> map = requestMap(request);
        JSONObject o = (JSONObject) JSONObject.toJSON(map);
        JSONObject reqStr = JSONObject.parseObject(o.getString("reqStr"));
        goodsPropsService.create(reqStr);
        return Responses.success();
    }


    /**
     * Description:商品规格  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/15 13:44
     */
    @RequestMapping("getGoodsSpec")
    public Object getGoodsSpc(Long id) {
        Goods goods = goodsService.selectByPrimaryKey(id);
        Long catId = goods.getCatId();
        // 类目规格
        List<Map<String,Object>> specs = specService.selectByCatId(catId);
        if (!specs.isEmpty()){
            for (Map<String,Object> m : specs){
                List<SpecValues> vals = specValuesService.selectBySpecId((Long) m.get("id"));
                m.put("vals",vals);
            }
        }
        // 商品规格
        ProductExample example = new ProductExample();
        example.createCriteria().andGoodsIdEqualTo(id);
        List<Product> goodsSpecs = productService.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        map.put("cs",specs);
        map.put("gs",goodsSpecs);
        map.put("goodsSn",goods.getGoodsSn());
        return Responses.success(map);
    }

    /**
     * Description:保存商品规格  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/10/17 16:56
     */
    @RequestMapping("saveGoodsSpec")
    public Object  saveGoodsSpec(String reqStr){
        System.out.println(reqStr);

        JSONArray jobj = JSONArray.parseArray(reqStr);
        productService.create(jobj);
        return Responses.success();
    }

    @RequestMapping("save")
    public Object save(Long goodsId){
        ProductExample example = new ProductExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        List<Product> products = productService.selectByExample(example);
        if (products.isEmpty()){
            Goods goods = goodsService.selectByPrimaryKey(goodsId);
            Product product = new Product();
            product.setId(MyKeyGenerator.genKey());
            product.setGoodsId(goods.getId());
            product.setCostPrice(goods.getCost());
            product.setPrice(goods.getPrice());
            //                product.setProductName();
//            product.setProductSku(productSku);
//            product.setProductSkuRemark(productSkuRemark);
            product.setProductSn(goods.getGoodsSn());
//            product.setProductStock(goods.get);
//            product.setProductImg(productImg);
            product.setCreateTime(new Date());
            productService.insertSelective(product);
        }
        return Responses.success();
    }

}
