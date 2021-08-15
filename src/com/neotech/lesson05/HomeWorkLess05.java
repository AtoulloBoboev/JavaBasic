package com.neotech.lesson05;

public class HomeWorkLess05 {

	public static void main(String[] args) {

		/*
		 * Task 1: Write a java program to check if a patient has allergies. If the
		 * patient does not have allergies print “You’re healthy!”. If the patient has
		 * allergies, check if it is a peanut allergy, lactose allergy, bee allergy or
		 * seafood allergy and print a statement telling the patient “Don’t eat ___”.
		 * (fill the line with the food names – peanut, seafood etc.)
		 * 
		 */
		System.out.println("Task 1:");

		boolean hasAllergy = false;
		boolean peanutAllergy = true;
		boolean lactoseAllergy = true;
		boolean beeAllergy = true;
		boolean seafoodAllergy = true;

		if (hasAllergy) {
			if (peanutAllergy) {
				System.out.println("Do not eat peanut!");
			}
			if (lactoseAllergy) {
				System.out.println("Do not eat dairy!");
			}
			if (beeAllergy) {
				System.out.println("Do not eat honey!");
			}
			if (seafoodAllergy) {
				System.out.println("Do not eat calamari!");
			}
		} else {
			System.out.println("You are healthy!");
		}

		System.out.println("===========================================");

		/*
		 * Task 2: Create a Java program to check if it is Friday or not. If it is
		 * Friday, print “It’s Friday. I am going to watch a movie.” and check the date,
		 * if date is 13 print “I will watch a scary movie.”. If date is not 13 print “I
		 * will watch a comedy.”. If it is not Friday, print “It is NOT Friday. I am
		 * going to study JAVA.”
		 * 
		 */
		System.out.println("Task 2:");

		boolean Friday = false;
		int date = 13;

		if (Friday) {
			System.out.println("It's Friday. I am going to watch a movie.");

			if (date == 14) {
				System.out.println("I will watch a scary movie.");
			} else {
				System.out.println("I will watch a comedy.");
			}
		} else {
			System.out.println("It is not Friday. I am going to study JAVA.");
		}

		System.out.println("===========================================");

		/*
		 * Task 3: Write a Java program to check if a student has done the Quiz. If the
		 * student did the Quiz, then check the score and give the following
		 * evaluations: o If the score is 90 or greater, print “A, Great job!”. o If the
		 * score is 80 or greater, print “B, Well done!”. o If the score is 70 or
		 * greater, print “C, You passed!”. o Otherwise, print “F, You failed”.
		 * 
		 */

		System.out.println("Task 3:");

		boolean quiz = true;
		int score = 93;

		if (quiz == true && score >= 90) {
			System.out.println("A, Great job!");
		} else if (quiz == true && score >= 80) {
			System.out.println("B, Well done!");
		} else if (quiz == true && score >= 70) {
			System.out.println("C, You passed");
		} else {
			System.out.println("F, You failed!");
		}

		System.out.println("===========================================");

		/*
		 * Task 4: Write a program to implement following logic using if-else if-else
		 * statement: o if hour is less than 12 noon, greet with Good Morning o if hour
		 * is greater than or equal 12 noon but less than 3 pm, greet with Good
		 * Afternoon o if hour is greater than or equal to 3 pm, greet with Good Evening
		 * 
		 */

		System.out.println("Task 4:");

		int time = 12;

		if (time < 12) {
			System.out.println("Good Morning!");
		} else if (time >= 12 && time < 15) {
			System.out.println("Good Afternoon!");
		} else {
			System.out.println("Good Evening!");
		}

		System.out.println("===========================================");

		/*
		 * Task 5: INTERVIEW QUESTION!!!!!! Write a Java Program to check whether number
		 * is Even or Odd.
		 * 
		 */

		System.out.println("Task 5:");

		int number = 101;
		int reminder = number % 2;
		
		if (reminder == 1) {
			System.out.println("This is an odd number!");
		} else {
			System.out.println("This is an even number!");
		}

		
		
		
		System.out.println("****************************************");
		
		

	}

}
