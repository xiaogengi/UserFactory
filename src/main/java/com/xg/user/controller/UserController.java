package com.xg.user.controller;

import com.xg.user.server.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: userpay
 * @author: gzk
 * @create: 2019-10-31 16:41
 **/
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("user")
    public String userType(String type){
        //server 用来处理
        return userService.userType(type);
    }


}
