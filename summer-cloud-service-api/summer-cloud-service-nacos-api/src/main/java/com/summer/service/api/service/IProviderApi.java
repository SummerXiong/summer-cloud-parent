package com.summer.service.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/17 10:49
 */
@FeignClient(name = "summer-cloud-service-nacos", fallback = ProviderApiFallback.class)
public interface IProviderApi {

    @GetMapping("nacos/test")
    String nacosTest();

    @GetMapping("nacos/config")
    String nacosConfig();
}
