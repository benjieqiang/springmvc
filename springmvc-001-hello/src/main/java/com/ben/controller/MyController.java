package com.ben.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-22  17:34
 * @Description: controller：创建处理器对象，对象放在springmvc容器中
 * @Version: 1.0
 */
@Controller
public class MyController {

    /**
     * @param :
     * @return ModelAndView:
     *  * Model：数据，请求处理完成后，要显示给用户的数据
     *  * view：视图，比如jsp等等。
     * @description 处理用户提交的请求，springmvc中是使用方法来处理的。
     * 方法是自定义的，可以有多种返回值，多种参数，方法名称自定义
     *
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
//        mv.setViewName("/show.jsp");
        ///框架会使用视图解析器的前缀 ＋逻辑名称 ＋后缀 组成完成路径，这里就是字符连接操作
        mv.setViewName("show");
        return mv;
    }

}
