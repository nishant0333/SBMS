package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Product;
import com.example.repo.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepo repo = context.getBean(ProductRepo.class);
		
		Product pro=new Product();
		pro.setPId(102);
		pro.setPName("testProduct2 again");
		
		repo.save(pro);
	}

}
