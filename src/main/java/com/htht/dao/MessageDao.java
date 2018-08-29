package com.htht.dao;

import com.htht.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Mapper
public interface MessageDao {

    List<News> getAll();

    News getMessageById(@Param("Id") int Id);

    void updateMessage(@Param("news") News news);

    void deleteMessageById(@Param("Id") int Id);
}
