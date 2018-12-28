package com.wwb.cfuex.Service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwb.cfuex.Service.TradeService;
import com.wwb.cfux.model.User;
import com.wwb.cfux.service.UserSerivce;
import org.springframework.stereotype.Component;

@Component
public class TradeServiceImpl implements TradeService {
    @Reference
    private UserSerivce userSerivce;

    @Override
    public User getUserByPhone(String phone) {
        return userSerivce.getUserByPhone(phone);
    }
}
