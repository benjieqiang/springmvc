package com.ben.springmvc.service.impl;

import com.ben.springmvc.dao.UserDao;
import com.ben.springmvc.pojo.User;
import com.ben.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-12-11  12:24
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findUserList() {
        return userDao.findUserList();
    }
}
