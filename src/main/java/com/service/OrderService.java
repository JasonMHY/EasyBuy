package com.service;

import com.entity.Order;

public interface OrderService {
    int addOrder(Order order);
    int findByid(String serialNumber);
}
