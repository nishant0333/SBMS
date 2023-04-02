package com.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {

	public Chip() {
		
		System.out.println("Chip::Constructer");
	}
	
	public String chipType() {
		
		return "32-Bit ";
	}
}
