package com.service.impl;

import com.dao.UserAddressMapper;
import com.entity.UserAddress;
import com.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserAddress> findId(int id) {
        return userAddressMapper.findId(id);
    }

    @Override
    public String findAddress(int id) {
        return userAddressMapper.findAddress(id);
    }
}
