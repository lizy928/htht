package com.htht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 李正元
 * @create 2018-08-11 23:43
 * @desc 测试用户
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    private Integer id;
    private String name;
    private String password;

}
