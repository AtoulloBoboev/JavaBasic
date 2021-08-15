package com.neotech.lesson12;

public class RetrieveElements {
	
	public static void main(String[] args) {
		
		char[] grades = {'A', 'B', 'F', 'D', 'C' };
		
		//1st way, using for loop
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		
		System.out.println();
		
		//2nd way, enhanced for loop / advanced foe loop / for-each loop
		for(char element : grades) {
			System.out.print(element + ", ");
		}
		
		System.out.println();
		System.out.println("-----------------------");
		String[] fruits = {"Apple", "Orange", "Plum", "Kiwi", "Passion fruit", "Cherry"};
		
		
	}

}
