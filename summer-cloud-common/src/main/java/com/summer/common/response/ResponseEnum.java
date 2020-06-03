package com.summer.common.response;

import lombok.Data;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:23
 */
public enum ResponseEnum {

    OK(200, "操作成功!"),
    FAIL(999, "系统繁忙,请稍后再试!");

    private int code;
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
