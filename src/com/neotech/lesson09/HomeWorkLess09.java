package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWorkLess09 {
	
	public static void main(String[] args) {
		
		/*
		 * Task 1:
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 */
		
		System.out.println("Print numbers from 1 to 100 except those that are divisible by 3");
		
		for (int d = 1; d <= 100; d++) {
			
			if (d % 3 == 0) {
				System.out.print(d + " ");
				
				
	}
			
		}
		
		System.out.println(" ");
		
		/*
		 * Task 2:
		 * Create a program that will be asking user to apply for a credit card 10 times.
		 * As soon you get an "yes" from a user program should stop asking.
		 * 
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		String input;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			input = scan.next();
			
			if (input.equalsIgnoreCase("yes")) {
				System.out.println("Great!");
				break;
	}
		}
		
		
	}
}
