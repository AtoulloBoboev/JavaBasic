package com.neotech.lesson13;

public class Task4 {
	public static void main(String[] args) {
		
		String [][] cars = {
				{"Lincoln", "Ford", "Tesla"},
				{"Volkswagen", "Audi", "Porsche"},
				{"Honda", "Toyota", "Nissan"}
		};
		
		for (int row = 0; row < cars.length; row++)
		{
			for (int col = 0; col < cars[row].length; col++)
			{
				System.out.println(cars[row][col] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
				
	}

}
 