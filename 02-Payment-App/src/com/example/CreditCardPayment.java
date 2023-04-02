package com.example;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		// logic 
		
		System.out.println("Credit Card payment process");
		return true;
	}

}
