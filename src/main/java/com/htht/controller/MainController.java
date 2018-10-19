package com.htht.controller;

import com.alibaba.fastjson.JSONObject;
import com.htht.Cache.TextCache;
import com.htht.service.NewsService;
import com.htht.service.ProductService;
import com.sun.deploy.net.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import sun.net.www.http.HttpClient;

import javax.jws.WebParam;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;

/**
 * @author 李正元
 * @create 2018-08-11 23:39
 * @desc
 **/
@RequestMapping("main")
@Controller
public class MainController extends BaseController{

    @Autowired
    private ProductService productService;

    @Autowired
    private NewsService newsService;
/*
    @Autowired
    private TextCache textCache;*/

    @RequestMapping(value = "homePage")
    public Object homePage(Model model){
        model.addAttribute("productList",productService.getHeadProductList());
        model.addAttribute("newsList",newsService.getHeadNewsList());
       // model.addAttribute("homePageTextMap",textCache.getHomePageTextMap());
        return "index";
    }

    @RequestMapping("/headCommon")
    public Object headCommon(){
        return "head-common";
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
    public Object contact(){
        return "contact";
    }

   /* @RequestMapping("map")
    public Object getMap(){
        String url = "http://api.map.baidu.com/api?v=2.0&ak=F8GGZGTAevRPL7BwLtTjQvEzdAlpzqTt";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity httpEntity = new HttpEntity(headers);
        String result;
        ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        if (resp.getStatusCode().is2xxSuccessful()) {
            result = resp.getBody();
        }
        return result;
    }*/

   @RequestMapping("netFound")
   public Object netFound(){
       return "netFound";
   }

}
