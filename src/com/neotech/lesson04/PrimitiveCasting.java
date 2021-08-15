package com.neotech.lesson04;

public class PrimitiveCasting {
	public static void main(String[] args) {
		//smallest to the biggest
		//byte -> short -> int -> long -> float -> double
		
		double d1 = 7.5; //no casting/conversion
		System.out.println(d1);
		
		double d2 = 7; //casting is happening
		System.out.println(d2);
		
		//widening, implicit casting, is done automatically
		int num1 = 10;
		double d3 = num1; //casting
		System.out.println(d3);
		
		//narrowing, explicit casting, manually
		//int num2 = 7.9; //compile error, Type mmismatch: cannot convert from double to int
		int num2 = (int) 7.99999; //I tell the compiler: I want to store it as an integer
		System.out.println(num2);
		
		//narrowing, explicit casting, should be done manually
		byte b1 = (byte) 12345; //I will take the responsibility
		System.out.println(b1);
		
		System.out.println("***************");
		
		int i2 = 5;
		byte b2 = (byte)i2; //I may or may not lose data
		System.out.println(b2); //I didn't lose any data 
		
		long long1 = 85;
		int number1 = (int) long1; //I may lose data
		System.out.println(number1);
		
		//narrowing
		//ypu're trying to fit something bit into a small container
		long long2 = 578567838L;
		int int2 = (int) long2; //I may lose data
		System.out.println(int2);
		
		//widening
		int number3 = 195;
		float f3 = number3;
		float f4 = number3; //I will not lose data
		
		//Quick task
		//try to store 5.84 into a byte
		//try to store 19 as double
		double st = 5.84;
		byte s = (byte) st;
		System.out.println(s);
		
		int t1 = 19;
		double t2 = t1;
		System.out.println(t2);
			
		/*
		 *  Create a int variable named number1, assign the value of 500.
		 *  Store/assign number1 into a byte name number2
		 *  Re-assign the number1 into number2.
		 *  Print the value of number2. Check if it is 500
		 *  What if the initial value was 50?
		 */
		int number11 = 500;
		byte number22 = (byte) 500;
		number11 = number22;
		System.out.println(number11);
		
		number11 = 50;
		number22 = (byte) number11;
		number11 = number22;
		System.out.println(number22);
		
	}

}
