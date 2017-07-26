package com.folkcat.learnspringboot.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Tamas on 2017/6/28.
 */
@Component
public class QueueSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(String message) {
        this.rabbitTemplate.convertAndSend("tamas-exchange","routing-key", message);
    }
}