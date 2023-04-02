package com.example.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.MyConfig;
import com.example.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(MyConfig.class);




	}

}
