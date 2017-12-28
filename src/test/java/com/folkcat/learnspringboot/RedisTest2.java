package com.folkcat.learnspringboot;

import com.folkcat.learnspringboot.bean.User;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by Tamas on 2017/6/27.
 */
public class RedisTest2 extends BaseTest {
    @Resource
    RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws Exception {
        // 保存对象
        User user = new User("超人", 20);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new User("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new User("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getName(), user);

        print("缓存超人："+new Gson().toJson(redisTemplate.opsForValue().get("超人")));
        print("缓存蝙蝠侠："+new Gson().toJson(redisTemplate.opsForValue().get("蝙蝠侠")));
        print("缓存蜘蛛侠："+new Gson().toJson(redisTemplate.opsForValue().get("蜘蛛侠")));

    }
}