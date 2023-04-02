package com.example;

public class UserDAOImpl implements UserDAO {
	
	public UserDAOImpl(){
		
	System.out.println("UserDAOImpl");
	}

	public String findName(int id) {
		
		return "test name";
	}

}
