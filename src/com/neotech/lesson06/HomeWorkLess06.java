package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWorkLess06 {

	public static void main(String[] args) {
		
		/*
		 * Task 1:
		 * 1. You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 *		 	  
		 */
		
		
		System.out.println("Task 1:");
		
		Scanner loan = new Scanner (System.in);
		
		System.out.print("How much loan you need? ");
		double ln = loan.nextDouble();
		
		if (ln <= 200000) {
			System.out.println("You're eligible for a loan.");
		} else {
			System.out.println("You got rejected for your loan.");
		}
		
		System.out.println("========================================");
		
		
		
		/*
		 * Task 2:
		 * 2. You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
		 * 
		 */
		
		System.out.println("Task 2:");
		
		Scanner dr = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int age = dr.nextInt();
		
		if (age >= 18) {
			System.out.println("Congratulations, your driver's license is ready!");
		} else {
			System.out.println("Unfortunately you cannot get a driver's license due to age, sorry!");
		}
		
		System.out.println("=========================================");
		
		
		/*
		 * Task 3:
		 * 3. Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 *
		 */
		
		System.out.println("Task 3:");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Where do you live? ");
		String city = scan.next();
		
		System.out.print("What is the temperature in Fahrenheit? ");
		int temp = scan.nextInt();
		temp = (temp - 32) * 5 / 9;	
		
		System.out.println("The temperature is the city " + city + " is " + temp + " celcius.");
		
		System.out.println("=========================================");
		
		
		/*
		 * Task 4:
		 * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		 * • short (under 60 inch)
		 * • medium(between 60 -72 inch)
		 * • tall (over 72 inch)
		 * 
		 */
		
		System.out.println("Task 4:");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your height in inches: ");
		int height = sc.nextInt();
		System.out.println("You are " + height + " inches.");
		
		if (height < 60) {
			System.out.println("You are short.");
		} else if (height >= 60 && height <= 70) {
			System.out.println("You are medium.");
		} else {
			System.out.println("You are tall.");
		}
		
		System.out.println("=========================================");
		
		
		/*
		 * Task 5:
		 * Write a program that will print whether it is a weekend or weekday.	
		 * If any day from 1-5 → output “It is a weekday” 
		 * Any day from 6-7 → output “It is a weekend”,	
		 * Any other day → output “Invalid day”
		 * 
		 */
		
		System.out.println("Task 5:");
		
		Scanner wth = new Scanner(System.in);
		
		System.out.print("What day of the week is it? ");
		int day = wth.nextInt();
		
		if (day <= 5) {
			System.out.println("It's a weekday!");
		} else if (day ==6 || day == 7) {
			System.out.println("It is a weekend!");
		} else {
			System.out.println("Invalid day!");
		}
		
		System.out.println("=========================================");
	}

}
