package com.summer.stream.controller;

import com.summer.stream.message.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/15 15:35
 */
@RestController
public class MessageController {

    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("test")
    public void test(){
        messageProvider.send();
    }

}
