package com.web.site.service.promotion;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.site.common.orm.Page;
import com.web.site.service.BaseService;
import com.web.site.dao.promotion.ActivityMapper;
import com.web.site.entity.promotion.Activity;
import com.web.site.entity.promotion.ActivityExample;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
    * 活动表 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-11-28
 */
@Service
public class ActivityService extends BaseService<ActivityMapper, Activity, ActivityExample> {


    public PageInfo selectPage(Page page, Map<String, String> map) {
        PageHelper.startPage(page.getTotal(),page.getLength(),true);
        return  new PageInfo(baseMapper.selectPage(map));
    }
}