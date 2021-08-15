package com.neotech.lesson30;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Create the collection that will store single unique objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
 */

public class Homework2 {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Hi ");
		set.add("students ");
		set.add("how ");
		set.add("are ");
		set.add("you ");
		set.add("doing? ");
		
		String fullSent = "";
		
		for(String word : set) {
			fullSent+=word;			
		}
		
		System.out.println(fullSent);
		
	}

}
