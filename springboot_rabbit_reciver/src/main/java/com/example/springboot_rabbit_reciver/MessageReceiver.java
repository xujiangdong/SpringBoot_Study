package com.example.springboot_rabbit_reciver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author XuJD
 * @create 2018-11-20 16:42
 **/
@Component
public class MessageReceiver {

    @RabbitListener(queues = "hello")
    public void reciver0(String message){
        System.out.println("reciver0已收到消息："+message);
    }

    @RabbitListener(queues = "hello")
    public void reciver1(String message){
        System.out.println("reciver1已收到消息："+message);
    }
}
