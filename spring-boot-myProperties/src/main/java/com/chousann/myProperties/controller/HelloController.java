package com.chousann.myProperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chousann.myProperties.bean.Env;
import com.chousann.myProperties.bean.Person;

@Controller
public class HelloController {

	@Autowired
	Person person;
	
	@Autowired
	Env environment;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return person.toString() + "\n" + environment.toString();
	}
}