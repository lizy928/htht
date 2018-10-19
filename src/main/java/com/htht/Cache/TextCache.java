package com.htht.Cache;

import com.htht.constant.KeyConstant;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created By Lizhengyuan on 18-10-19
 * 首页文字缓存
 */

public class TextCache implements ApplicationContextInitializer {

    private Logger logger = (Logger) LoggerFactory.getLogger(TextCache.class);

    private static Map<String,String> homePageTextMap = new HashMap<>();

    public void init(String ontText,String twoText, String threeText){
        homePageTextMap.put(KeyConstant.HOMEPAGETEXT_ONE, ontText);
        homePageTextMap.put(KeyConstant.HOMEPAGETEXT_ONE, twoText);
        homePageTextMap.put(KeyConstant.HOMEPAGETEXT_ONE, threeText);
    }

    public Map<String, String> getHomePageTextMap(){
        return homePageTextMap;
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        logger.info("init TextCache");
    }
}
