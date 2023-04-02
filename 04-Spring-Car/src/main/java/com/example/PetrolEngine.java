package com.example;

public class PetrolEngine implements Engine {
	
	
	public PetrolEngine() {
		System.out.println("petrol Engine");
	}


	public int start() {
		System.out.println("petrolEngine Started..");
		return 1;
	}

}
