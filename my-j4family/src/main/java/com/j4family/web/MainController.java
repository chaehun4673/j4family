package com.j4family.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping("/home")
public class MainController {
	
	@RequestMapping("/index")
	public String mainView() {
		return "index";
	}

}
