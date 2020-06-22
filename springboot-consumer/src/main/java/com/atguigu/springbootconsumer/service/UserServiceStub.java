package com.atguigu.springbootconsumer.service;


import bean.UserAddress;
import com.alibaba.dubbo.common.utils.StringUtils;
import service.UserService;

import java.util.List;


public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 有参构造 dubbo会自动将远程Userservice注入进来
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }


    /**
     * 在远程调用前可以进行判断
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 如果userId不为空则进行远程调用 否则不调
        System.out.println("执行本地存根");
        if(!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
