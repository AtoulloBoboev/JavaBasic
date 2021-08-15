package com.neotech.lesson16;

public class StringMethodContinue {
	
	public static void main(String[] args) {
		
		//contains ()
		String sentence = "Today is 4th of July";
		boolean contains = sentence.contains("today");
		System.out.println(sentence + " contains " + "Today -> " + contains);
		
		//startWith()
		boolean starts = sentence.startsWith("Today"); //с чем начинается boolean 
		System.out.println("starts -> " + starts);
		
		//endWith()
		boolean ends = sentence.endsWith("of July");
		System.out.println("ends -> " + ends);
		
		//equals()
		String str1 = "Saturday";
		String str2 = "saturday";
		
		boolean equals = str1.equals(str2);
		System.out.println("equals -> " + equals);
		
		boolean eq2 = str1.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCase -> " + eq2);
	}

}
