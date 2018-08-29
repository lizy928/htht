package com.htht.entity;

import java.util.Date;

/**
 * Created By Lizhengyuan on 18-8-29
 */
public class Message {

      /*CREATE TABLE `message` (
      `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
      `name` varchar(20) CHARACTER SET utf8 DEFAULT '',
      `mobile` varchar(50) CHARACTER SET utf8 DEFAULT '',
      `content` text CHARACTER SET utf8,
      `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
      ) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;*/

      private Integer Id;
      private String name;
      private String mobile;
      private String content;
      private Date create_time;
}
