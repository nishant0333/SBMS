package com.example.Beans;

import org.springframework.stereotype.Component;

@Component("OracleDaoReport")
public class OracleDaoReport implements DaoReport {

	public OracleDaoReport() {
		System.out.println("OracleDao::Constructor");
	}
	public void getReport() {
		
		System.out.println("oracle Dao report generated");
	}

}
