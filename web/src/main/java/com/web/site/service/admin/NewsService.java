package com.web.site.service.admin;

import com.web.site.dao.admin.NewsMapper;
import com.web.site.entity.admin.News;
import com.web.site.entity.admin.NewsExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
    * 新闻资讯 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class NewsService extends BaseService<NewsMapper, News, NewsExample> {


}