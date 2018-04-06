package com.xuew.springboot.ch7_2.config;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(ConfigTest2Bean.class)
@ConditionalOnBean(ContionalOnTestBean.class)
@AutoConfigureBefore(TestConfig2.class)
public class TestConfig {

	@Bean
	public ConfigTest1Bean configTest1Bean(){
		System.out.println("=========TestConfig ConfigTest1Bean() method invoke!");
		return new ConfigTest1Bean();
	}
}
