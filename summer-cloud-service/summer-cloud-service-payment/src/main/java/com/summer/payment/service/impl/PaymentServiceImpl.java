package com.summer.payment.service.impl;

import com.summer.payment.repository.entity.Payment;
import com.summer.payment.repository.mapper.PaymentMapper;
import com.summer.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:53
 */
@Slf4j
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public boolean create(Payment payment) {
        int i = paymentMapper.insert(payment);
        log.debug("插入数据库成功: " + payment.getId());
        return i >= 1 ? true : false;
    }

    @Override
    public List<Payment> queryAll() {
        Example example = new Example(Payment.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("serial", 1);
        return paymentMapper.selectByExample(example);
    }
}
