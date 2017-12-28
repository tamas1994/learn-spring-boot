package com.folkcat.learnspringboot;

import com.folkcat.learnspringboot.bean.User;
import com.google.gson.Gson;
import net.spy.memcached.MemcachedClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Tamas on 2017/12/7.
 */
public class MemcachedTest extends BaseTest{


    @Autowired
    MemcachedClient mMemcacheClient;

    @Test
    public void testMemcached(){
        User tamas = new User("Tamas",18);
        User rety = new User("Rety",19);

        mMemcacheClient.add("111",0,tamas);
        mMemcacheClient.add("222",0,rety);

        User tamasFromCache=(User) mMemcacheClient.get("111");
        User retyFromCache=(User) mMemcacheClient.get("222");
        print("从Memcached获取到的Tamas："+new Gson().toJson(tamasFromCache));
        print("从Memcached获取到的Rety："+new Gson().toJson(retyFromCache));


    }


}
