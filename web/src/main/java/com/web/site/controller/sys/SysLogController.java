package com.web.site.controller.sys;

import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.orm.Table;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.sys.SysLog;
import com.web.site.entity.sys.SysLogExample;
import com.web.site.service.sys.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/8/30 16:36
 * @Modified By:
 */
@RestController
@RequestMapping("sys/log")
public class SysLogController extends BaseController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("")
    public Object list(){
        SysLogExample example = new SysLogExample();
        example.setOrderByClause(" id desc ");
        Page page = initPage();
        page.setTotal((int) sysLogService.countByExample(example));
        example.setPage(page);
        List<SysLog> sysLogs = sysLogService.selectByExample(example);
        return Responses.table(page.getTotal(),sysLogs);
    }
}
