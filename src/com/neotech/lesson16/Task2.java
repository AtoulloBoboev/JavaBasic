package com.neotech.lesson16;

public class Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a String and if the String is not empty perform the following:
		 * if the String has an odd number of characters and has 3 or more characters, 
		 * print the character in the middle of the String.
		 * 
		 */
		 
		String str = "saturrr";
		
		if (!str.isEmpty()) {
			
			int length = str.length();
			
			if (length%2 == 1 && length >= 3) {
				char middle = str.charAt(length / 2);  // 7/2=3; we get the letter with index 3
				System.out.println(middle);
			} else {
				System.out.println("The condition is not true");
			}
			
		} else {
			System.out.println("The string is empty!");
		}

	}

}
