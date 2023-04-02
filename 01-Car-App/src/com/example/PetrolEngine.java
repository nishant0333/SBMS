package com.example;

public class PetrolEngine implements Engine {

	@Override
	public int start() {
		System.out.println("petrolEngine Started..");
		return 1;
	}

}
