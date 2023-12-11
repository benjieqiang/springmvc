package com.ben.springmvc.exception;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.DateFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-12-11  17:35
 * @Description: 全局异常处理
 * @Version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
//    @Order(2000)
//    @ResponseBody // 如果使用了@RestControllerAdvice，这里就不需要@ResponseBody了
//    public Map handler(Exception ex) {
//        System.out.println("统一异常处理" + ex);
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", 400);
//        //判断异常的类型,返回不一样的返回值
//        if (ex instanceof MissingServletRequestParameterException) {
//            map.put("msg", "方法缺少必需参数：" + ((MissingServletRequestParameterException) ex).getParameterName());
//        } else if (ex instanceof BussinessException) {
//            map.put("msg", "抛出自定义异常。。。error。。");
//        } else {
//            map.put("msg", "这个异常打出来了");
//        }
//        return map;
//    }

    /**
     * 如果不需要返回json数据，而要渲染某个页面模板返回给浏览器，那么可以这么实现：
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView myErrorHandler(Exception ex) {
        System.out.println("捕获到了页面处理。。。");
        if (ex instanceof BussinessException) {
            System.out.println("BusinessExption exec");
        } else if (ex instanceof ArithmeticException) {
            System.out.println("ArithmeticException");
        }
        ModelAndView modelAndView = new ModelAndView();
        //指定错误页面的模板页
        modelAndView.setViewName("error");
        modelAndView.addObject("msg",  ex.getMessage());
        return modelAndView;
    }
}
