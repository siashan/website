package com.web.site.controller.product;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.web.site.common.controller.BaseController;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.product.ProductItems;
import com.web.site.service.product.ProductItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/8/10 10:07
 * @Modified By:
 */
@RestController
@RequestMapping("admin/productItem")
public class ProductItemsController extends BaseController {

    @Autowired
    private ProductItemsService productItemsService;


    @RequestMapping("list")
    public Object itemsList(@RequestParam(value = "usefor",defaultValue = "1") String usefor){
        return Responses.success(productItemsService.selectTree(usefor));
    }

    @RequestMapping("loadLevel3")
    public Object loadLevel3(Integer id){
        ProductItems productItems = productItemsService.selectByPrimaryKey(id);
        if (null ==productItems || !productItems.getItemLevel().equals("2")){
            return  Responses.error("违法操作！");
        }
        return productItemsService.loadLevel3(id);
    }


    @RequestMapping("getItem")
    public Object getItem(Integer id){
        ProductItems productItems = productItemsService.selectByPrimaryKey(id);
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(ProductItems.class,"id","itemName","version","parentId","orderBy");
        JSONObject obj = JSONObject.parseObject(JSONObject.toJSONString(productItems,filter));

        return Responses.success(obj);
    }

    /**
     * Description:  <br/>
     *
     * @param: usefor   1 用于树形插件   2，用于select
     * @return:
     * @Author: kfc
     * @Date: 2018/8/16 14:47
     */
    @RequestMapping("getChild")
    public  Object getChild(Integer id,@RequestParam(value = "usefor",defaultValue = "1") String usefor){
        return Responses.success(productItemsService.selectChild(id,usefor));
    }

    @RequestMapping("save")
    public Object save(ProductItems items){
        int i = 0;
        if (null == items.getId()){
            ProductItems parentNode = productItemsService.selectByPrimaryKey(items.getParentId());
            items.setItemLevel((Integer.parseInt(parentNode.getItemLevel())+1) + "");
            items.setCreateTime(new Date());
            i = productItemsService.insertSelective(items);
        }else{
            i = productItemsService.updateByPrimaryKeySelectiveOptimistic(items);
        }
        return  i > 0 ? Responses.success():Responses.error();
    }








}
