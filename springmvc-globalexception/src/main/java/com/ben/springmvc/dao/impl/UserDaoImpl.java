package com.ben.springmvc.dao.impl;

import com.ben.springmvc.dao.UserDao;
import com.ben.springmvc.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-12-11  12:20
 * @Description: UserDaoImpl
 * @Version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> findUserList() {
        System.out.println("userDaoImpl#findUserList exec... ");
        List<User> userList = Collections.singletonList(new User("ben", 23));
        return userList;
    }
}
