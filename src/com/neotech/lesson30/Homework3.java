package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 *  Create a collection of integers in which you can keep duplicates. 
    Write a logic to find sum of all integers
 */

public class Homework3 {
	
	public static void main(String[] args) {
		
		
		List<Double> numbers = new LinkedList<>();
		numbers.add(3.5);
		numbers.add(20.0);
		numbers.add(25.5);
		numbers.add(6.2);
		
		double sum = 0;
		
		for (Double num : numbers) {
			sum += num;
		}
		
		System.out.println("The sum of all elements in the List is: " + sum);
		
		System.out.println("2nd way, Let us use iterator");
		
		double total = 0;
		
		Iterator<Double> itr = numbers.iterator();
		while(itr.hasNext()) {
//			Double num = itr.next();
			total += itr.next();
		}
		
		System.out.println("The total of all elements in the List is: " + total);
		
	}

}
