package com.controller;

import com.entity.News;
import com.entity.Order;
import com.entity.OrderDetail;
import com.entity.UserAddress;
import com.service.OrderDetailService;
import com.service.OrderService;
import com.service.ProductService;
import com.service.UserAddressService;
import com.uitl.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @Autowired
    private UserAddressService userAddressService;
    @Autowired
    private ProductService productService;
    //提交购买信息  插入购买数据和订单信息
    @RequestMapping(value = "/AddOrder")
    @ResponseBody
    public RespBean AddOrder(@RequestBody Map<String, Object> map){
        Order order = new Order();
        List detail= (List) map.get("detail");
        Map orderList= (Map) map.get("order");
        String serialNumber = null;
        System.out.println(detail);
        System.out.println(orderList);
        order.setUserId((int) orderList.get("userId"));
        order.setLoginName((String) orderList.get("loginName"));
        //前端传的地址id  查询地址
        order.setUserAddress(userAddressService.findAddress(Integer.parseInt((String) orderList.get("userAddress"))));
        order.setCost(Float.parseFloat(String.valueOf(orderList.get("cost"))));
        serialNumber = (String) orderList.get("serialNumber");
        order.setSerialNumber(serialNumber);

        orderService.addOrder(order);
        int orderId=0;
        if (serialNumber!=null){
            orderId = orderService.findByid(serialNumber);//订单号反查orderId
        }
        for (int i = 0; i <detail.size() ; i++) {
            Map list1 = (Map) detail.get(i);
            int quantity= Integer.parseInt( String.valueOf(list1.get("quantity")));
            int productId=Integer.parseInt(String.valueOf( list1.get("productId")));
            OrderDetail orderDetail=new OrderDetail();
            orderDetail.setProductId(productId);
            orderDetail.setQuantity(quantity);
            orderDetail.setCost(Float.parseFloat(String.valueOf(list1.get("cost"))));
            orderDetail.setOrderId(orderId);
            orderDetailService.addOrderDetail(orderDetail);
            productService.alterRepertoryById(quantity,productId);
        }
        if (order!=null){//购买根据支付回调，就算不生成订单也不会回滚事务
            return RespBean.success("购买成功",order);
        }else{
            return RespBean.error("购买失败",null);
        }
    }
}
