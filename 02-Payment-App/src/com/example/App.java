package com.example;

public class App {

	public static void main(String[] args) {
	IPayment p1=new DebitCardPayment();
	IPayment p2=new DebitCardPayment();
	PaymentService ps=new PaymentService(p1);
	 
	ps.setPayment(p2);
	
	ps.doPayment(455.00);
	
	}

}
