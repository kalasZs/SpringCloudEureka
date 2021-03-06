package com.zs.controller;

import com.zs.inter.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @Autowired
    private ServiceProvider serviceProvider;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return serviceProvider.add(10, 20);
    }
}
