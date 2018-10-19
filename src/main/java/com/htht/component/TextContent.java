package com.htht.component;

import com.htht.Cache.TextCache;
import com.htht.constant.KeyConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created By Lizhengyuan on 18-10-19
 */
@Component
@PropertySource(value = "classpath:homepagetext.properties",
        ignoreResourceNotFound = true, encoding = "utf8")
public class TextContent {

    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private TextCache textCache;

    @Bean
    public String initHomePageText(){
        String ontString = environment.getProperty(KeyConstant.HOMEPAGETEXT_ONE);
        String twoString = environment.getProperty(KeyConstant.HOMEPAGETEXT_TWO);
        String threeString = environment.getProperty(KeyConstant.HOMEPAGETEXT_THREE);
        textCache.init(ontString,twoString,threeString);
        System.out.println("首页文本加载成功>>>>>>>>>>>>>>>>"+ontString+"/n"+twoString+"/n"+threeString);
        System.out.println(textCache);
        System.out.println(textCache.getHomePageTextMap());
        return "hello world";
    }

}
