package com.neotech.lesson22;

// Create 1 class with 3 overloaded static methods. 
//Then call each overloaded methods with specific arguments and observe the results.

public class Car {
	
	static void Tesla(String model, int year) {
		System.out.println("Tesla " + model + " " + year + " year.");
	}
	
	static void BMW (String model, String color, int horsPower) {
		System.out.println("BMW " + model + " " + color + " color has " + horsPower + " hp." );
	}
	
	static void Nissan(String model, double price) {
		System.out.println("Nissan model " + model + " $" + price);
	}

	
	public static void main(String[] args) {
		Tesla("Model S", 2020);
		BMW("X5", "black", 400);
		Nissan("SENTRA", 23000);
	}
}


