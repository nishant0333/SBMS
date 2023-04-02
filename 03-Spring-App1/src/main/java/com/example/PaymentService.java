package com.example;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService (IPayment payment) {
		
		this.payment=payment;
		
		System.out.println("paymentService");
	}
	
	

	public void setPayment(IPayment payment) {
		
		this.payment=payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		if (status) {
			System.out.println("printing recipet");
		}
		else {
			System.out.println("payment Decline");
		}
		
	}
	
	
}
