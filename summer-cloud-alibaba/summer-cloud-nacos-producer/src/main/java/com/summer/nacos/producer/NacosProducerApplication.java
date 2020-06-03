package com.summer.nacos.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/19 11:00
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProducerApplication.class, args);
    }
}
