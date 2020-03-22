package com.yc.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2020 XXX, Inc. All rights reserved. <p>
 *
 * @author yuche
 * @since 2020/3/22 11:19
 */
@Builder
@Data
public class User {
    private String name;
    private int age;
    private String mobileNo;
    private String serverPort;
    private int sleepTime;
}
