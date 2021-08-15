package com.neotech.lesson04;

public class IfCondition2 {
	
	public static void main(String[] args) {
		//if you have more yhan $5000 in your bank account
		//than you can buy a Gucci bag
		
		int balance = 1200;
		
		if (balance > 5000) {
			System.out.println("I will buy a Gucci bag!");
			System.out.println("I am happy!");
		}
		
		System.out.println("I am outside of the mall");
		
		System.out.println("--------------------");
		//You should practice Java 15 hours per week
		//If you are practicing 15 hours or more, you will love Java
		//otherwise you will not love Java
		
		int practiceHours = 1;
		
		if (practiceHours <=15) {
			
			//if statement is true this part will be executed
			System.out.println("You will love Java!");
		}
		else {
			System.out.println("You will hate Java!");
		}
		
		System.out.println("This will always be printed!");
	}

}
