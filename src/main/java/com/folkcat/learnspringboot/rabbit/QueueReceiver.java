package com.folkcat.learnspringboot.rabbit;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Tamas on 2017/6/28.
 */
@Component

public class QueueReceiver {
    @RabbitHandler
    //此注解只能修饰方法域！
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "tamas-queue", durable = "true"),
            exchange = @Exchange(value = "tamas-exchange", type = ExchangeTypes.TOPIC),
            key = "routing-key"))
    public void process(byte[] hello) {
        System.out.println("Receiver : " + new String(hello));
    }
}