package com.summer.payment.restful.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.summer.common.response.Result;
import com.summer.payment.repository.entity.Payment;
import com.summer.payment.restful.AbstractBaseController;
import com.summer.payment.service.IPaymentService;
import com.summer.service.api.service.IPaymentApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:57
 */
@Api(tags = "支付测试类", value = "支付测试Rest")
@RestController
public class PaymentController extends AbstractBaseController implements IPaymentApi {

    @Autowired
    private IPaymentService paymentService;
    @Autowired
    Environment environment;

    @Override
    @ApiOperation(tags = "支付测试类", value = "保存支付信息")
    public Result create(@ApiParam(value = "支付流水", name = "serial") @RequestParam(name = "serial") String serial){
        Payment payment = new Payment();
        payment.setSerial(serial);
        paymentService.create(payment);
        return Result.SUCCESS().setData(1);
    }

    @Override
    @ApiOperation(tags = "支付测试类", value = "获取")
    public Result get(){
        /*try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return Result.SUCCESS().setData(environment.getProperty("local.server.port"));
    }
}
