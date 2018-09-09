package com.htht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
      /*CREATE TABLE `product` (
      `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
      `type` int(11) NOT NULL,
      `name` varchar(255) CHARACTER SET utf8 DEFAULT '',
      `desc` text CHARACTER SET utf8,
      `image` varchar(255) CHARACTER SET utf8 DEFAULT ''
      ) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;*/

      private Integer pid;
      private String pname;
      private String pdesc;
      private String pimage;
      private Integer porder;

}
