package com.web.site.service.sales;

import com.web.site.service.BaseService;
import com.web.site.dao.sales.ActivityMapper;
import com.web.site.entity.sales.Activity;
import com.web.site.entity.sales.ActivityExample;
import org.springframework.stereotype.Service;

/**
 * <p>
    * 活动表 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-11-14
 */
@Service
public class ActivityService extends BaseService<ActivityMapper,Activity,ActivityExample>  {

}

