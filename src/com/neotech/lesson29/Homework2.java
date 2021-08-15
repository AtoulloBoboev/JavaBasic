package com.neotech.lesson29;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *Create a map of countries with its capital that will store countries in alphabetical order.
  Add them randomly in the map.
  Example:
    "France" -> "Paris"
    "Kosovo" -> "Prishtina"
    "Turkey" -> "Ankara"
    "USA" -> "Washington DC"
    "Albania" -> "Tirana"
    "Italy" -> "Rome"

    - Print the list and check the order of the countries.
    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
    - Verify if a specific capital city is in the list ( use containsValue() method )
    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
    - Get all the values (capital names) in a Collection. Print all capital names using iterator. 
 */

public class Homework2 {
	
	public static void main(String[] args) {
		
		Map<String, String> countries = new TreeMap<>();
		
		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkey", "Ankara");
		countries.put("USA", "Washington");
		countries.put("Albania", "Tirana");
		countries.put("italy", "Rome");
		
		//- Print the list and check the order of the countries.
		System.out.println(countries);
		
		//- Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
		System.out.println("Does the map contain Albania --> " + countries.containsKey("Albania"));
		
		//- Verify if a specific capital city is in the list ( use containsValue() method )
		System.out.println("Does the map contain Ankara --> " + countries.containsValue("Ankara"));
		
	    //- Get all the keys (countries names) in a Set. Print all country names using for each loop.
		Set<String> cNames = countries.keySet();
		
		//1st way
		for(String name : cNames)
		{ 
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		//2nd way
		for (String name : countries.keySet())
		{
			System.out.print(name + " ");
		}
		
		
	    //- Get all the values (capital names) in a Collection. Print all capital names using iterator. 
		//1st way
		Collection<String> values = countries.values();
		
		Iterator<String> it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		//2nd way
		Iterator<String> it2 = countries.values().iterator();
		
		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		
	}

}
