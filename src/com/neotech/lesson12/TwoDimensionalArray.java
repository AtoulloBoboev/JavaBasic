package com.neotech.lesson12;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][] numbers = new int [3][4] ; //[rows][colums]
		
		//1st row, row with index 0
				numbers[0][0] = 10;
				numbers[0][1] = 15;
				numbers[0][2] = 20;
				numbers[0][3] = 25;
		
		//1st row, row with index 0
				numbers[1][0] = 32;
				numbers[1][1] = 36;
				numbers[1][2] = 40;
				numbers[1][3] = 44;
				
		//1st row, row with index 0
				numbers[2][0] = 63;
				numbers[2][1] = 66;
				numbers[2][2] = 69;
				numbers[2][3] = 72;
				
		System.out.println("Let's print 40");
		System.out.println(numbers[1][2]);
		
		
		//2-D arrays initialization
		//if we have the values at the beginning
		int [][] nums = {
				{ 10, 15, 20, 25 },
				{ 32, 36, 40, 44 },
				{ 63, 66, 69, 72 }
		};
		System.out.println("Let's print 63");
		System.out.println(nums[2][0]);
	}

}
