package com.summer.service.api.service;

import org.springframework.stereotype.Component;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/20 16:24
 */
@Component
public class ProviderApiFallback implements IProviderApi {

    @Override
    public String nacosTest() {
        return null;
    }

    @Override
    public String nacosConfig() {
        return null;
    }
}
