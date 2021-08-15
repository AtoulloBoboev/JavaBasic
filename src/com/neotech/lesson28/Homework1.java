package com.neotech.lesson28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Create a Set collection in which you need to add names of the countries. 
 * In this set we want all objects to be sorted in alphabetical order. 
 * Using 2 different ways retrieve all elements from set.
 */

public class Homework1 {
	
	public static void main(String[] args) {
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Turkiye");
		countries.add("Albania");
		countries.add("Italy");
		countries.add("Japan");
		countries.add("Iran");
		
		System.out.println(countries);
		
		//Using indexed For Loop
		for (int i = 0; i < countries.size(); i++) {
			
			//countries.get(i); //in a set, we don't have indices
						
		}
		
		
		
		//Using enhanced For loop
		for (String country: countries) {
		
			System.out.println(country);
		}
		
		System.out.println("--------------------------------------------");
		
		//Using iterator 
		Iterator<String> it = countries.iterator();
		
		while(it.hasNext()) {
			String country = it.next();
			System.out.println(country);
		}
		
		
		
	}

}
