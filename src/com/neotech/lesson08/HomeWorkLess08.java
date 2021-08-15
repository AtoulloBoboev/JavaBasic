package com.neotech.lesson08;

import java.util.Scanner;

public class HomeWorkLess08 {
	
	public static void main(String[] args) {
		
		System.out.println("Task 1:");
		
		/*
		 * Write a program using while loop 
		 * that calculates the sum of the even numbers between 0 and 10.
		 */
		
		//1st way, increment by 1
		int i = 0;
		int sum = 0;
		
		while (i <= 10) {
			if	(i %2 == 0) {  //even
				sum = sum + i;
				//System.out.println("Even numbers between 0 and 10: " + sum);
			}
			
			i++;
			
		}
		
		System.out.println("Sum of the even numbers: " + sum);
		
		
		//2nd way, increment by 2
		int j = 0;
		int total = 0;
		
		while (j <= 10) {
			total += j;
			j = j + 2;
		}
		
		System.out.println("Total = " + total);
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		/*
		 * Write a program that asks user to enter his/her username and password until user enters them correctly.
		 * 
		 */
		System.out.println("Task 2:");
		Scanner us = new Scanner (System.in);
		
		System.out.print("Please enter your name: ");
		String name = us.next();
		System.out.print("Please enter password: ");
		String password = us.next();
		
		if(name.equals("user") && password.equals("zxcvb")) {
			System.out.println("Correct username and password");
		} else {
			System.out.println("Invalid login or password!");
		}
		
		
	}
	
	
	

}
