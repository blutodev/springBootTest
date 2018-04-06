package com.xuew.springboot.ch7_2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController返回json，是@ResponseBody和@Controller的组合注解
//@Controller返回模板页面
@Controller
public class Ch72Controller {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index(Model model){
		return "redirect:/person/list";
	}
	
}
