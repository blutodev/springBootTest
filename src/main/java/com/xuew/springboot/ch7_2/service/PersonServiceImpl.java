package com.xuew.springboot.ch7_2.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xuew.springboot.ch7_2.dao.PersonRepository;
import com.xuew.springboot.ch7_2.domain.Person;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getPersonList() {
		return personRepository.findAll();
	}

	@Override
	public void save(Person p) {
		personRepository.save(p);
		
	}

	@Override
	public void modify(Person p) {
		personRepository.save(p);		
	}

	@Override
	public void delete(Long id) {
		personRepository.delete(id);		
	}

	@Override
	public Person getPersonById(Long id) {
		Person person = personRepository.findOne(id);
		return person;
	}

	@Override
	public List<Person> queryAllByCondition(final Person p) {
		return personRepository.findAll(new Specification<Person>() {
			
			@Override
			public Predicate toPredicate(Root<Person> root,
					CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> conditions = new ArrayList<Predicate>();
				if(null!=p && !StringUtils.isEmpty(p.getName())){
					Predicate p1 = builder.like(root.<String>get("name"), "%" + p.getName() + "%");
					conditions.add(p1);
				}
				
				if(null!=p && !StringUtils.isEmpty(p.getAge())){
					Predicate p2 = builder.equal(root.<String>get("age"), p.getAge());
					conditions.add(p2);
				}
				
				if(conditions.size()>0){
					query.where(conditions.toArray(new Predicate[conditions.size()]));
				}
				return null;
			}
		});
	}

	@Override
	public List<Person> withQueryFindByAge(Integer age) {
		return personRepository.withQueryFindByAge(age);
	}
	
	
}
