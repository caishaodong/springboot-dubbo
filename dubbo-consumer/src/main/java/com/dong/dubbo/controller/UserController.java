package com.dong.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dong.dubbo.api.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: caishaodong
 * @Create: 2018-10-31 18:45:13
 **/
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @GetMapping("/getUser")
    public String getUser() {
        String user = userService.getUser();
        return user;
    }

}