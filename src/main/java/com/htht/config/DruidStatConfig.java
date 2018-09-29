package com.htht.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李正元
 * @create 2018-08-27 1:53
 * @desc 数据源监控配置
 **/


@Component
public class DruidStatConfig {

    @Value("${druid.stat_username}")
    private String username;

    @Value("${druid.stat_password}")
    private String password;

    /**
     * druid数据源监控页面
     * @return
     */
    @Bean
    public ServletRegistrationBean dataSourceStat(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        registrationBean.setName("DruidStatView");
        Map<String,String> initParam = new HashMap<>();
        initParam.put("resetEnable","true");
        initParam.put("loginUsername",username);
        initParam.put("loginPassword",password);
        registrationBean.setInitParameters(initParam);
        return registrationBean;
    }

}
