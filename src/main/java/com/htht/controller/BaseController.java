package com.htht.controller;

import com.htht.constant.ResultConstant;
import com.htht.util.CommonUtil;
import com.htht.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {
    protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

    public Object buildSuccJson() {
        return buildJson(ResultConstant.SUCCESS, "success");
    }

    public Object buildSuccJson(Object data) {
        return buildJson(ResultConstant.SUCCESS, "success", data);
    }

    public Object buildJson(int code, String msg) {
        return buildJson(code, msg, null);
    }

    public Object buildJson(String code, String msg) {
        return buildJson(code, msg, null);
    }

    public Object buildErrJson(String msg) {
        return buildJson(ResultConstant.ERROR, msg, null);
    }

    public Object buildSysErrJson() {
        return buildErrJson("system error");
    }

    public Object buildJson(int code, String msg, Object data) {
        String time = DateUtil.getCurrentDate();
        if (data == null) {
            return CommonUtil.asMap("code", code, "msg", msg, "serverTime", time, "resp", "");
        } else {
            return CommonUtil.asMap("code", code, "msg", msg, "serverTime", time, "resp", data);
        }
    }

    public Object buildJson(String code, String msg, Object data) {
        String time = DateUtil.getCurrentDate();
        return CommonUtil.asMap("code", code, "msg", msg, "serverTime", time, "resp", data);
    }

}
