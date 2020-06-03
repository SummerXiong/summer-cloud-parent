package com.summer.nacos.consumer.controller;

import com.summer.nacos.consumer.feign.ProducerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/19 15:31
 */
@RestController
@RequiredArgsConstructor
public class TestController {

    private final ProducerFeignClient producerFeignClient;

    @GetMapping("test")
    public String test(){
        return producerFeignClient.getServcie();
    }
}
