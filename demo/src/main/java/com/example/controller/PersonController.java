package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String Person (Model model) {
		Person p = new Person();
		p.setFirstName("Mohit");
		p.setLastName("Sharma");
		p.setAge(33); 
		model.addAttribute("person",p);
		return "personview";
	}
	
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My release on Spring Boot App";
	}
}
