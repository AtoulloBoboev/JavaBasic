package com.neotech.lesson17;

public class HomeWorkLess17 {
	
	public static void main(String[] args) {
		
		System.out.println("Task 1:");
		
		/*
		 * Task 1:
		 * Create a String and print it in reverse order (Sunday -> yadnuS).
		 * Solve it using charAt(), toCharArray()  and reverse() methods.
    	   Note:
           for charAt() and toCharArray() use String
           for reverse you have to declare a StringBuffer object
		 */
		
		StringBuffer str1 = new StringBuffer("Sunday");
		System.out.println(str1.reverse());
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
//======================================================================================================================
					
		/*
		 * Task 2:
		 * Write a program to print out the following conversion:
    	   Today is Tuesday and we have a Java Class!!!  to 
           yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		 */
		
		System.out.println("Task 2:");
		
								
		
			/*
			 * Write a program to print out the following conversion:
			 * Today is Tuesday and we have a Java Class!!!
			 * to
			 * yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
			 *
			 *
			 */
			
			String str = "Today is Saturday and we have a Java Class!!!";
			HomeWorkLess17 h2 = new HomeWorkLess17();
			
			// Steps:
			
			// 1. make it possible to access each word by an index
			// 2. reverse each word and print
			
			String[] strArray = str.split(" ");
			
			
			
			
			for (String el : strArray)
			{
				//1st way:
				for(int i = el.length()-1; i >=0;i--)
				{
					System.out.print(el.charAt(i));
				}
				System.out.print(" ");
				
				
				//reverse the string
				//can we create a method that reverses it for us???
				String reversedStr = h2.reverseString(el);
				
				//print the string
				System.out.print(reversedStr + " ");
			}
			
//			// convert this string the same way too
//			
//			String str2 = "Today is Saturday and its cool";
//			//here we can use the method again
//			//       ...
//			//       ...
//			
//			
//		}
//		
//	//return type; name of the method;  parameters (String)
//		String reverseString(String str)
//		{
//			String resultStr = "";
//			
//			char[] charArray = str.toCharArray();
//			
//			for(int i = charArray.length-1; i>=0; i--)
//			{
//				resultStr +=charArray[i];
//			}
//			
//			//returning the result
//			return resultStr;
	}

}
