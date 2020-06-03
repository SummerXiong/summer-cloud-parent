package stream.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/4/15 17:08
 */
@Slf4j
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageController {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        log.info("【消费者接收消息】: {}", message.getPayload());
    }
}
