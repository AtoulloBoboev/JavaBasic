package com.neotech.lesson29;

/*
 * Create a map of a building. 
 * Store floor number and it is associated company name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). 
 * Insert 7 entries with duplicate keys and values.
 * - Check how many entries you have?
 * 
 */

import java.util.HashMap;

public class Task {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Neotech");
		building.put(4, "Facebook");
		building.put(5, "Twitter");
		building.put(6, "Microsoft");
		building.put(7, "LG");
		
		System.out.println(building);
		
		System.out.println("How many entries do we have? " + building.size());
		
		//update the 4th floor
		System.out.println(building);
		building.replace(4, "Lenovo");
		
		
		building.remove(7, "LG");
		System.out.println(building);
		
		System.out.println(building);
		
		
		
	}

}
