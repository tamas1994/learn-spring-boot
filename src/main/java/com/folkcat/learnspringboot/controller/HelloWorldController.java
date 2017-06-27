package com.folkcat.learnspringboot.controller;

import com.folkcat.learnspringboot.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() throws Exception{
        throw new MyException("发生错误222");
    }
}