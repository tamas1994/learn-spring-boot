package com.folkcat.learnspringboot;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Tamas on 2017/7/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public abstract class BaseTest {
    @Before
    public void beforeUnitTest(){
        System.out.println("=========开始单元测试============");
    }

    @After
    public void afterUnitTest(){
        System.out.println("=========结束单元测试============");
    }

    public void print(String str){
        System.out.println(str);
    }
}
