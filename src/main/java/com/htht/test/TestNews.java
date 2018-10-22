package com.htht.test;

import com.htht.Application;
import com.htht.entity.News;
import com.htht.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.Environment;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestNews {

    @Autowired
    private NewsService newsService;

    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }

    @Test
    public void testNews(){
        List<News> newsList = newsService.getAll();
        System.out.println(newsList);
    }


}
