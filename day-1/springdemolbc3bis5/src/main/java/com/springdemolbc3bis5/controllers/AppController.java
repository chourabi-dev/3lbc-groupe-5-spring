package com.springdemolbc3bis5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	
	@GetMapping("/hello")
	public String sayHelloToUser(  Model model  ) {
		
		String title="3LBC";
		
		model.addAttribute("title",title);
		
		return "hello";
	}

}
