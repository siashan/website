package com.web.site.controller.admin;

import com.web.site.common.controller.BaseController;
import com.web.site.common.spring.Responses;
import com.web.site.entity.admin.CityArea;
import com.web.site.entity.admin.CityAreaExample;
import com.web.site.service.admin.CityAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 行政区划控制层
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/8/31 10:13
 * @Modified By:
 */
@RestController
@RequestMapping("admin/area")
public class CityAreaController extends BaseController {


    @Autowired
    private CityAreaService cityAreaService;

    @RequestMapping("list")
    public Object list() {
        CityAreaExample example = new CityAreaExample();
        example.setOrderByClause(" area_code ");
        List<CityArea> cityAreas = cityAreaService.selectByExample(example);
        return Responses.success(cityAreas);
    }

    @RequestMapping("del")
    public Object del(Integer id){
        return cityAreaService.deleteByPrimaryKey(id) > 0 ? Responses.success() : Responses.error();
    }

    @RequestMapping("save")
    public  Object save(CityArea cityArea){
        int i = 0;
        if (null == cityArea.getId()){
            i = cityAreaService.insertSelective(cityArea);
        }else{
           i =  cityAreaService.updateByPrimaryKeySelective(cityArea);
        }
        return i > 0 ? Responses.success() : Responses.error();
    }

}
