package com.wwb.cfux.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwb.cfux.model.User;
import com.wwb.cfux.service.UserSerivce;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserSerivce.class)
@Component
public class UserServiceImpl implements UserSerivce {
    @Override
    public User getUserByPhone(String phone) {
        User user = new User();
        user.setId(1l);
        user.setPhone("18186130905");
        user.setAge(10);
        user.setUserName("Mr Wang");
        return user;
    }
}
