package com.htht.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 李正元
 * @create 2018-05-28 15:05
 * @desc
 **/
@Component
public class ViewConfig{

    public static final String DEFAULT_ERROR_VIEW = "forward:main/netFound";

    @ExceptionHandler(value = NoHandlerFoundException.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }



}
