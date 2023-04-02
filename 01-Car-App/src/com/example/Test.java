package com.example;

public class Test {

	public static void main(String[] args) {
		//Car car = new Car(new DesigleEngine());
		Car car = new Car(new PetrolEngine());
		
		car.setEng(new DesigleEngine());
		
		car.drive();
	}

}
