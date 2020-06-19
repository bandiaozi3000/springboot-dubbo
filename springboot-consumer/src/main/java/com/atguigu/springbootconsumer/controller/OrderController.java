package com.atguigu.springbootconsumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/dubbo")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/service/{id}")
    public void dubboService(@PathVariable("id")String id){
        orderService.initOrder(id) ;
    }
}
