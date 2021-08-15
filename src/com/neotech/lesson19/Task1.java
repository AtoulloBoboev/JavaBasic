package com.neotech.lesson19;

public class Task1 {
	
		
/*
 * Create a method that will accept an array as
 * parameters and will return a sum of all elements from
 * that array. Method should be visibly only within same
 * package and accessible by the creating an instance
 * of the class.
 */
	
	//accepts int array as parameter, returns an integer
	
	int sum(int[] array) //we can use default access modifier 
	{
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			
			sum += array[i];			
		
		}
				
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8};
		
		Task1 obj = new Task1();
		
		System.out.println("The sum of  the array is: " + obj.sum(arr));
	}
	
	
}
