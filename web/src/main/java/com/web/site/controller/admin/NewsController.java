package com.web.site.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.orm.Table;
import com.web.site.common.support.response.ResponseCode;
import com.web.site.common.support.response.Responses;
import com.web.site.entity.admin.News;
import com.web.site.entity.admin.NewsExample;
import com.web.site.service.admin.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/7/19 11:45
 * @Modified By:
 */
@RestController
@RequestMapping("admin/news")
public class NewsController extends BaseController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("newsList")
    public  Object newsList(){
        NewsExample example = new NewsExample();
        example.setOrderByClause(" id desc ");
        Page page = initPage();
        example.setPage(page);
        page.setTotal((int) newsService.countByExample(example));
        List<News> news = newsService.selectByExample(example);
        return Responses.table(page.getTotal(),news);
    }

    @RequestMapping("del")
    public Object del(Long id){
        return newsService.deleteByPrimaryKey(id) > 0 ? Responses.success():Responses.error(ResponseCode.CODE_50005);
    }

    @RequestMapping("save")
    public Object save(News news){
        if (null == news.getId()){
            newsService.insertSelective(news);
        }else{
            newsService.updateByPrimaryKeySelective(news);
        }
        return Responses.success();
    }

    @RequestMapping("getNews")
    public Object getNews(Long id){
        News news = newsService.selectByPrimaryKey(id);
        return Responses.success(JSONObject.parseObject(JSONObject.toJSONString(news)));
    }
}
