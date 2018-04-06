package com.xuew.springboot.ch7_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xuew.springboot.ch7_2.config.ConfigTest1Bean;
import com.xuew.springboot.ch7_2.dao.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRespositoryUnitTest {
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private ConfigTest1Bean mybean;
	
	@Test
	public void testGetById(){
//		Long id = 1l;
//		Person person = personRepository.getById(id);
//		System.out.println(person.toString());
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
//		ConfigTest1Bean mybean = context.getBean(ConfigTest1Bean.class);
		mybean.testMothod1();
	}
}
