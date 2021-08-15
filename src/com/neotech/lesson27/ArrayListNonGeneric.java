package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListNonGeneric {
	
	public static void main(String[] args) {
		
		//generic arraylist
		
		ArrayList<Double> al = new ArrayList<>(); //Double is a wrapper class for double
		al.add(10.99);
		al.add(21.2);
		al.add(15.5);
		
//		al.add(50); //java shows a CE, because you said everything in this collection will be a Double
//		al.add("Hello");
		System.out.print(al);
						
		//change element at index 1, from 21.2 to 12.5
		al.set(1, 12.5); //if index (in this case 1), is larfer than the size of the arrayList, an exepction is
		
		System.out.println("----------------------------");
		
		//remove an item from al
		al.remove(2);
		
		System.out.println(al);
		
		System.out.println("----------------------------");
		
		//get am element at index 0
		System.out.println("Element at index 0 is: " + al.get(0));
		
		System.out.println("----------------------------");
		
		//how do we access all elements in generic arrayList
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i) + "-");
		}
		
		System.out.println("----------------------------");
		
		
		//Non generic arrayList
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add("Hello");
		al2.add(22.5);
		al2.add(al);
		
		System.out.println(al2);
		
		for(Object obj : al2)
		{
			System.out.print(obj + " - ");
		}
		
		
	}

}
