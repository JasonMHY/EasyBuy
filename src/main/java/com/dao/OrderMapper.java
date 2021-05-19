package com.dao;

import com.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.weaver.ast.Or;

import java.util.List;

@Mapper
public interface OrderMapper {
    int addOrder(Order order);
    int findByid(String serialNumber);
}
