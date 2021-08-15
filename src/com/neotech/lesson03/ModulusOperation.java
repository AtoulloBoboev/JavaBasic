package com.neotech.lesson03;

public class ModulusOperation {
	public static void main(String[] args) {
		
		int a = 25;
		int b = 4;
		int div = 0;
		int rem = 0;
		
		div = a/b;  //25/4 --> 6
		rem = a%b;  //25%4 --> 24 is fully divisive by 6 and the remainder is 1.
		
		System.out.println(div);
		System.out.println(rem);
		
		//example:
		
		//input two numbers:
		
		double d1 = 2.434;
		double d2 = 3.435;
		
		int num1 = 7;
		int num2 = 2;
		
		int rem3 = num1%num2;
		System.out.println(rem3);
		
		int resrum = 7/2;
		double d3 = d1/d2;
		System.out.println(resrum);
		System.out.println(d3);
	}

}
