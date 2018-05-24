package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lixingyuan on 2018/5/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/add")
    public String addUser(){
        User user = new User();
        user.setUsername("heart333");
        user.setPassword("123456");
        userService.addUser(user);
        return  "index";
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        PageInfo<User> list = userService.findAllUser(pageNum,pageSize);
        List<User> userList =  list.getList();
        LOGGER.debug("分页  --- ",pageNum,pageSize);
        return userList;

    }
}
