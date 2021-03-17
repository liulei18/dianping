package com.imooc.dianping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liulei18
 * @date: 2021/3/18 12:06 AM
 * @description:
 */
@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
