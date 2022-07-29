package com.yz.mybatis.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Author 杨洲
 * @Date 2022/7/28 15:07
 */
@Data
@ToString
public class User {

    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电子邮件
     */
    private String email;
}
