package com.htht.component;

import com.htht.cache.TextCache;
import com.htht.constant.KeyConstant;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

/**
 * Created By Lizhengyuan on 18-10-19
 */
@Configuration
@PropertySource(value = "classpath:homepagetext.properties",
        ignoreResourceNotFound = true, encoding = "utf8")
@Order(2)
public class TextContent {

    private Logger logger = LoggerFactory.getLogger(TextCache.class);

    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private TextCache textCache;

    @Bean
    public String initHomePageText(){
        String ontString = environment.getProperty(KeyConstant.HOMEPAGETEXT_ONE);
        String twoString = environment.getProperty(KeyConstant.HOMEPAGETEXT_TWO);
        String threeString = environment.getProperty(KeyConstant.HOMEPAGETEXT_THREE);
        logger.info("首页文本加载成功>>>>>>>>>>>>>>>>\"+ontString+\"\"+twoString+\"\"+threeString");
        System.out.println("首页文本加载成功>>>>>>>>>>>>>>>>\"+ontString+\"\"+twoString+\"\"+threeString");
        if(StringUtils.isEmpty(ontString) && StringUtils.isEmpty(twoString) && StringUtils.isEmpty(threeString) ){
            logger.error("首页文本加载异常!!!!!");
        }
        textCache.init(ontString,twoString,threeString);
        return "hello world";
    }

}
