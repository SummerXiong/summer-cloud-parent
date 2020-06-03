package com.summer.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 *  设置Feign的日志级别
 * @date: 2020/4/7 23:41
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
