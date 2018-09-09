package com.htht.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * Created By Lizhengyuan on 18-8-31
 */
@RequestMapping("manager")
@Controller
public class ManagerController extends BaseController{

    @RequestMapping("homePage")
    public Object index(){
        return "manager/index";
    }

    @RequestMapping("login")
    public Object login(){
        return "homePage";
    }

    @RequestMapping("toLogin")
    public Object toLogin(){
        return "manager/login";
    }

    @RequestMapping("productManager")
    public String productManager(HttpServletResponse response){
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
        return "manager/product_mana";
    }

    @RequestMapping("productEdit")
    public Object productEdit(HttpServletResponse response){
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
        return "manager/product_edit";
    }


    @RequestMapping("newsManager")
    public Object newsManager(){
        return "manager/newsMana";
    }


}
