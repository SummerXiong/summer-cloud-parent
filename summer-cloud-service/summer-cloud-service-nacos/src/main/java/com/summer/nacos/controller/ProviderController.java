package com.summer.nacos.controller;

import com.summer.service.api.service.IProviderApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/17 10:51
 */
@RestController
@RefreshScope
public class ProviderController implements IProviderApi {

    @Value("${server.port}")
    private Integer port;

    @Value("${config.info}")
    private String info;

    @Override
    public String nacosTest() {
        return String.valueOf(port);
    }

    @Override
    public String nacosConfig() {
        return info;
    }
}
