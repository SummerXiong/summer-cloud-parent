package com.summer.nacos.producer;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/5/20 15:23
 */
public class GlobalBlcokHandler {

    public static String handlerException(BlockException exception){
        return "自定义错误1";
    }

    public static String handlerException2(BlockException exception){
        return "自定义错误2";
    }
}
