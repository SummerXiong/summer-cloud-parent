package com.summer.order.controller;

import com.summer.common.response.Result;
import com.summer.service.api.service.IPaymentApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/4 21:35
 */
@RestController
public class TestController {

    @Autowired
    protected IPaymentApi paymentApi;

    @GetMapping("tttt")
    public Result test(){
        return paymentApi.get();
    }

}
