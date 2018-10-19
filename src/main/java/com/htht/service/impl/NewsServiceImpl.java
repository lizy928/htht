package com.htht.service.impl;

import com.htht.dao.NewsDao;
import com.htht.entity.News;
import com.htht.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Value("${home-page.news-num}")
    private String homePageNewsNumStr;

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> getAll() {
        return newsDao.getAll();
    }

    @Override
    public News getNewsById(int Id) {
        return newsDao.getNewsById(Id);
    }

    @Override
    public void updateNews(News news) {
        newsDao.updateNews(news);
    }

    @Override
    public void deleteNews(int Id) {
        newsDao.deleteNewsById(Id);
    }

    @Override
    public void addNews(News news) {
        newsDao.add(news);
    }

    @Override
    public Object getHeadNewsList() {
        int homePageNewsNum = Integer.parseInt(homePageNewsNumStr);
        return newsDao.getHeadNewsList(homePageNewsNum);
    }
}
