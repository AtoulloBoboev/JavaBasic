package com.neotech.lesson07;

import java.util.Scanner;

public class HomeWorkLess07 {
	
	public static void main(String[] args) {
					
		/*
		 * Task 1:
		 * Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 * 
		 */
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Task 1:");
						
		System.out.print("Please enter your grade: ");
		char value = sr.next().charAt(0);
		
		switch (value) {
		
		case('A'):
			System.out.println("You are excellent!");
		break;
		
		case ('B'): 
			System.out.println("You are good!");
		break;
		
		case ('C'): 
			System.out.println("You are bad!");
		break;
		
		default:
			System.out.println("Not acceptable!");
		
		}
		
		System.out.println("====================");
		
// =============================================================================================================================
				
		/*
		 * Using scanner class to create a calculator.
		 * Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 */
		
		System.out.println("Task 2:");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Please enter your second number: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Please enter your operator: ");
		char oper = scan.next().charAt(0);
		
		switch (oper) {
		
		case ('+'):
			System.out.println("The result will be: " + num1 + " + " + num2 + " = " + (num1 + num2));
		break;
		
		case ('-'):
			System.out.println("The result will be: " + num1 + " - " + num2 + " = " + (num1 - num2));
		break;
			
		case ('*'):
			System.out.println("The result will be: " + num1 + " * " + num2 + " = " + (num1 * num2));
		break;
		
		case ('/'):
			System.out.println("The result will be: " + num1 + " / " + num2 + " = " + (num1 / num2));
		break;
		
		default:
			System.out.println("Invalid data!");
		}
		
		System.out.println("====================");
		
// =============================================================================================================================
		
		System.out.println("Task 3:");
		
		/*
		 * Write a program that lets user to enter apple, dell, acer laptop models; 
		 * If it is apple show “Apple-no virus” 
		 * If it is dell show “Tough one” 
		 * If it is acer show “Cheap one” 
		 * Else “do not buy that one!”
		 * 
		 */
				
		Scanner comp = new Scanner (System.in);
		
		System.out.print("Please enter the name of your laptop: ");
		String laptops = comp.next();
		
		switch (laptops) {
		
		case ("Apple"):
			System.out.println("Apple - no virus!");
		break;
		
		case ("Dell"):
			System.out.println("Though one!");
		break;
		
		case ("Acer"):
			System.out.println("Cheap one!");
		break;
		
		default:
			System.out.println("Do not buy that one!");
		}
		
		
		System.out.println("====================");
		
//	=============================================================================================================================
						
		System.out.println("Task 4:");
		
		/*
		 * Write a program to display days:
		 * 1 - Monday
		 * 2 - Tuesday
		 * 3 - Wednesday
		 * 4 - Thursday
		 * 5 - Friday
		 * 6 - Saturday
		 * 7 - Sunday
		 * 
		 */
		
		Scanner wk = new Scanner (System.in);
		
		System.out.print("Please enter the day: ");
		int day = wk.nextInt();
		
		switch (day) {
		
		case 1:
			System.out.println("Monday");
		break;
		
		case 2:
			System.out.println("Tuesday");
		break;
		
		case 3:
			System.out.println("Wednesday");
		break;
		
		case 4:
			System.out.println("Thursday");
		break;
		
		case 5:
			System.out.println("Friday");
		break;
		
		case 6:
			System.out.println("Saturday");
		break;
		
		case 7:
			System.out.println("Sunday");
		break;
		
		default:
		System.out.println("Invalid day!");
		}
	}

}
