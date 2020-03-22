package com.yc.service.impl;

import com.yc.entity.User;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2020 XXX, Inc. All rights reserved. <p>
 *
 * @author yuche
 * @since 2020/3/22 11:21
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private Environment environment;

    @Override
    public User findUser() {
        int sleepTime = new Random().nextInt(3000);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return User.builder().name("yuche001").age(27).mobileNo("1234567").
                serverPort(environment.getProperty("server.port")).sleepTime(sleepTime).build();
    }
}
