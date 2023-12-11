package com.ben.springmvc.service;

import com.ben.springmvc.pojo.User;

import java.util.List;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-12-11  12:20
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserService {

    List<User> findUserList();
}
