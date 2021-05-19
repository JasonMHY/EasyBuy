package com.controller;

import com.entity.News;
import com.entity.Order;
import com.service.OrderDetailService;
import com.service.OrderService;
import com.uitl.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(value = "/AddOrder")
    @ResponseBody
    public RespBean AddOrder(@RequestBody Map<String, Object> map){
        Order order = new Order();
        List map1= (List) map.get("detail");
        System.out.println(map);
        System.out.println(map1);
        for (int i = 0; i <map1.size() ; i++) {
            System.out.println(map1.get(i));
        }
        if (map!=null){
            return RespBean.success("查询成功",map);
        }else{
            return RespBean.error("查询失败",null);
        }
    }
}
