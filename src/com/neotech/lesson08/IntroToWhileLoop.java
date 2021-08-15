package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {

//		int time = 10;
//
////		if(time < 9) 
////		{
////			System.out.println("Good morning!");
////		}
//
//		// IF A LOOP EXECUTES ALWAYS --. INFINITE LOOP
//
//		while (time < 12) // here we write the condition)
//		{ // begin while block
//
//			// this code is only executed if the condition is true
//			System.out.println("Time is: " + time);
//
//			time++;
//
//		} // ends the while block
		
		
		
		//Print numbers from 1 to 50
		int num1 = 1;
		
		//loop - iteration: one run of the while block
		
		//we want to print  1 2 3 .... 50 --> we want to increase each time y 1
		while (num1 <= 50)  //if num1 is less than or equal to 50 this loop will START running
		{
			System.out.println(num1);
			num1 ++;
		}
		
		
		//how to print numbers from 20 to 30
		int num2 = 20;
		
		while (num2 <= 30) //30 not included
		{
			System.out.print(num2 + " ");
			num2++;
		}
	}

}
