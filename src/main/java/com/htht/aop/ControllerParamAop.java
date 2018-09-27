package com.htht.aop;

import com.htht.util.RequestHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 李正元
 * @create 2018-09-09 16:30
 * @desc
 **/
@Component
@Aspect
public class ControllerParamAop {

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

    @After("addParam()")
    public void afterController(JoinPoint joinPoint) {
        HttpServletResponse response = RequestHolder.getResponse();
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
    }
}
