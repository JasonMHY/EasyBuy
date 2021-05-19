package com.controller;

import com.entity.User;
import com.entity.UserAddress;
import com.service.UserAddressService;
import com.service.impl.UserAddressServiceImpl;
import com.uitl.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;

    @RequestMapping(value = "findId")
    public RespBean findId(@RequestParam(value ="id" ) int id){
        List<UserAddress> list = userAddressService.findId(id);
        if (list!=null){
            return RespBean.success("查询成功",list);
        }else{
            return RespBean.error("查询失败，未查询到地址");
        }
    }

}
