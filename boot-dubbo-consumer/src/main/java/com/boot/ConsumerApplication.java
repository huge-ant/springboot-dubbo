package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Program boot-dubbo
 * @Description
 * @Author hugeAnt
 * @Date 2020-04-09 17:02
 */

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
