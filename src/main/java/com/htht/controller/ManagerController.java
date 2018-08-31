package com.htht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public Object productManager(){
        return "manager/productMana";
    }
}
