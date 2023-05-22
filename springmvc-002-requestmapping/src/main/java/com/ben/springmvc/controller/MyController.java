package com.ben.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-22  17:34
 * @Description: controller：创建处理器对象，对象放在springmvc容器中
 * @Version: 1.0
 */
@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome() {
        //处理some.do请求了。 相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域。
        mv.addObject("msg", "欢迎使用springmvc做web开发");
        mv.addObject("fun", "执行的doSome方法");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("/other.do")
    public ModelAndView doOther() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "张三");
        modelAndView.addObject("age", 30);
        modelAndView.setViewName("other");
        return modelAndView;
    }

}
