package com.folkcat.learnspringboot;

import com.folkcat.learnspringboot.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Tamas on 2017/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration//由于加了Swagger2，必须加这条注解
public class RedisTest2 {
    @Autowired
    private RedisTemplate<String, User> redisTemplate;
    @Test
    public void test() throws Exception {
        // 保存对象
        User user = new User("超人", 20);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new User("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new User("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getName(), user);
        Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
        Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());
    }
}