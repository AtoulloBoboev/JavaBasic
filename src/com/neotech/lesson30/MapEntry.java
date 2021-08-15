package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {
	
	public static void main(String[] args) {
		
		Map<String, Integer> months = new LinkedHashMap<>();
		months.put("January", 15);
		months.put("February", 12);
		months.put("March", 3);
		months.put("April", 3);
		
		System.out.println(months);
		
		//Entry
		Set<Entry<String,Integer>> entries = months.entrySet();
		System.out.println(entries);
		
		for (Entry e : entries)
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		 
		//looping using iterator
		Iterator<Entry<String, Integer>> it = entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
