package com.neotech.lesson27;

/*
 * Create a class Insurance that will have an attribute as insuranceNameand unimplemented behavior as getQuoteand cancelInsurance. 
 * Create 3 subclasses Car, Pet, Health. 
 * Car class has it’sown attribute as carModeland Class Pet has petTypeattribute. 
 * Create 3 objects of the sub classes and store them in ArrayList. 
 * Using for loop/advanced for loop/ iterator access all methods of the class.
 */

public abstract class Insurance {
	
	String insuranceName;
	
	//constructor
	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	abstract void getQuote();
	
	abstract void cancelInsurance();
}

class CarInsurance extends Insurance{
	
	String carModel;
	
	CarInsurance(String insuranceName, String carModel) {
		
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	void getQuote() {
		System.out.println("The quote for " + carModel + " is $600");
	}

	@Override
	void cancelInsurance() {
		System.out.println("Canceling the CAR insurance");
		
	}	
}

class PetInsurance extends Insurance{

	String petType;
	
	PetInsurance(String insuranceName, String petName) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	void getQuote() {
		System.out.println("The quote for " + petType + " is $200");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Canceling the PET insurance");
		
	}	
}

class HealthInsurance extends Insurance{

	HealthInsurance(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	void getQuote() {
		System.out.println("The quote for health incurance is $1200");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Canceling the HEALTH insurance");
		
	}
	
}
