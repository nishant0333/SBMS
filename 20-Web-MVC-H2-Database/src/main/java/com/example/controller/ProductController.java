package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.Product;
import com.example.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		model.addAttribute("product", new Product());
		
		return "index";
	}
	
	
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute("product") Product product,Model model) {
		service.saveProduct(product);
		//model.addAttribute("product", new Product());
		model.addAttribute("msg", "Product Saved...");
		return "index";
	}
	
	
	@GetMapping("/getAll")
	public String getAllProduct(Model model){
		List<Product> allProduct = service.getAllProduct();
		model.addAttribute("allProduct", allProduct);
		return "product";
	}
	
	
	
}
