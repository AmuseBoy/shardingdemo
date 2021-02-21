package com.test.shardingsphere.shardingdemo.service.impl;

import com.test.shardingsphere.shardingdemo.dao.UserMapper;
import com.test.shardingsphere.shardingdemo.model.User;
import com.test.shardingsphere.shardingdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int addUser(User user){
        return userMapper.addUser(user);
    }

    @Override
    public int saveAndUpdate(User user){
        return userMapper.saveAndUpdate(user);
    }
}
