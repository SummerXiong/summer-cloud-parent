package com.summer.nacos.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/19 15:30
 */
@FeignClient(name = "summer-cloud-nacos-producer")
public interface ProducerFeignClient {

    @GetMapping("product/get")
    String getServcie();

}
