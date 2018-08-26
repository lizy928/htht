package com.htht;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author 李正元
 * @create 2018-08-11 1:12
 * @desc 核心启动类
 **/

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.htht.*")
public class Application {

    private static final Class<Application> applicationClass = Application.class;
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
        logger.info("Application has started");
    }
}
