package com.summer.nacos.producer;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/20 10:36
 */
@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping("sentinel/test1")
    public String test1(){
        return "sentinel/test1";
    }

    @GetMapping("sentinel/test2/{id}")
    /*@SentinelResource(value = "sentinel/test2",
            blockHandlerClass = GlobalBlcokHandler.class,
            blockHandler = "handlerException",
            fallback = "systemErrorFallback")*/
    public String test2(@PathVariable("id") Long id){
        return "sentinel/test2";
    }

    public String systemErrorFallback(@PathVariable("id") Long id, Throwable e){
        return "错误异常: " + e.getMessage();
    }
}
