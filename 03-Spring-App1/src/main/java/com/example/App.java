package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	PaymentService service = ctx.getBean(PaymentService.class);
	
	service.doPayment(225.00);
	
	
	}

}
