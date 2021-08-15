package com.neotech.lesson08;

public class IntroToDoWhileLoop {
	
	public static void main(String[] args) {
		
		
		int num = 5;
		
		while (num < 15) 
		{
			
			System.out.print(num + " ");
			num++;
			
		}
		
		//OUTPUT: 5 6 7 8 9 10 ... 14
		System.out.println();
		
		int num2 = 5;
		
		//do something while the condition is true 
		do 
		{
			System.out.print(num2 + " ");
			num2++;
			
		} while (num2 < 15);
	}

}
