package com.example.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.config.Car;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = ctx.getBean(Car.class);
		System.out.println(car.hashCode());
		
	}
	
	
	
}
