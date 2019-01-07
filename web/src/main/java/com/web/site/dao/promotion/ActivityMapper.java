package com.web.site.dao.promotion;

import java.util.List;
import java.util.Map;
import com.web.site.entity.promotion.Activity;
import com.web.site.dao.BaseMapper;
import com.web.site.entity.promotion.ActivityExample;

public interface ActivityMapper extends BaseMapper<Activity, ActivityExample> {


    List selectPage(Map<String, String> map);
}