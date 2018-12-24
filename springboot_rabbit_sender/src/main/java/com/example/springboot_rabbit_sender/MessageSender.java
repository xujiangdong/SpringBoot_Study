package com.example.springboot_rabbit_sender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author XuJD
 * @create 2018-11-20 16:37
 **/
@Component
public class MessageSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String message){
        this.amqpTemplate.convertAndSend("hello",message);
    }
}
