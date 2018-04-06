package com.xuew.springboot.ch7_2.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xuew.springboot.ch7_2.domain.Person;
import com.xuew.springboot.ch7_2.service.PersonService;

@Controller
@RequestMapping(value = "/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/list")
	public String list(Model model){
		List<Person> peoples = personService.getPersonList();
		model.addAttribute("peoples", peoples);
		return "person/list";
	}
	
	@RequestMapping(value="/toAdd")
	public String toAdd(){
		return "person/add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(Person person){
		personService.save(person);
		return "redirect:/person/list";
	}
	
	@RequestMapping(value="/toEdit")
	public String toEdit(Model model, Long id){
		Person person = personService.getPersonById(id);
		model.addAttribute("person", person);
		return "person/edit";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(Person person){
		personService.modify(person);
		return "redirect:/person/list";
	}
	
	@RequestMapping(value="/delete")
	public String delete(Long id){
		personService.delete(id);
		return "redirect:/person/list";
	}
	
	@RequestMapping(value="/search")
	public String search(Model model, Person person){
		//List<Person> peoples = personService.queryAllByCondition(person);
		Integer age = person.getAge();
		List<Person> peoples = personService.withQueryFindByAge(age);
		model.addAttribute("peoples", peoples);
		return "person/list";
	}
}
