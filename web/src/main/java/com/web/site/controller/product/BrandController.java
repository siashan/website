package com.web.site.controller.product;

import com.alibaba.fastjson.JSONArray;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.orm.Table;
import com.web.site.common.support.response.ResponseCode;
import com.web.site.common.support.response.Responses;
import com.web.site.common.util.JsonUtil;
import com.web.site.entity.product.Brand;
import com.web.site.entity.product.BrandExample;
import com.web.site.service.product.BrandService;
import com.web.site.service.product.ProductItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/8/15 10:40
 * @Modified By:
 */
@RestController
@RequestMapping("admin/brand")
public class BrandController extends BaseController {

    @Autowired
    private BrandService brandService;
    @Autowired
    private ProductItemsService productItemsService;

    @RequestMapping("list")
    public Object list() {
        BrandExample example = new BrandExample();
        example.setOrderByClause(" id ");
        BrandExample.Criteria criteria = example.createCriteria();
        // 分页
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int)brandService.countByExample(example));
        List<Brand> brands = brandService.selectByExample(example);
        return Responses.table(page.getTotal(),brands);
    }

    @RequestMapping("save")
    public Object save(Brand brand){
        if (null == brand.getId()){
            brand.setCreateTime(new Date());
            brandService.insertSelective(brand);
        }else{
            brandService.updateByPrimaryKeySelective(brand);
        }
        return Responses.success();
    }

    @RequestMapping("getBrand")
    public Object edit(Long id){
        Brand brand = brandService.selectByPrimaryKey(id);

        String s = JsonUtil.obj2jsonStr(brand, new String[]{"createTime", "version"});

        Map<String,Object> reMap = new HashMap<>();
        JSONArray jsonArray = new JSONArray();
        reMap.put("brand",s);
        return Responses.success(reMap);
    }

    @RequestMapping("del")
    public Object del(Long id){
        return brandService.deleteByPrimaryKey(id) > 0 ? Responses.success() : Responses.error(ResponseCode.CODE_50005);
    }




}
