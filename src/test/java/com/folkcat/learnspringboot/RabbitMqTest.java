package com.folkcat.learnspringboot;

import com.folkcat.learnspringboot.rabbit.QueueSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Tamas on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class RabbitMqTest {
    @Autowired
    private QueueSender queueSender;
    @Test
    public void hello() throws Exception {
        queueSender.send("第8条了哦");
    }
}