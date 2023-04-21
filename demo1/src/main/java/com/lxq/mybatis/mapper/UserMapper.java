package com.lxq.mybatis.mapper;

import com.lxq.mybatis.pojo.User;

import java.util.List;

/**
 * @Author: 娄须强
 * @CreateTime: 2023-04-20  16:37
 */
public interface UserMapper {
    List<User> getAllUsers();

    User getUser();

    int deleteById();

    int updateById();
}
