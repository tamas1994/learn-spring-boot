package com.folkcat.learnspringboot;

import org.junit.After;
import org.junit.Before;

/**
 * Created by Tamas on 2017/7/20.
 */
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
