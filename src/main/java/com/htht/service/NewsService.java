package com.htht.service;

import com.htht.entity.News;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
public interface NewsService {

    List<News> getAll();

    News getNewsById(int Id);

    void updateNews(News news);

    void deleteNews(int Id);

    void addNews(News news);
}
