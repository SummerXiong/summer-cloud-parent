package com.summer.payment.service;

import com.summer.payment.repository.entity.Payment;

import java.util.List;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:52
 */
public interface IPaymentService {

    boolean create(Payment payment);

    List<Payment> queryAll();

}
