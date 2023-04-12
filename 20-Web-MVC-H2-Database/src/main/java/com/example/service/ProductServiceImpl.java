package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.Product;
import com.example.entity.ProductEntity;
import com.example.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;
	
	@Override
	public void saveProduct(Product product) {
		
		ProductEntity entity=new ProductEntity();
		
		BeanUtils.copyProperties(product, entity);
		
		
		
		ProductEntity save = repo.save(entity);
		System.out.println(save);
	}

	@Override
	public List<Product> getAllProduct() {
		List<ProductEntity> list = repo.findAll();
		
		
		List<Product> productList = list.stream().map(e->{
			Product product=new Product();
			BeanUtils.copyProperties(e, product);
			return product;
		}).collect(Collectors.toList());
		
		System.out.println(productList);
		return productList;
	}

}
