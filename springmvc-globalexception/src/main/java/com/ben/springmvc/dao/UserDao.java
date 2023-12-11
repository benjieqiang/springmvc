package com.ben.springmvc.dao;

import com.ben.springmvc.pojo.User;

import java.util.List;

/**
 * @InterfaceName: UserDao
 * @Description: 添加描述
 * @Author: benjieqiang
 * @LastChangeDate: 2023/12/11 12:23 PM
 * @Version: v1.0
 */

public interface UserDao {

    List<User> findUserList();
}

