package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student student=new Student();
		
		student.setName("mohan");
		student.setSection("A");
		
		repo.save(student);
	}

}
