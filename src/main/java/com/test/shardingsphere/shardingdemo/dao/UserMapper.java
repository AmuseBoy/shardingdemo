package com.test.shardingsphere.shardingdemo.dao;

import com.test.shardingsphere.shardingdemo.model.User;

import java.util.List;

public interface UserMapper {

    User getUser(Integer id);

    User getUserByName(String name);

    List<User> getUserList();

    int addUser(User user);

    int saveAndUpdate(User user);
}
