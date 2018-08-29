package com.htht.dao;

import com.htht.entity.News;
import com.sun.org.apache.bcel.internal.generic.NEW;
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

    void add(@Param("news") News news);
}
