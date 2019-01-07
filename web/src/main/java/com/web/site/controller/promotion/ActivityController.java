package com.web.site.controller.promotion;

import com.github.pagehelper.PageInfo;
import com.web.site.common.controller.BaseController;
import com.web.site.common.support.response.ResponseData;
import com.web.site.common.support.response.Responses;
import com.web.site.service.promotion.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/11/29 9:22
 * @Modified By:
 */
@RestController
@RequestMapping("admin/activity")
public class ActivityController extends BaseController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("")
    public ResponseData list(){
        PageInfo pageInfo = activityService.selectPage(initPage(),requestMap(req));
        return Responses.table(pageInfo.getTotal(),pageInfo.getList());
    }

    @PostMapping("")
    public ResponseData save(){
        return null;
    }

}
