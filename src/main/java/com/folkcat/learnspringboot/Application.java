package com.folkcat.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * TODO 测试对应功能的时候要把相应开关打开
 */

@SpringBootApplication
//@EnableAsync
@EnableScheduling
//@EnableMemcached
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	@Bean
	public ConnectionFactory memcachedConnection() {
		return new ConnectionFactoryBuilder()
				.setDaemon(true)
				.setFailureMode(FailureMode.Cancel)
				.build();
	}
	*/

}
