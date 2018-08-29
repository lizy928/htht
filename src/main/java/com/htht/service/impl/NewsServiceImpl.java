package com.htht.service.impl;

import com.htht.dao.NewsDao;
import com.htht.entity.News;
import com.htht.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Service
public class NewsServiceImpl implements NewsService {

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
}
