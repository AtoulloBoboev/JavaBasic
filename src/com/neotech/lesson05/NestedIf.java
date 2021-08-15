package com.neotech.lesson05;

public class NestedIf {
	
	public static void main(String[] args) {
		
//		if () //today is Tuesday
//		{
//			if() //if the time is before 5 pm
//			{
//				//you are at work
//			}
//			else 
//			{
//				//you are at home
//			}
//		}
//		else //its a weekend 
//		{
//			if()
//			{
//				
//			}
//			else
//			{
//				
//			}
//		}
		
		//when does this become a nested if
		//--> when an if statement is coded inside another if block
		//--> when an if statement is coded inside the else block
		
		
		//Aim:
		//
		
		//if it morning ---- say "good morning!'
		//if it is a school day ---- "hangout with friends!"
		//else (not a school day) ---- "hangout with family!"
		//else    ---- say "it is not morning!"
		
		boolean isMorning = true;
		boolean schoolDay = true;
		
		if (isMorning)
		{
			System.out.println("Good morning!");
			
			//this is the beginning of the nested if-else statement 
			if (schoolDay)
			{
				System.out.println("You are at school!");				
			}
			else //it is not schoolDay
			{
				System.out.println("Hangout with family!");
			}
		}
		else //it is not morning
		{
			System.out.println("It is not morning!");
		}
	}

}
