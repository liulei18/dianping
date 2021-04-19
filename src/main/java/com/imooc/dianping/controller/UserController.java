package com.imooc.dianping.controller;

import com.imooc.dianping.model.UserModel;
import com.imooc.dianping.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: liulei18
 * @date: 2021/3/18 12:06 AM
 * @description:
 */
@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @RequestMapping("/get")
    @ResponseBody
    public UserModel getUser(@RequestParam(name="id") Long id){
        return userService.getUser(id);
    }
}
