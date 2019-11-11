package com.health.resolver;

import com.health.exception.CustomException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义异常处理器
 */
@ControllerAdvice
public class CustomExceptionHandler {


    @ExceptionHandler(value = CustomException.class)
    public ModelAndView handleException(CustomException ex) {
        //实例化模型视图对象
        ModelAndView modelAndView = new ModelAndView();
        //添加属性
        modelAndView.addObject("message", ex.getMessage());
        //设置视图名称
        modelAndView.setViewName("error/error");

        return modelAndView;
    }


}
