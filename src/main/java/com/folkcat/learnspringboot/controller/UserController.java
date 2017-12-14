package com.folkcat.learnspringboot.controller;

import com.folkcat.learnspringboot.bean.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by Tamas on 2017/6/27.
 */
@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    @RequestMapping(value="test", method= RequestMethod.GET)
    public String test(HttpServletRequest request) {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        return "contextPath:"+request.getContextPath();
    }

}