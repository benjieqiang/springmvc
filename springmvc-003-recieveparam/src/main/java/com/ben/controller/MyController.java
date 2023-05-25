package com.ben.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-25  11:48
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class MyController {

    /**
     * @param :
     * @return ModelAndView:
     *  * Model：数据，请求处理完成后，要显示给用户的数据
     *  * view：视图，比如jsp等等。
     * @description 处理用户提交的请求，springmvc中是使用方法来处理的。方法是自定义的，可以有多种返回值，多种参数，方法名称自定义
     * 准备使用dosome 方法处理some.do请求。@RequestMapping:请求映射，作用是把一个请求地址和一个方法绑定在一起
     * 一个请求指定一个方法处理。value 是一个string，表示请求的uri地址的。value的值必须是唯一的，不能重复。
     * @author benjieqiang
     * @date 2023/5/22 5:36 PM
     */
    @RequestMapping("/some.do")
    public ModelAndView doSome() {
        //处理some.do请求了。 相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域。
        mv.addObject("msg", "欢迎使用springmvc做web开发");
        mv.addObject("fun", "执行的doSome方法");
        //指定视图，指定视图的完整路径
        mv.setViewName("/show.jsp");
        return mv;
    }

    // 逐个接收
    /**
     * @param name:
     * @param age:
     * @return ModelAndView
     * @description 要求：处理器（控制器）方法的形参名和请求中参数必须一致。同名的请求参数赋值给同名的形参
     * @author benjieqiang
     * @date 2023/5/25 12:14 PM
     */

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public ModelAndView doRegister(String name, Integer age) {
        System.out.println("doRegister方法：" + name + age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);

        mv.setViewName("/show.jsp");
        return mv;
    }
}
