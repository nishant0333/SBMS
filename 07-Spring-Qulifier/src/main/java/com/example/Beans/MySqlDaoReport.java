package com.example.Beans;

import org.springframework.stereotype.Component;

@Component("MySqlDaoReport")
public class MySqlDaoReport implements DaoReport {
public MySqlDaoReport() {
	System.out.println("MySqlDaoReport::Constructor");
}
	public void getReport() {
		System.out.println("MySqlDaoReport");
		
	}

	
	
}
