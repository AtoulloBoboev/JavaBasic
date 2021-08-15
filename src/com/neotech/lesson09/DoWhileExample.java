package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int number;
		
//		System.out.print("Guess the number: ");
//		number = scan.nextInt();
//		
//		while (number !=7) {
//			System.out.print("Guess the number: ");
//			number = scan.nextInt();
//		}
//		
//		System.out.println("You are a winner!");
	
	
		//DO WHILE LOOP:
		
		do {
			System.out.print("Guess the number: ");
			number = scan.nextInt();
		} while (number != 7);
		System.out.println("You are winner!");
	}

}
