package com.simple_template.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("Driving a Bike");
		
	}

}
