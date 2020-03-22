package com.yc.service.impl;

import com.google.common.collect.Maps;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2020 XXX, Inc. All rights reserved. <p>
 *
 * @author yuche
 * @since 2020/3/22 14:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallBack")
    public String getUser() {
        Map<String, String> map = Maps.newHashMap();
        return (String) restTemplate.getForEntity("http://SERVICE-PROVIDER/getUser", String.class, map).getBody();
    }

    public String fallBack() {
        return "erorr";
    }
}
