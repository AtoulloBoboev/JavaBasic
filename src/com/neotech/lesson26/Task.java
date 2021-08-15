package com.neotech.lesson26;

import java.util.ArrayList;

public class Task {
	
	/*
	 *  Create a generic ArrayList that will store 5 names into it.
		▪ Find out whether the given ArrayList is empty or not?
		▪ Check whether the specific name is present in an ArrayList or not?
		▪ Find the size of your arrayList and print all values from that
		
	 */
	
	public static void main(String[] args) {
		
		//ArrayList of String objects
		ArrayList<String> names = new ArrayList<>();
						
		names.add("Luis");
		names.add("Elion");
		names.add("Nicole");
		names.add("Jacob");
		names.add("David");
		
		//Find out whether the given ArrayList is empty or not?		
		System.out.println("Is the list empty: " + names.isEmpty());
		
		//Check whether the specific name is present in an ArrayList or not?
		System.out.println("Doest it contain the name Jacob? " + names.contains("Jacob"));
		
		//Find the size of your arrayList and print all values from that
		System.out.println("The size of the ArrayList is: " + names.size());
		
		System.out.println(names);
	}

}
