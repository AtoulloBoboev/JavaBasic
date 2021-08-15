package com.neotech.lesson19;

public class HomeWork {
	
	/*
	 * Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
	 * Method should be available inside the class where it was declared and executed by calling it is name.
	 */
	
	public static void main(String[] args) {
		
		String str1 = "I am very happy";
		
		String str2 = getVowels(str1); //I don't need to use HomeWork.getVowels(str1)
		System.out.println(str2);
	}
	
	private static String getVowels(String str) {
		
		//We want to keep only vowels in the string
		String result = str.replaceAll("[^AEOIUaeoiu]", "");
		return result;
		
		//we are returning in one stop
//		return str.replaceAll("[^AEOIUaeoiu]", "");
	}

}
