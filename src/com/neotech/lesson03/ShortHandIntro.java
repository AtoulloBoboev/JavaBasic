package com.neotech.lesson03;

public class ShortHandIntro {
	public static void main(String[] args) {
		
		
		int num1 = 5;
		int num2 = 6;
		int sum = 0;
		
		System.out.println(num1);
		//add to sum tje numbers num1 and num2.
		sum = num1 + num2;
		
		//what if we want to change num1 itsekf??
		   //reassigning:
		num1 = 8;//num1 will be 8
		//adding another value to it
		num1 = num1 + 8; //num1 will be 5+8 ... keep what you have and add more to it.
		System.out.println(num1);
	}

}
