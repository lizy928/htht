package com.htht.controller;

import com.htht.entity.Message;
import com.htht.entity.News;
import com.htht.entity.Product;
import com.htht.service.MessageService;
import com.htht.service.NewsService;
import com.htht.service.ProductService;
import com.sun.deploy.net.HttpResponse;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created By Lizhengyuan on 18-8-31
 */
@RequestMapping("manager")
@Controller
public class ManagerController extends BaseController{

    @Autowired
    private ProductService productService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private MessageService messageService;

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
    public String productManager(Model model){
        //查询产品信息
        model.addAttribute("list",productService.getAll());
        return "manager/product_mana";
    }

    @RequestMapping("productEdit")
    public Object productEdit(@RequestParam(required = false) String id, Model model){
        if(StringUtils.isEmpty(id)){
            model.addAttribute("product",new ArrayList<Product>());
        }else {
            model.addAttribute("product",productService.getProductById(Integer.valueOf(id)));
        }
        return "manager/product_edit";
    }


    @RequestMapping("newsManager")
    public Object newsManager(Model model){
        model.addAttribute("list",newsService.getAll());
        return "manager/news_mana";
    }

    @RequestMapping("newsEdit")
    public Object newsEdit(@RequestParam(required = false) String id, Model model){
        if(StringUtils.isEmpty(id)){
            model.addAttribute("news",new ArrayList<News>());
        }else {
            model.addAttribute("news",newsService.getNewsById(Integer.valueOf(id)));
        }
        return "manager/news_edit";
    }

    @RequestMapping("messageManager")
    public Object messageManager(Model model){
        model.addAttribute("list",messageService.getAll());
        return "manager/message_mana";
    }

    @RequestMapping("messageEdit")
    public Object messageEdit(@RequestParam(required = false) String id, Model model){
        if(StringUtils.isEmpty(id)){
            model.addAttribute("",new ArrayList<Message>());
        }else {
            model.addAttribute("",messageService.getMessageById(Integer.valueOf(id)));
        }
        return "manager/messageEdit";
    }

}
