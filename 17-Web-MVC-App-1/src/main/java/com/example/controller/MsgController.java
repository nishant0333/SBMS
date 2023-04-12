package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg" , "welcome to web MVC");
		modelAndView.setViewName("massage");
		
		return modelAndView;
		
		
	}
	
	@GetMapping("/greet")
	public ModelAndView getgreet() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg" , "good morning");
		modelAndView.setViewName("massage");
		
		return modelAndView;
		
		
	}
}
