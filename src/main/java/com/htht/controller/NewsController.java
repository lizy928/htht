package com.htht.controller;

import com.htht.entity.News;
import com.htht.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@RequestMapping("news")
@RestController
public class NewsController extends BaseController{

    @Autowired
    private NewsService newsService;

    @RequestMapping("getAll")
    public Object getAll(){
       return buildSuccJson(newsService.getAll());
    }

    @RequestMapping("getNewsById")
    public Object getNewsById(int Id){
        return buildSuccJson(newsService.getNewsById(Id));
    }

    @RequestMapping("addNews")
    public Object addNews(News news){
        newsService.addNews(news);
        return buildSuccJson();
    }

    @RequestMapping("deleteNewsById")
    public Object deleteNewsById(int Id){
        newsService.deleteNews(Id);
        return buildSuccJson();
    }

    @RequestMapping("updateNews")
    public Object updateNews(News news){
        newsService.updateNews(news);
        return buildSuccJson();
    }

}
