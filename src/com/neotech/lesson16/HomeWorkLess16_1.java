package com.neotech.lesson16;

import java.util.Scanner;

public class HomeWorkLess16_1 {
	
	public static void main(String[] args) {
		
		/*
		 * Task 1:
		 * Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */
		
		String sentence = "I like to play soccer!";
		
		String str = sentence.replace(" ", "");
		
		System.out.println(sentence);
		System.out.println("length is " + sentence.length());
		
		System.out.println();
			
		System.out.println(str);
		System.out.println("length is " + str.length());
	}

}
