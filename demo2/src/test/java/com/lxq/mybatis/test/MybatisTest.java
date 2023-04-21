package com.lxq.mybatis.test;

import com.lxq.mybatis.mapper.UserMapper;
import com.lxq.mybatis.pojo.User;
import com.lxq.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 娄须强
 * @CreateTime: 2023-04-20  16:56
 */
public class MybatisTest {
    @Test
    public void testGetByName() throws IOException {
        SqlSession session = SqlSessionUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User tt = mapper.getByName("晴天");
        System.out.println(tt);

    }

    @Test
    public  void testSelect() throws IOException {
        SqlSession session = SqlSessionUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        allUsers.forEach(user -> System.out.println(user));
    }

    @Test
    public  void testDeleteByIds() throws IOException {
        SqlSession session = SqlSessionUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteByIds(new Integer[]{99, 100, 101});
        System.out.println(i);

    }

    @Test
    public  void testGetAll() throws IOException {
        SqlSession session = SqlSessionUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        allUsers.forEach(user -> System.out.println(user));


    }

    @Test
    public  void testInsertList() throws IOException {
        SqlSession session = SqlSessionUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setName("1");
        user.setAge(18);
        user.setPassword("1");
        user.setTel("1");
        User user1 = new User();
        user1.setTel("2");
        user1.setPassword("2");
        user1.setName("2");
        user1.setAge(20);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        int i = mapper.addUserByList(users);
        System.out.println(i);

    }
}
