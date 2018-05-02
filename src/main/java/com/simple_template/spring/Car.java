package com.simple_template.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired  // se uite in xml, si unde vede un id=tyre il inlocuieste
	// merge in doua moduri, doar cu annotation si trb sa pui Component la Tyre
	// ori cu beans, sau poti sa te folosesti de amandoua
	Tyre tyre;
	
	
	
	public Tyre getTyre() {
		return tyre;
	}



	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



	public void drive() {
		System.out.println("Driving a Car");
	}



	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	
	

}
