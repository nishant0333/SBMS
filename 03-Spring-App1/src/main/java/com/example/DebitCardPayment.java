package com.example;

public  class DebitCardPayment implements IPayment{
	public DebitCardPayment() {
		System.out.println("DebitCardpayment");
	}
	
	public boolean processPayment(double billAmt) {
		// logic 
		
		System.out.println("Debit Card payment process");
		return true;
	}

}
