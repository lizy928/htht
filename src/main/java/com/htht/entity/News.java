package com.htht.entity;

import java.util.Date;

/**
 * Created By Lizhengyuan on 18-8-29
 */
public class News {

     /*CREATE TABLE `news` (
       `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
      `type` int(2) NOT NULL,
      `title` varchar(255) CHARACTER SET utf8 DEFAULT '',
      `content` text CHARACTER SET utf8,
      `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
      ) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;*/

      private Integer Id;
      private Integer type;
      private String title;
      private String content;
      private Date createTime;

}
