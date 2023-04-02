package com.example;

public class Car {
	
	private Engine eng;

	public Car() {
		
		System.out.println("0 param car constructor");
	}
	  public Car(Engine engine) {
	  
	  this.eng=engine;
	  
	  System.out.println("car class constructor"); }
	  
	  public void setEng(Engine engine) {
	  
	  this .eng=engine; }
	 
      

	public void drive() {
		int start = eng.start();
		
		if(start>=1) {
			System.out.println("journey Started");
		}
		else {
			System.out.println("Engine tourble");
		}
		
	}
	
}
