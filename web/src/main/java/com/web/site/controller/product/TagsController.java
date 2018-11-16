package com.web.site.controller.product;

import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.spring.Responses;
import com.web.site.entity.product.Tags;
import com.web.site.entity.product.TagsExample;
import com.web.site.service.product.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 标签控制层
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/9/14 17:27
 * @Modified By:
 */
@RestController
@RequestMapping("admin/tags")
public class TagsController extends BaseController {

    @Autowired
    private TagsService tagsService;

    /**
     * Description:标签列表  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/17 10:40
     */
    @RequestMapping("list")
    public Object  list(){
        TagsExample example = new TagsExample();
        example.setOrderByClause(" order_by ");
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) tagsService.countByExample(example));
        List<Tags> tags = tagsService.selectByExample(example);
        return Responses.bt(page.getTotal(),tags);
    }

    /**
     * Description:保存标签  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/17 10:40
     */
    @RequestMapping("save")
    public Object save(Tags tags){
        if (null == tags.getId()){
            tagsService.insertSelective(tags);
        }else{
            tagsService.updateByPrimaryKeySelective(tags);
        }
        return Responses.success();
    }

    /**
     * Description:删除tag  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/17 10:42
     */
    @RequestMapping("del")
    public Object del(Integer id){
        return tagsService.deleteByPrimaryKey(id) > 0 ? Responses.success():Responses.error();
    }

}
