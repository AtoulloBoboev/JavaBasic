package com.neotech.lesson06;

import java.util.Scanner;

public class Task2and3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		System.out.print("Enter first number: ");
		int num1 = in.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Sum of numbers: " + num1 + " + " + num2 + " = " + sum);
		
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}

}
