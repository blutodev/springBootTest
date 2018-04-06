package com.xuew.springboot.ch7_2.config;

import org.springframework.stereotype.Component;

@Component
public class ContionalOnTestBean {

	public ContionalOnTestBean() {
		System.out.println("------ContionalOnTestBean constructed function!");
	}

}
