package com.dao;

import com.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper {
    int addOrderDetail(OrderDetail orderDetail);
}
