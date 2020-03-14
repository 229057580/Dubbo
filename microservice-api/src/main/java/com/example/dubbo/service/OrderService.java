package com.example.dubbo.service;

import com.example.dubbo.bean.UserAddress;

import java.util.List;

public interface OrderService {

    public List<UserAddress> initOrder(String userId);

}