package com.neotech.lesson15;

public class Task1 {
	
	/*
	 * Create a method that will take 2 parameters as numbers and prints which number is larger
	 */
	
	void larger (double a, double b) {
		if (a > b) {
			System.out.println(a + " is larger");
		} else if (b > a) {
			System.out.println(b + " is larger");
		} else {
			System.out.println("Numbers are equal");
		}
	}

//================================================================================================================	
	
	/*
	 * Create a method that will take a number and prints whether the number is even or odd.
	 */
	
	void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

//================================================================================================================
	
	/*
	 * Create a method that will say Hello in different language based on the country that will passed when method is executed.
	 */
	
	void sayHello(String country) {
		switch (country) {
		case "USA":
			System.out.println("Hi");
			break;
		case "Tajikistan":
			System.out.println("Salom");
			break;
		case "Mexico":
			System.out.println("Hola");
			break;
		default:
			System.out.println("I don't know " + country);
		}
	}
	
	
	public static void main(String[] args) {
		
		Task1 t = new Task1();
		t.larger(5, 4);
		t.larger(2, 6);
		t.larger(4, 4);
		
		System.out.println("-----------------------");
		
		t.evenOdd(3);
		
		System.out.println("-----------------------");
		
		t.sayHello("Tajikistan");
	}

}
