package com.is.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//springMVC的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception ex) {
        //纪录日志
        //通知运维
        //通知开发
        ex.printStackTrace();
        return new R("服务器故障！");

    }
}
