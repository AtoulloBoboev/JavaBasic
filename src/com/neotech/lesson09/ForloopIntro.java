package com.neotech.lesson09;

public class ForloopIntro {
	
	public static void main(String[] args) {
		
		//print number 1 to 5
		
		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("-------------------------");
		
		//when we know how many time it will execute
		//we should go with For loop
		
		//three parts of a for loop
		//initialization; condition; increment
		for (int b = 50; b >= 1; b--) {
			System.out.print(b + " ");
		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		//print numbers from 1 to 10, 1st way
		//1st way
		System.out.println("Print odd numbers from 1 to 10, 1st way");
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("Print odd numbers from 1 to 10, 2nd way");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("Print odd numbers from 1 to 10, 3rd way");
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
	}
	}

