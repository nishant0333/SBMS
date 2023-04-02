package com.example;

public class UserService {

	private UserDAO dao;
	
	public UserService() {
	
	System.out.println("UserService constructor");
	}
	
	public void setDao(UserDAO dao) {
		
		this.dao=dao;
	}
	
	public void printName(int id) {
		
		String name = dao.findName(id);
		
		System.out.println(name);
	}
	
}
