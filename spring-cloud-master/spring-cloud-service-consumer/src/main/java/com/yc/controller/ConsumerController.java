package com.yc.controller;

import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2020 XXX, Inc. All rights reserved. <p>
 *
 * @author yuche
 * @since 2020/3/22 11:25
 */
@RestController
public class ConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser() {
        Map<String, String> map = new HashMap<>();
        return userService.getUser();
    }
}
