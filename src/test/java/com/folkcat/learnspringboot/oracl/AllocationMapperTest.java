package com.folkcat.learnspringboot.oracl;

import com.folkcat.learnspringboot.Application;
import com.folkcat.learnspringboot.BaseTest;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Tamas on 2017/10/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration//由于加了Swagger2，必须加这条注解
public class AllocationMapperTest extends BaseTest{

    @Autowired AllocationMapper mAllocationMapper;

    @Test
    public void getAllocationList() throws Exception {
        List<Allocation> allocationList=mAllocationMapper.getAllocationList("12345");
        print(new Gson().toJson(allocationList));
    }

}