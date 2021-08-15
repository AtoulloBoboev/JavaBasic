package com.neotech.lesson20;

public class Car {
	
	String model, brand;
	int year;
	
	Car() {
		System.out.println("I am the default constructor");
	}

	//2nd way
//	Car(String carModel, String carBrand, int carYear) {
//		System.out.println("I am creating an object with parameters");
//		model = carModel;
//		brand = carBrand;
//		year = carYear;
//	}
	
	//this method will print the details of car
	public void printDetails() {
		System.out.println("I have a " + year + " " + model + " of " + brand);
	}

}
