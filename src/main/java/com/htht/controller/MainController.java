package com.htht.controller;

import com.htht.entity.User;
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
@RequestMapping("/test")
@Controller
public class MainController {

    @RequestMapping(value = "test")
    public Object test(Model model){

        User user1 = new User();
        user1.setId(001);
        user1.setName("李白");
        user1.setPassword("1230");
        User user2 = new User();
        user2.setId(002);
        user2.setName("露娜");
        user2.setPassword("1230");
        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/test2")
    public String index(){
        return "index";
    }

}
