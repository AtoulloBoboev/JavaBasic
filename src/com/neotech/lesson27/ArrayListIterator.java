package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("herskey");
		choco.add("godiva");
		choco.add("snickers");
		
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Ice cream");
		sweets.add("cheese cake");
		
		sweets.addAll(choco); //by default, puts all objects of choco AL, at the end of the sweets AL
		
		System.out.println("The size of the sweets arrayList is: " + sweets.size());
		System.out.println(sweets);
		
		
		System.out.println("----------------------------------");
		//how do we use an iterator:
		Iterator<String> it = sweets.iterator();
		
		while(it.hasNext())
		{
			String str = it.next();

			System.out.print(str + " - ");
			
			if(str.equals("ice cream"))
			{
				it.remove();
			}
		}
		
		System.out.println();
		System.out.println(sweets);
		
		
		System.out.println("--------for loop---------");
		//for loop
		//1 directions
		for (String str : sweets) {
			System.out.print(str + " - ");
		}
	}

}
