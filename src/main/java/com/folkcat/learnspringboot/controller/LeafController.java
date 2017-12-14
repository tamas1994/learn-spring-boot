package com.folkcat.learnspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Tamas on 2017/11/7.
 */
@Controller
@RequestMapping(value="/leaf")
public class LeafController {
    @RequestMapping("index")
    public String indexHtml(Map<String, Object> map){
        map.put("hello", "this is a thymeleaf test");
        return "/first                                             leaf";
    }
}
