package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Book;
import com.example.repository.BookRepo;

@Controller
public class BookController {

	@Autowired
	private BookRepo repo;
	
//	@GetMapping("/book")
//	public ModelAndView getBookById(@RequestParam("id") Integer id) {
//		
//		System.out.println("id :"+ id);
//	ModelAndView mov = new ModelAndView();
//	
//	Optional<Book> findById = repo.findById(id);
//	
//	if (findById.isPresent()) {
//		Book book = findById.get();
//		mov.addObject("book" , book);
//	}
//	mov.setViewName("index");
//		System.out.println(mov);
//		return mov;
//	}
	
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer id,Model model) {
		
		System.out.println("id :"+ id);
	
	
	Optional<Book> findById = repo.findById(id);
	
	if (findById.isPresent()) {
		Book findbook = findById.get();
		model.addAttribute("book",findbook);
		model.addAttribute("message", "book present in DB");
	}else {
		model.addAttribute("message", "book not present in DB");
	}
	
		System.out.println(model);
		return "index";
	}
	
}
