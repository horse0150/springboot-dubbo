package com.wwb.cfuex.controller;

import com.wwb.cfuex.Service.TradeService;
import com.wwb.cfux.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @GetMapping("/getUserByPhone/{phone}")
    public User getUserByPhone(@PathVariable("phone") String phone){
        return tradeService.getUserByPhone(phone);
    }
}
