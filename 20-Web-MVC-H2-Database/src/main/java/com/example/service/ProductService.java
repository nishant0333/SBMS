package com.example.service;

import java.util.List;

import com.example.binding.Product;

public interface ProductService {

	
	public void saveProduct(Product product);
	
	public List<Product> getAllProduct();
}
