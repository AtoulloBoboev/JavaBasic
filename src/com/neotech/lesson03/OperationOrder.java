package com.neotech.lesson03;

public class OperationOrder {

	public static void main(String[] args) {
		int width, height;
		width = 5;
		height = 8;
		
		int per = 0;
		int area = 0;
		
		per = 2 * (width + height);
		area = width * height;
		
		System.out.println("The perimetr of a rectangle with width " + 
		width + " and height " + height + " is equal to " + per + " and the area is " + area);
	}
}
