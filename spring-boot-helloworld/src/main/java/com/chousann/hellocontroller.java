package com.chousann;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller {
	@ResponseBody
    @RequestMapping("/hello1")
    public String hello(){
        return "Hello1 World!";
    }
}
