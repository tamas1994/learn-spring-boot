package com.folkcat.learnspringboot.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Tamas on 2017/7/31.
 */
public interface  DemoInfoRepository  extends MongoRepository<DemoInfo, String> {
    DemoInfo findByName(String name);
}