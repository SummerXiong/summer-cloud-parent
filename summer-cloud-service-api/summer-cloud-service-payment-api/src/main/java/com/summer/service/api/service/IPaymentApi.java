package com.summer.service.api.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.summer.common.response.Result;
import com.summer.service.api.hystrix.IPaymentApiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/4 23:46
 */
@FeignClient(name = "summer-cloud-payment", fallback = IPaymentApiFallback.class)
public interface IPaymentApi {

    /*@HystrixCommand( fallbackMethod = "create", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//开启熔断器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),//失败率达到多少后熔断
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "300")
    })*/
    @GetMapping("payment/test")
    Result create(@RequestParam(name = "serial") String serial);

    @GetMapping("payment/get")
    Result get();

}
