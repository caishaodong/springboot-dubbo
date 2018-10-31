package com.dong.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dong.dubbo.api.IUserService;

/**
 * @Description:
 * @Author: caishaodong
 * @Create: 2018-10-31 18:44:45
 **/
@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public String getUser() {
        return "secondUser";
    }
}