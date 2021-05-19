package com.service;

import com.entity.User;

public interface UserService {
    User login(String name,String password);
    int register(User user);
    User whoami(String loginName);
}
