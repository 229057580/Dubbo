package com.example.dubbo.service;

import com.example.dubbo.bean.UserAddress;

import java.util.List;

public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);
}
