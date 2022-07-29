package com.yz.Mybatis_demo1.mapper;

import com.yz.Mybatis_demo1.entity.User;

import java.util.List;

/**
 * 用户映射器
 *
 * @Author 杨洲
 * @Date 2022/7/27 18:09
 */
public interface UserMapper {

    /**
     * MyBatis面向接口编程的两个一致：
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中SQL语句的id要和mapper接口中的方法名一致
     *
     * 表--实体类--mapper接口--映射文件
     */

    /**
     * 插入用户
     */
    int insertUser();

    /**
     * 更新用户
     *
     */
    int updateUser();

    /**
     * 删除用户
     *
     * @return int
     */
    int deleteUser();

    User getUserById();

    /**
     * 获取所有用户
     *
     */
    List<User> getAllUser();
}
