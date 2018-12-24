package com.example.springboot_rabbit_reciver.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XuJD
 * @create 2018-11-20 16:40
 **/
@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
}
