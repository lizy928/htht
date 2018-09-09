package com.htht.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

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
}
