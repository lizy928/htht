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

      private Integer pid;
      private String pname;
      private String pdesc;
      private String pimage;
      private Integer porder;

}
