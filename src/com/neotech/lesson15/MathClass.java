package com.neotech.lesson15;

public class MathClass {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("Addition");
		calc.add(3, 5);
		calc.add(300,70);
		
		System.out.println("-----------------------");
		
		System.out.println("Multiplication");
		calc.multiply(10, 5);
		//calc.multiply(2.5, 4); //Compile Error, because we need just int
		
		System.out.println("-----------------------");
		
		System.out.println("Division");
		calc.divide(4.4, 2.2);
		calc.divide(10.5, 5);
	}

}
