package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Create a Set of cities in which you want to make sure that insertion order is maintained. 
 * Using Iterator remove any city that starts with “A”;
 */

public class Homework2 {
	
	public static void main(String[] args) {
		
	Set<String> cities = new LinkedHashSet<>(); 
	
	cities.add("Garfield");
	cities.add("Clifton");
	cities.add("Albany");
	cities.add("Paramus");
	cities.add("Ankara");
	cities.add("Annapolis");
	
	System.out.println("Set before removal: " + cities);
	
	//declare iterator
	Iterator<String> cityIt = cities.iterator();
	
	//iterate elements
	while(cityIt.hasNext())	
	{
		//remove city that starts with A or a
					
		//cityIt.next().toUpperCase().startsWith("A") 
		//1. get the item from the set using it.next()
		//2. convert the returned item to upper case
		//3. check if it starts with 'A'
				
		if(cityIt.next().toUpperCase().startsWith("A"))
		{
			cityIt.remove();
		}
		
	 }
	
	System.out.println("Set after removal: " + cities);
		
	}
}
