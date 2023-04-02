package com.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Report {
public Report() {
	System.out.println("Report::Constroctur");
	
}
	
	@Autowired
	@Qualifier("MySqlDaoReport")
	private DaoReport dao;
	
	public void report() {
		
		dao.getReport();
		System.out.println("report generated");
	}
}
