package com.htht.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Lizhengyuan on 18-9-30
 */
@RequestMapping("map")
@RestController
public class CommonController extends BaseController {

    @RequestMapping("map")
    public Object getMap(){
        return "map/map";
    }


}
