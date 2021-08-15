package com.neotech.lesson15;

public class CalculatorWithReturn {
	
	int add(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	int multiply (int a, int b) {
		//Let me do it in one step
		return a * b;
	}
	
	//This method will get two numbers
	//And will return the division
	double divide (double a, double b) {
		double result = a / b;
		return result;
	}
}
