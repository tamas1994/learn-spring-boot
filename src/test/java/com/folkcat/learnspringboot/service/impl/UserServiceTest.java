package com.folkcat.learnspringboot.service.impl;


import com.folkcat.learnspringboot.Application;
import com.folkcat.learnspringboot.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Tamas on 2017/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration//由于加了Swagger2，必须加这条注解
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Before
    public void setUp() {
        // 准备，清空user表
        userService.deleteAllUsers();
    }
    @Test
    public void test() throws Exception {
        // 插入5个用户
        userService.create("a", 1);
        userService.create("b", 2);
        userService.create("c", 3);
        userService.create("d", 4);
        userService.create("e", 5);

        // 查数据库，应该有5个用户
        Assert.assertEquals(5, userService.getAllUsers().intValue());
        // 删除两个用户
        userService.deleteByName("a");
        userService.deleteByName("e");
        // 查数据库，应该有5个用户
        Assert.assertEquals(3, userService.getAllUsers().intValue());

    }
}