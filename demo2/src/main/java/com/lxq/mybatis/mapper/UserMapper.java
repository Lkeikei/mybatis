package com.lxq.mybatis.mapper;

import com.lxq.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 娄须强
 * @CreateTime: 2023-04-20  16:45
 */
public interface UserMapper {
    User getByName(@Param("aa") String name);

    User getAll();

    List<User> getAllUsers();

    int deleteByIds(@Param("ids") Integer [] ids);

     int addUserByList(@Param("users") List<User> users);
}
