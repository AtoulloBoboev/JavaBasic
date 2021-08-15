package com.neotech.lesson04;

public class HomeWorkLess04 {
	public static void main(String[] args) {
		
		/*
		 * Create a Java program and name it Double Comparison. 
		 * Declare 2 double values and if value of first variable is higher then the second, 
		 * print “Double value __ is larger than __ .” 
		 * Otherwise print...
		 */
		
		double a1 = 23;
		double a2 = 54;
		
		if (a2 > a2) {
			System.out.println("Double value " + a1 + " is larger than " + a2);
		} else {
			System.out.println("Double value " + a2 + " is larger than " + a1);
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * Create a Java program and name it Temperature Check. 
		 * Create variable to store temperature. 
		 * Your program should check if temperature is below 32 
		 * If temperature is below then it should print “Water will freeze with temperature __”, otherwise “Water will NOT freeze with temperature __”.
		 */
		
		int temperature = 65;
		
		System.out.println(temperature < 32);
		
		if (temperature < 32) {
			System.out.println("Water will freeze with temperature " + temperature);
		}
		
		else {
			System.out.println("Watr will not freeze with temperature " + temperature);
		}
	}

}
