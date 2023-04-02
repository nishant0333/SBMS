package com.example;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("creditCardpayment");
	}
	public boolean processPayment(double billAmt) {
		// logic 
		
		System.out.println("Credit Card payment process");
		return true;
	}


	
}
