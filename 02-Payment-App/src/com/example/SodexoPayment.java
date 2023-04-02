package com.example;

public class SodexoPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		// logic 
		
		System.out.println("SodexoPayment payment process");
		return true;
	}

}
