package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city 
 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
 * - If any city name is more than 7 characters remove that city.
 */

public class Task {
	
	public static void main(String[] args) {
		
		String [] cities = {"Paris", "Ankara", "Moscow", "Dushanbe"};
		
		Map<String, Integer> map = new TreeMap<>();
		
		for(String str : cities) 
		{
			map.put(str, str.length());
		}
		
		System.out.println(map);
		
		//1st way
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String,Integer>> setIt = set.iterator();
		
		//2nd way
		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String,Integer> en = it.next();
			
			if(en.getValue() > 7) 
			{
				it.remove();
			}
		}
		
		System.out.println(map);

	}
}



//THIS WAY RIGHT TOO		
/*		
		Map<String,Integer> cities = new TreeMap<>();
		cities.put("Paris", 5);
		cities.put("Moscow", 6);
		cities.put("Washington DC", 13);
		cities.put("Dushanbe", 8);
		cities.put("Istanbul", 8);
		cities.put("Rome", 4);
		
		System.out.println(cities);
		
		Set<Entry<String, Integer>> entries = cities.entrySet();
		
		Iterator<Entry<String,Integer>> it = entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String,Integer> entry = it.next();
			
			if(entry.getValue() > 7) 
			{
				it.remove();
			}
		}
		
		System.out.println(entries);
		
	}

}
*/
