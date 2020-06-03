package com.summer.nacos.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/19 15:28
 */
@Slf4j
@RestController
public class ProducerController {

    @Value("${server.port}")
    private int port;

    @GetMapping("product/get")
    public String getServcie(){
        String str = "返回服务端口:" + port;
        log.info(str);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str;
    }

}
