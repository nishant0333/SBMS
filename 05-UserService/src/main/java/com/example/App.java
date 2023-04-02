package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("Beans.xml");
      UserService userService = ctx.getBean(UserService.class);
      userService.printName(12);
	}

}
