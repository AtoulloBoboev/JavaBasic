package com.neotech.lesson09;

public class TaskLess09 {
	
	public static void main(String[] args) {
		
		/*
		 *  Print numbers from 1 to 100 in 1 line with space
		 *  Print numbers from 100 to 1
		 *  Print even numbers from 20 to 1 (2 ways)
		 *  Print odd numbers between 20 and 50 (2 ways)
		 */
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		
		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Print even numbers from 20 to 1 (2 ways)");
		for (int c = 20; c >= 1; c-=1) {
			System.out.println(c);
			c-=1;
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Print odd numbers between 20 and 50 (2 ways)");
		
			for (int d = 20; d <= 50; d++) {
				
				if (d % 2 == 1) {
					System.out.println(d);
}
}
}
}
