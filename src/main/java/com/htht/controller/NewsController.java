package com.htht.controller;

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
}
