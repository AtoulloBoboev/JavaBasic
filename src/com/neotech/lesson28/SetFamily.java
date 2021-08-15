package com.neotech.lesson28;

import java.util.*;

public class SetFamily {
	
	public static void main(String[] args) {
		
		Set<String> veggies = new HashSet<>();
		veggies.add("potato");
		veggies.add("avocado");
		veggies.add("tomato");
		veggies.add("eggplant");
		veggies.add("potato");
		
		System.out.println(veggies);
		
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Potato");
		fruits.add("Apple");
		fruits.add("Banana");
		
		//This is a TreeSet, no duplicates, alphabetical order
		Set<String> food = new TreeSet<>(veggies);
		System.out.println(food);
	}

}
