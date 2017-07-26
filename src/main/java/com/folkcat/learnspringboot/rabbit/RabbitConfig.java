package com.folkcat.learnspringboot.rabbit;

import org.springframework.amqp.core.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tamas on 2017/6/28.
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue() {
        return new Queue("tamas-queue");
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("tamas-exchange");
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with("routing-key");
    }

}