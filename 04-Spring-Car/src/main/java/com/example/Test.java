package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("Beans.xml");
		
		  Car car = ctx.getBean(Car.class); 
		  car.drive();
		 
		
	}

}
