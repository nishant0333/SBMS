package com.example.Dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean {

	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		
         System.out.println("geting Data from DB");
		
		 System.out.println("Storing Data in Radis");
	}
}
