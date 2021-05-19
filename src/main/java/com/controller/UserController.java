package com.controller;

import com.entity.User;
import com.service.UserService;
import com.uitl.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    public RespBean login(@RequestParam(value = "loginName") String name,
                          @RequestParam(value = "password")String password){
        User user = userService.login(name, password);
        if (user!=null){
            return RespBean.success("登陆成功",user);
        }else{
            return RespBean.error("登陆失败",user);
        }
    }
    @RequestMapping(value = "/register")
    public RespBean register(User user){
        if (userService.register(user)>0){
            return RespBean.success("注册成功");
        }else{
            return RespBean.error("注册失败");
        }
    }
    @RequestMapping(value = "/whoami")
    public RespBean whoami(@RequestParam(value ="loginName" ) String loginName){
        User user = userService.whoami(loginName);
        if (user!=null){
            return RespBean.error("用户名已被注册");
        }else{
            return RespBean.success("用户名可用");
        }
    }

}
