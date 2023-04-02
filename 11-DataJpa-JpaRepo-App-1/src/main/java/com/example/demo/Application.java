package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepo employeeRepo = context.getBean(EmployeeRepo.class);

//		Employee e= new Employee(101,"Amit",25000.00,"male", "HR");
//		Employee e1= new Employee(102,"ram",65000.00,"male", "admin");
//		Employee e2= new Employee(103,"mohan",15000.00,"male", "Acc");
//		Employee e3= new Employee(104,"sapna",45000.00,"female", "HR");
//		Employee e4= new Employee(105,"sita",55000.00,"female", "IT");
//		
//		employeeRepo.saveAll(Arrays.asList(e,e1,e2,e3,e4));
//		
//		System.out.println("Employee saved");

//		List<Employee> findAll = employeeRepo.findAll();
//		
//		findAll.forEach(System.out::println);

//		Sort sort = Sort.by("salary").ascending();
//
//		List<Employee> findAll = employeeRepo.findAll(sort);
//
//		findAll.forEach(System.out::println);
		
//		Sort sort = Sort.by("salary").ascending();
//		int pageNumber=2;
//		PageRequest page = PageRequest.of(pageNumber-1, 2, sort);
//		
//		Page<Employee> findAll = employeeRepo.findAll(page);
//		
//		findAll.forEach(System.out::println);
		
		Employee emp=new Employee();
		emp.setGender("male");
		
		Example<Employee> example=Example.of(emp);
		
		List<Employee> findAll = employeeRepo.findAll(example);
		
		findAll.forEach(System.out::println);
		

	}

}