package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrayWithForEachLoops {
	
	public static void main(String[] args) {
		
		int[][] points = {
				{2, 4, 6},
				{10, 12, 14},
				{50, 60, 70}
		};
		
		int sum = 0;
		
		for (int row = 0; row < points.length; row ++ ) {
			
			for (int col = 0; col < points[row].length; col++) {
				sum = sum + points[row][col];
			}
		}
		
		System.out.println("The total sum of all elements in 2D array is: " + sum);
	}

}
