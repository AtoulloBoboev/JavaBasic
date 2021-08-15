package com.neotech.lesson30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Map<Integer, Person> people = new TreeMap<>();
		//this map, has a mipping of an integer with a person object
		
		people.put(1, new Person("Atoullo", "Boboev", 25, 120000));
		people.put(2, new Person("Shodmon", "Baba", 22, 125000));
		people.put(3, new Person("Komron", "Baba", 24, 130000));
		
//		System.out.println(people);
		
		for (Entry<Integer, Person> entry : people.entrySet())
		{
//			System.out.println(entry.getKey() + " " + entry.getValue().name + " " + entry.getValue().lastName);
//			entry.getValue().printDetails();
			
			Person p = entry.getValue();
			System.out.println(entry.getKey() + " " + p.name + " " + p.lastName);
			p.printDetails();
			
		}
		
				
	}
 
}
