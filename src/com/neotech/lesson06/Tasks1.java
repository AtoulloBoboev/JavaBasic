package com.neotech.lesson06;

import java.util.Scanner;

public class Tasks1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * 1. Write a program that asks user to enter first name and then last name. At the end system should display user’s full name.
		 * 2. Write a program that calculates the sum of two numbers entered by the user.
		 * 3. Write a program that asks user to enter two numbers and prints which one is larger
		 */
		
		System.out.print("Please enter your first name: ");
		String name = in.next();
		System.out.println("Your first name is " + name);
		
		System.out.print("Please nter your last name: ");
		String lastName = in.next();
		System.out.println("Your last name is " + lastName);
		
		System.out.println("Your full name is " + name + " " + lastName);
		
		System.out.println("======================================");
		
//		System.out.print("Enter first number: ");
//		int num1 = in.nextInt();
//		
//		System.out.print("Enter second number: ");
//		int num2 = in.nextInt();
//		
//		int sum = num1 + num2;
//		
//		System.out.println("Sum of numbers: " + num1 + " + " + num2 + " = " + sum);
		
	}

}
