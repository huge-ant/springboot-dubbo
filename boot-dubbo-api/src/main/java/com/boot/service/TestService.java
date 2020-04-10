package com.boot.service;

import com.boot.domain.User;

/**
 * @Program boot-dubbo
 * @Description 测试service
 * @Author hugeAnt
 * @Date 2020-04-09 16:03
 */

public interface TestService {

    String sayHello(String str);

    User findUser();
}
