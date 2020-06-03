package com.summer.service.api.hystrix;

import com.summer.common.response.Result;
import com.summer.service.api.service.IPaymentApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 *
 * 当IPaymentApi中的Feign调用失败或超时时，会调用该实现类的方法
 * 需要注意的是fallback指定的类一定要添加@Component将其加入到Spring容器
 * @date: 2020/4/4 23:56
 */
@Slf4j
@Component
public class IPaymentApiFallback implements IPaymentApi{

    @Override
    public Result create(String serial) {
        log.error("create服务异常，请稍后尝试!");
        return Result.FAIL("超时调用");
    }

    @Override
    public Result get() {
        log.error("get服务异常，请稍后尝试!");
        return Result.FAIL("超时调用");
    }
}
