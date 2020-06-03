package com.summer.nacos.consumer.controller;

import com.summer.service.api.service.IProviderApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/17 10:56
 */
@RestController
public class ConsumerController {

    @Autowired
    private IProviderApi providerApi;

    @GetMapping("consumer/test")
    public String consumerTest(){
        return providerApi.nacosTest();
    }

}
