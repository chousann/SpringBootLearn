package com.chousann.myconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chousann.Helloservice;
import com.chousann.myconfig.utils.ApplicationContextUtils;

@Controller
public class HelloController {
	Helloservice helloService;

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		helloService = (Helloservice)ApplicationContextUtils.getBean("helloService");
		
		return helloService.toString();
	}
}
