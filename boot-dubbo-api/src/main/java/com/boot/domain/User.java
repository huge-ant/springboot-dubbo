package com.boot.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program boot-dubbo
 * @Description 用户
 * @Author hugeAnt
 * @Date 2020-04-09 16:01
 */

@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
