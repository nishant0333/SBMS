package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		CustomerRepo repo = context.getBean(CustomerRepo.class);
		
		Customer customer=new Customer();
		customer.setCName("customer1");
		customer.setCAddress("Bihar");
		
		repo.save(customer);
	}

}
