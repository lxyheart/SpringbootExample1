package com.example.service;

import com.example.model.User;
import com.github.pagehelper.PageInfo;

/**
 * Created by lixingyuan on 2018/5/7.
 */
public interface UserService {
    int addUser(User user);

   PageInfo<User> findAllUser(int pageNum, int pageSize);
}
