package com.neotech.lesson30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {
	
	/*
	 *    Create a Map that will store Employee name and salary. 
	 *    Write a logic to retrieve an employee who gets the highest salary. 
	 *    Output should be in the below format - John Smith=$100000
	 */
	
	public static void main(String[] args) {
		
		Map<String, Integer> emp = new HashMap<>();
		
		emp.put("Komron", 95000);
		emp.put("Mufasa", 85000);
		emp.put("Evis", 100000);
		emp.put("Hakan", 92000);
		
		
		Collection <Integer> values = emp.values();
		
		int highest = 0;
		
		for (Integer salary : values) {
			if (salary > highest) {
				highest = salary;
			}
		}
		
		System.out.println("The highest salary is " + highest);
		
		//You have to find the pair/entry that has the highest 
		Set<Entry<String, Integer>> entries = emp.entrySet();
		
		Iterator<Entry<String, Integer>> itr = entries.iterator();
		
		Entry<String, Integer> maxEntry = itr.next();
		
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			
			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}

		}

		System.out.println("The highest entry is: " + maxEntry);
		}
		
		
	}


