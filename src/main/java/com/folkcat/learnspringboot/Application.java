package com.folkcat.learnspringboot;

import com.btmatthews.springboot.memcached.EnableMemcached;
import net.spy.memcached.ConnectionFactory;
import net.spy.memcached.ConnectionFactoryBuilder;
import net.spy.memcached.FailureMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@EnableMemcached
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ConnectionFactory memcachedConnection() {
		return new ConnectionFactoryBuilder()
				.setDaemon(true)
				.setFailureMode(FailureMode.Cancel)
				.build();
	}

}
