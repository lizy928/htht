package com.htht.controller;

import com.htht.entity.User;
import com.htht.service.NewsService;
import com.htht.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/test2")
    public String index(){
        return "news";
    }

}
