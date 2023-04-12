package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.Student;
import com.example.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexpage(Model model) {
		init(model);
		
		
		return "index";
	}
	private void init(Model model) {
		model.addAttribute("student",new Student());
		model.addAttribute("courses", service.getCources());
		model.addAttribute("timings", service.getTimings());
	}
	@PostMapping("/save")
	public String save(Student s,Model model) {
		System.out.println(s);
		Boolean isSaved = service.save(s);
		if (isSaved) {
			model.addAttribute("msg", "Data Saved...");
		}
		init(model);
		
		return "index";
	}
	
	
}
