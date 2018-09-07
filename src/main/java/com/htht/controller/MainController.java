package com.htht.controller;

import com.htht.service.NewsService;
import com.htht.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * @author 李正元
 * @create 2018-08-11 23:39
 * @desc
 **/
@RequestMapping("main")
@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "homePage")
    public Object homePage(Model model){
        model.addAttribute("productList",productService.getAll());
        model.addAttribute("newsList",newsService.getAll());
        return "index";
    }

    @RequestMapping("/allNews")
    public Object listNews(Model model){
        model.addAttribute("newsList",newsService.getAll());
        return "news";
    }

    @RequestMapping("/allProduct")
    public Object listProducts(Model model){
        model.addAttribute("productList",productService.getAll());
        return "products";
    }

    @RequestMapping("/aboutUs")
    public Object about(Model model){
        model.addAttribute("",0);
        return "about";
    }

    @RequestMapping("/contactUs")
    public Object contact(Model model){
        model.addAttribute("",0);
        return "contact";
    }

}
