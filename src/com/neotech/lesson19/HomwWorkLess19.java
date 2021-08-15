package com.neotech.lesson19;

import java.util.Scanner;

public class HomwWorkLess19 {
	
	/*
	 * Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
	 * Method should be available inside the class where it was declared and executed by calling it is name.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the String: ");
		String str = scan.next();
		
		System.out.print("Number of vowels: " + vowels(str));
		
	}
	
	private static int vowels(String str)
	{
		int name = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
					str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				name ++;
			}
		}
		return name;
	}

}
