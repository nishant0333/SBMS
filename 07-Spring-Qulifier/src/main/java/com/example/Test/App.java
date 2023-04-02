package com.example.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Beans.Report;
import com.example.Config.myConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(myConfig.class);
	
	Report report = ctx.getBean(Report.class);
	
	report.report();
	
	}

}
