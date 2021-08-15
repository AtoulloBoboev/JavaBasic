package com.neotech.lesson17;

public class StringSplit {
	
	public static void main(String[] args) {
		String sentence = "Today is Thursday and I have Java class";
		String [] result = sentence.split(" ");
		for (String word : result) {
			System.out.println( word + "|");
		}
		System.out.println();
		
		// How many words are there in a sentence
		System.out.println("The sentence has " + result.length + " words");
		for(int num1 = result.length-1; num1>-1; num1--) {
			System.out.print(result[num1] + "|");
			
		}
		
	}

}
