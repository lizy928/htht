package com.htht.cache;

import com.htht.constant.KeyConstant;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Lizhengyuan on 18-10-19
 * 首页文字缓存
 */
@Configuration
@Order(1)
public class TextCache implements ApplicationContextInitializer {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(TextCache.class);

    private static Map<String,String> homePageTextMap = new HashMap<>();

    public void init(String ontText,String twoText, String threeText){
        homePageTextMap.put(KeyConstant.HOMEPAGETEXT_ONE, ontText);
        homePageTextMap.put(KeyConstant.HOMEPAGETEXT_TWO, twoText);
        homePageTextMap.put(KeyConstant.HOMEPAGETEXT_THREE, threeText);
    }

    public Map<String, String> getHomePageTextMap(){
        return homePageTextMap;
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        logger.info("init TextCache");
    }
}
