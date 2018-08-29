package com.htht.dao;

import com.htht.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Mapper
public interface NewsDao {

    List<News> getAll();

    News getNewsById(@Param("Id") int Id);

    void updateNews(@Param("news") News news);

    void deleteNewsById(@Param("Id") int Id);
}
