package com.folkcat.learnspringboot;

import com.folkcat.learnspringboot.mongo.DemoInfo;
import com.folkcat.learnspringboot.mongo.DemoInfoRepository;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by Tamas on 2017/7/31.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class MongoTest extends BaseTest {

    @Autowired
    private DemoInfoRepository demoInfoRepository;


    @Test
    public void save(){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("张三");
        demoInfo.setAge(20);
        demoInfoRepository.save(demoInfo);

        demoInfo = new DemoInfo();
        demoInfo.setName("李四");
        demoInfo.setAge(30);
        demoInfoRepository.save(demoInfo);

        print("ok");
    }

    @Test
    public void find(){
        List<DemoInfo> demoInfoList=demoInfoRepository.findAll();
        print("find result:"+new Gson().toJson(demoInfoList));
    }

    @Test
    public void findByName(){
        DemoInfo demoInfo=demoInfoRepository.findByName("张三");
        print(new Gson().toJson(demoInfo));

    }

}
