package com.neotech.lesson16;

public class StringRegularExpression {
	
	public static void main(String[] args) {
		
		String greeting = "Good morning";
		
		//replace()
		String newGreet = greeting.replace('o', 'u');
		System.out.println(newGreet);
		
		String otherGreet = greeting.replace("morning", "afternoon"); //replace morning to afternoon
		System.out.println(otherGreet);
		
		String lastGreet = greeting.replace("evening", "afternoon"); 
		System.out.println(lastGreet);
		
		//replaceAll()
		String combinition = "My phone # is 328-125-4568";
		System.out.println(combinition);
		
		String newcombinition = combinition.replaceAll("[0-9]", "*");
		System.out.println(newcombinition);
		
		String hakanIsTheBest = combinition.replaceAll("[a-z]", "+");
		System.out.println(hakanIsTheBest);
		
		String evisIsTheBest = combinition.replaceAll("[A-Z]", "+");
		System.out.println(evisIsTheBest);
		
		String komronIsTheBest = combinition.replaceAll("[^0-9]", "+");
		System.out.println(komronIsTheBest);
		
		
	}

}
