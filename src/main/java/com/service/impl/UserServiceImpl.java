package com.service.impl;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        return userMapper.login(name,password);
    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public User whoami(String loginName) {
        return userMapper.whoami(loginName);
    }
}
