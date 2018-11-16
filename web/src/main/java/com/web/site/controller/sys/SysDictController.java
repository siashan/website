package com.web.site.controller.sys;

import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.spring.Responses;
import com.web.site.entity.sys.SysDict;
import com.web.site.entity.sys.SysDictExample;
import com.web.site.service.sys.SysDictService;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/4 20:15
 * @Modified By:
 */
@RestController
@RequestMapping("sys/dict")
public class SysDictController extends BaseController {
    @Autowired
    private SysDictService sysDictService;

    @RequestMapping("dictList")
    public Object dictList(SysDict dict){
        SysDictExample example = new SysDictExample();
        example.setOrderByClause(" dict_group , id ");
        SysDictExample.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotBlank(dict.getDictGroup())){
            criteria.andDictGroupEqualTo(dict.getDictGroup());
        }
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) sysDictService.countByExample(example));
        List<SysDict> sysDicts = sysDictService.selectByExample(example);
        return Responses.bt(page.getTotal(),sysDicts);
    }

    @RequestMapping("save")
    public Object save(SysDict dict ){
        if (null == dict.getId()){
            sysDictService.insertSelective(dict);
        }else{
            sysDictService.updateByPrimaryKeySelective(dict);
        }
        return  Responses.success();
    }

    @RequestMapping("del")
    public Object del(Long id){
        return sysDictService.deleteByPrimaryKey(id) > 0 ? Responses.success():Responses.error("删除失败");
    }

}
