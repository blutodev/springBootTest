package com.xuew.springboot.ch7_2.service;

import java.util.List;

import com.xuew.springboot.ch7_2.domain.Person;

public interface PersonService {
	public List<Person> getPersonList();
	public void save(Person p);
	public void modify(Person p);
	public void delete(Long id);
	public Person getPersonById(Long id);
	
	public List<Person> queryAllByCondition(Person p);
	
	public List<Person> withQueryFindByAge(Integer age);
}
