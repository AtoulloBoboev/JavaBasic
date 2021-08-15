package com.neotech.lesson11;

public class HomeWorkLess11 {
	public static void main(String[] args) {
		
		
		System.out.println("Task 1:");
				
		/*
		 * Task1:
		 * Create an array of cars and store 6 elements into it. 
		 * Print all values from the array.
		 * 
		 */
		
		String [] carArray = { "BMW", "Mersedes-Benz", "Tesla", "Lexus", "Toyota", "Nissan"};
		
//		carArray[0] = "BMW";
//		carArray[1] = "Mersedes-Benz";
//		carArray[2] = "Tesla";
//		carArray[3] = "Lexus";
//		carArray[4] = "Toyota";
//		carArray[5] = "Nissan";
		
		//int length = carArray.length;
		for (int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("Task 2:");
		
		/*
		 * Task 2:
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		
		int intg [] = {2, 4, 8, 12, 26};
		int sum = 0;
		for (int i = 0; i < intg.length; i++) {
			sum = sum + intg[i];
		}
		System.out.println("Sum of elements: " + sum);
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("Task 3:");
		
		/*
		 * Task 3:
		 * Create an array of countries. While retrieving all values from an array print capital for each country.
		 */
		
		String countries [] = { "Tajikistan", "Russia", "Canada", "Turkey", "Italy" };
		
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("Tajikistan")) {
				System.out.println("Dushanbe");
			} else if (countries[i].equals("Russia")) {
				System.out.println("Moscow");
			} else if (countries[i].equals("Canada")) {
				System.out.println("Ottawa");
			} else if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (countries[i].equals("Italy")) {
				System.out.println("Rome");
			}
		}
	}

}
