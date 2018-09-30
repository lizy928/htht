package com.htht.controller;

import com.htht.entity.News;
import com.htht.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Object getNewsById(int id){
        return buildSuccJson(newsService.getNewsById(id));
    }

    @RequestMapping("addNews")
    public Object addNews(@RequestBody News news){
        try{
            newsService.addNews(news);
            return buildSuccJson();
        }catch (Exception e){
            return buildErrJson("操作失败!");
        }
    }

    @RequestMapping("deleteNewsById")
    public Object deleteNewsById(int Id){
        try {
            newsService.deleteNews(Id);
            return buildSuccJson();
        }catch (Exception e){
            return buildErrJson("操作失败!");
        }

    }

    @RequestMapping("updateNews")
    public Object updateNews(@RequestBody News news){
        try {
            newsService.updateNews(news);
            return buildSuccJson();
        }catch (Exception e){
            return buildErrJson("操作失败!");
        }
    }

}
