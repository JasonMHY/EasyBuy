package com.dao;

import com.entity.User;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
    User login(String name,String password);//登陆
    int register(User user);//注册
    User whoami(String loginName);//判断用户名
}
