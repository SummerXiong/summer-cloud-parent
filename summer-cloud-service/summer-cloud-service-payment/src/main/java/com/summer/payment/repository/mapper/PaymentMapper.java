package com.summer.payment.repository.mapper;

import com.summer.payment.repository.BaseMapper;
import com.summer.payment.repository.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:37
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
