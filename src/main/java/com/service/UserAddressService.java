package com.service;

import com.entity.UserAddress;

import java.util.List;

public interface UserAddressService {
    List<UserAddress> findId(int id);
}
