package com.xuew.springboot.ch7_2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xuew.springboot.ch7_2.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person>{

	@Query("select p from Person p where p.age=?1")
	public List<Person> withQueryFindByAge(Integer age);
}
