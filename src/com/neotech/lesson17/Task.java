package com.neotech.lesson17;

public class Task {
	
	// Find out how many sentences are there in the string
	// "Yay! It is Saturday. Is it raining? Take your umbrella."
	
	public static void main(String[] args) {
		
		String sentencee = "Yay.It is Saturday.Is it Raining.Take your umbrella.";
		
		String[] sen = sentencee.split("\\.");
		
		//for-each way
		for (String s : sen) {
			System.out.println(s);
		}
		
		//for-loop way
//		for(int i = 0; i < sen.length; i ++) {
//			System.out.println(sen[i]);
//		}
		
		System.out.println("There are "+ sen.length + " sentences");
		
		System.out.println("=====================================");
		
		//if I want to print "Maryam"
		System.out.println("\"Maryam\"");
		//Inside the string, some character have a special meeting in Java,
		//When we want to use them, we may get an error
		System.out.println("\\Maryam\\");
		
		// ? , * have a special meaning in regular expression
		String s = "abc abbc afc afgc";
		String s2 = s.replaceAll("[a?c]", "+");
		System.out.println(s2);
		
		String str2 = "Yay? It is Saturday? Is it Raining? Take your umbrella?";
		String [] array = str2.split("\\?");
		System.out.println("Array length is " + array.length);
		
	
	}
	

}
