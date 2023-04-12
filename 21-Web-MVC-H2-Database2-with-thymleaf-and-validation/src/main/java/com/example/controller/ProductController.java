package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Product;
import com.example.repo.ProductRepo;


@Controller
public class ProductController {

	@Autowired
	private ProductRepo repo;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		model.addAttribute("product", new Product());
		
		return "index";
	}
	
	
	@PostMapping("/save")
	public String saveProduct( @Validated @ModelAttribute("product") Product product,BindingResult result,Model model) {
		
		if (result.hasErrors()) {
			System.out.println(product);
			return "index";
		}
		
		Product saved = repo.save(product);
		if (saved.getId()!=null) {
			model.addAttribute("msg", "Product Saved...");
		}
		return "index";
	}
	
	
	@GetMapping("/products")
	public String getAllProduct(Model model){
		List<Product> allProduct = repo.findAll();
		model.addAttribute("allProduct", allProduct);
		return "data";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("id") Integer id , Model model) {
		repo.deleteById(id);
		model.addAttribute("mssg", "Product Delete");
		model.addAttribute("allProduct", repo.findAll());
		return "data";
	}
	
	@GetMapping("/edit")
	public String editProduct(@RequestParam("id") Integer id , Model model) {
		
		Optional<Product> findById = repo.findById(id);
		
		if (findById.isPresent()) {
			Product product = findById.get();
			model.addAttribute("product", product);
			
		}
		
		return "index";
	}
	
}
