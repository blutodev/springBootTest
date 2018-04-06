package com.xuew.springboot.ch7_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig2 {

	@Bean
	public ConfigTest2Bean configTest2Bean(){
		System.out.println("=========TestConfig ConfigTest2Bean() method invoke!");
		return new ConfigTest2Bean();
	}
}
