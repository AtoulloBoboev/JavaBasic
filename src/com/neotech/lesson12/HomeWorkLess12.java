package com.neotech.lesson12;

public class HomeWorkLess12 {
	
	public static void main(String[] args) {
		
		System.out.println("Task 1: ");
				
		/*
		 * Create a 2D array where you will store the following values:
		 * - Mr, Mrs, Ms, Miss
		 * -Smith, Jordan, Jackson, Obama.
		 * After storing values print the following:
		 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 * --- Be careful because they are mixed.--
		 */
		
		 /*
		  * 			col 0		col 1		col 2		col 3
		  * row 0		 Mr,		 Mrs,		 Ms,		 Miss
		  * row 1		Smith,		Jordan,		Jackson,	Obama
		  * 
		  */
		
		String[][] names1 = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		//Mrs Smith
		System.out.println(names1[0][1] + " " + names1[1][0]);
		
		//Mr Obama
		System.out.println(names1[0][0] + " " + names1[1][3]);
		
		//Ms Jackson
		System.out.println(names1[0][2] + " " + names1[1][2]);
		
		//Miss Jordan
		System.out.println(names1[0][3] + " " + names1[1][1]);
		
		System.out.println();
		
//=================================================================================================================================
		
	/*
	 * Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
	 * Then you program should print name of the students that has A and B grade	
	 */
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("Task 2: ");
		
		String[][] names = {
				{"Jack", "John", "Justin", "Jordan"},
				{ "A",    "   B", "    C",  "    D" }
		};
		
		for (String[] row : names) {
			for (String grades : row) {
				System.out.print(grades + " ");
			}
			System.out.println();
		}
	}

}
