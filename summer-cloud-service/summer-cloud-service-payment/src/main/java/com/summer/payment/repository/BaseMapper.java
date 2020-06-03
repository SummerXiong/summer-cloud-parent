package com.summer.payment.repository;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 *  让BaseMapper生效，必须加上该注解
 * @date: 2020/3/30 15:42
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>, IdListMapper<T, Long> {
}
