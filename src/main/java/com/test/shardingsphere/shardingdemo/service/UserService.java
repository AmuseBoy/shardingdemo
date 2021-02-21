package com.test.shardingsphere.shardingdemo.service;

import com.test.shardingsphere.shardingdemo.model.User;

import java.util.List;

public interface UserService {

    User getUser(Integer id);

    List<User> getUserList();

    int addUser(User user);

    int saveAndUpdate(User user);
}
