package com.htht.aop;

import com.alibaba.fastjson.JSONObject;
import com.htht.util.IpUtil;
import com.htht.util.RequestHolder;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @author 李正元
 * @create 2018-09-09 16:30
 * @desc
 **/
@Component
@Aspect
public class ControllerParamAop {

    public final String ip_url = "http://ip.taobao.com/service/getIpInfo.php?ip=";

   /* *//**
     * 定义有一个切入点，controller
     *//*
    @Pointcut("execution(public * com.htht.controller..*.*(..))")
    public void addParam() {
    }

    @After("addParam()")
    public void doBefore(JoinPoint joinPoint) {
        HttpServletResponse response = null;
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
    }

    @Around("addParam()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
       *//* MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method =  signature.getMethod();
        //获取方法参数类型
        Class<?>[] parameterTypes = method.getParameterTypes();*//*
        HttpServletResponse response = null;
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
        return pjp.proceed();
    }*/

    @Pointcut("execution(public * com.htht.controller..*.*(..))")
    public void addParam() {

    }

    @Pointcut("execution(public * com.htht.controller..*.*(..))")
    public void getIp() {

    }

   /* @Before("getIp()")
    public void saveIp(){
        HttpServletRequest request = RequestHolder.getRequest();
        String ip = IpUtil.getIpAddr(request);
        String url = ip_url+"139.198.0.48";
        String ipAddress;
        System.out.println(ip);
        if(!StringUtils.isEmpty(ip)){
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity httpEntity = new HttpEntity(headers);
            try{
                ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
                if (resp.getStatusCode().is2xxSuccessful()) {
                    String body = resp.getBody();
                    JSONObject json = JSONObject.parseObject(body);
                    JSONObject data = json.getJSONObject("data");
                    ipAddress = data.getString("country") + "-" + data.getString("region") + "-" + data.getString("city");
                    System.out.println(ipAddress);
                }
            }catch (Exception e){
                ipAddress = "未知";
            }
        }
    }*/

    @After("addParam()")
    public void afterController(JoinPoint joinPoint) {
        HttpServletResponse response = RequestHolder.getResponse();
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
    }
}
