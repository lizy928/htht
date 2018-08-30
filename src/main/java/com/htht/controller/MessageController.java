package com.htht.controller;

import com.htht.entity.Message;
import com.htht.entity.Product;
import com.htht.service.MessageService;
import com.htht.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Lizhengyuan on 18-8-29
 */
@RequestMapping("message")
@RestController
public class MessageController extends BaseController{

    @Autowired
    private MessageService messageService;

    @RequestMapping("getAll")
    public Object getAll(){
       return buildSuccJson(messageService.getAll());
    }

    @RequestMapping("getProductById")
    public Object getNewsById(int Id){
        return buildSuccJson(messageService.getMessageById(Id));
    }

    @RequestMapping("addProduct")
    public Object addNews(Message message){
        messageService.addMessage(message);
        return buildSuccJson();
    }

    @RequestMapping("deleteProductById")
    public Object deleteNewsById(int Id){
        messageService.deleteMessage(Id);
        return buildSuccJson();
    }

    @RequestMapping("updateProduct")
    public Object updateNews(Message message){
        messageService.updateMessage(message);
        return buildSuccJson();
    }

}
