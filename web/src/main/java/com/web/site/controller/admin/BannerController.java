package com.web.site.controller.admin;

import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.admin.Banners;
import com.web.site.entity.admin.BannersExample;
import com.web.site.service.admin.BannersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/18 10:14
 * @Modified By:
 */
@RestController
@RequestMapping("admin/banner")
@Api(value = "后台banner条管理相关api", tags = "后台banner管理相关api")
public class BannerController extends BaseController {

    @Autowired
    private BannersService bannersService;

    @ApiOperation(value = "查询banner列表", notes = "查询数据库中全部banner列表")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "bannerList", method = RequestMethod.GET)
    public Object bannerList() {
        BannersExample example = new BannersExample();
        example.setOrderByClause(" id desc ");
        BannersExample.Criteria criteria = example.createCriteria();
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) bannersService.countByExample(example));
        List<Banners> banners = bannersService.selectByExample(example);
        return Responses.bt(page.getTotal(), banners);
    }

    @ApiOperation(value = "创建/修改banner实体", notes = "保存banner实体")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "userName", value = "用户名称", paramType = "form", dataType = "string")
    })
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Object save(Banners banners) {
        if (null == banners.getId()) {
            bannersService.insertSelective(banners);
        } else {
            bannersService.updateByPrimaryKeySelective(banners);
        }
        return Responses.success();
    }

    @RequestMapping(value = "del", method = RequestMethod.POST)
    public Object del(Long id) {
        return bannersService.deleteByPrimaryKey(id) > 0 ? Responses.success() : Responses.error();
    }
}
