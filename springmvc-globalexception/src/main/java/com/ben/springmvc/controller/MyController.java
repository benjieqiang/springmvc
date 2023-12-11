package com.ben.springmvc.controller;

import com.ben.springmvc.pojo.User;
import com.ben.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-12-11  12:19
 * @Description: C: Controller
 * @Version: 1.0
 */

@Controller
public class MyController {
    @Autowired
    UserService userService;

    MyController() {
        System.out.println("ben mycontroller");
    }

    @RequestMapping("/user")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userService.findUserList();
        System.out.println("userList" + userList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dateTime", new Date());
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("show"); // show.jsp
        return modelAndView;
    }

    //单个controller进行异常处理
    @RequestMapping("/hello")
    public String testError() {
        int a = 10 / 0;
        return "this is testError" + a;
    }

//    /**
//     * 处理其他异常
//     */
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public String exceptionHandler(Exception e) {
//        System.out.println(e);
//        return "this is a controller exception method!";
//    }
//
//    /**
//     * 处理ArithmeticException异常
//     */
//    @ExceptionHandler(value = ArithmeticException.class)
//    @ResponseBody
//    public String exceptionHandler(ArithmeticException e) {
//        System.out.println("发生ArithmeticException异常！原因是:" + e);
//        return "发生ArithmeticException异常";
//    }

}
