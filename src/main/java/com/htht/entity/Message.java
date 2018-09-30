package com.htht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

      private Integer Id;
      private String name;
      private String mobile;
      private String content;
      private Date createTime;
}
