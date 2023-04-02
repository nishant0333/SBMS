package com.example;

public  class DebitCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		// logic 
		
		System.out.println("Debit Card payment process");
		return true;
	}

}
