package com.htht.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 李正元
 * @create 2018-09-09 16:11
 * @desc
 **/


@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ControllerParam {

    String addHeadParam();

}
