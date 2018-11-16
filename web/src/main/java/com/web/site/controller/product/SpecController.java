package com.web.site.controller.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.spring.Responses;
import com.web.site.entity.product.Spec;
import com.web.site.entity.product.SpecExample;
import com.web.site.entity.product.SpecValues;
import com.web.site.service.product.SpecService;
import com.web.site.service.product.SpecValuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 规格控制层
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/9/1 16:37
 * @Modified By:
 */
@RestController
@RequestMapping("admin/spec")
public class SpecController extends BaseController {
    @Autowired
    private SpecService specService;
    @Autowired
    private SpecValuesService specValuesService;

    @RequestMapping("list")
    public Object list(){
        SpecExample example = new SpecExample();
        example .setOrderByClause(" order_by ");
        Page page = initPage();
        page .setTotal((int) specService.countByExample(example));
        example.setPage(page);
        List<Spec> specs = specService.selectByExample(example);
        Object o = JSONArray.toJSONString(specs);
        System.out.println(o.toString());
        return Responses.bt(page.getTotal(),specs);
    }

    @RequestMapping("save")
    public Object save(Spec spec){
        if (null == spec.getId()){
            spec.setVersion(0);
            spec.setCreateTime(new Date());
            specService.insertSelective(spec);
        }else{
            specService.updateByPrimaryKeySelective(spec);
        }
        return Responses.success();
    }

    /**
     * Description: 删除 <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/8 11:34
     */
    @RequestMapping("del")
    public Object del(Integer id){
        return  specService.deleteByPrimaryKey(id) > 0 ? Responses.success():Responses.error();
    }

    /**
     * Description:加载规格对应的规格值  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/8 14:55
     */
    @RequestMapping("listValue")
    public Object listValue(Long id){
        List<SpecValues> list  = specValuesService.selectBySpecId(id);
        return Responses.success(list);
    }

    /**
     * Description:保存规格值  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/8 14:55
     */
    @RequestMapping("saveValue")
    public Object saveValue(SpecValues values){
        if (null == values.getId()){
            values.setVersion(0);
            specValuesService.insertSelective(values);
        }else {
            specValuesService.updateByPrimaryKeySelective(values);
        }
        return Responses.success();
    }

    /**
     * Description: 删除 <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/8 11:34
     */
    @RequestMapping("delValue")
    public Object delValue(Integer id){
        return  specValuesService.deleteByPrimaryKey(id) > 0 ? Responses.success():Responses.error();
    }

}
