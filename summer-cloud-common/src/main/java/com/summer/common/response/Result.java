package com.summer.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:21
 */
@Data
@Accessors(chain = true)  // 链式编程写法
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private int code;
    private String message;
    private T data;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

    public Result(ResponseEnum responseEnum, T data) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
        this.data = data;
    }

    public static Result SUCCESS(){
        return new Result(ResponseEnum.OK);
    }

    public static Result FAIL(){
        return new Result(ResponseEnum.FAIL);
    }

    public static Result FAIL(String message){
        return new Result(ResponseEnum.FAIL.getCode(), message);
    }
}
