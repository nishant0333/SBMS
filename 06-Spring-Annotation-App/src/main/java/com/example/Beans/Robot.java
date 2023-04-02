package com.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	public Robot() {
		
		System.out.println("Robot::Constructer");
	}
	
	
	private Chip chip;
	
	public void setChip(Chip chip) {
		this.chip=chip;
	}
	//@Autowired
    public Robot(Chip chip) {
		this.chip=chip;
		System.out.println("1param Robot::Constructer");
	}
	
	public void doWork() {
		
		String chipType = chip.chipType();
		if (chipType.equals("32-Bit")) {
			
			System.out.println("performance is slow");
			
		}
	}
	
}
