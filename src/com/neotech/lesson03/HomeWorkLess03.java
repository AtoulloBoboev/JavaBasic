package com.neotech.lesson03;

public class HomeWorkLess03 {
	/*
	 * Write a Java program that will print a sum of two numbers 
	 * Please use variables to store num1,num2,and sum 
	 * Sample output: 46 + 90 = 136
	 */
	public static void main(String[] args) {
		int a = 46;
		int b = 90;
		int sum = 0;
		sum = a + b;
		System.out.println("Sum of 46 + 90 = " + sum);
		
		System.out.println("----------------------------------------");
		
		/*
		 * Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32;
		 */
		int celcius;
		double fahr;
		celcius = 45;
		fahr = (9 * celcius / 5) + 32;
		System.out.println("45 Celcius equal to " + fahr );
		
		System.out.println("----------------------------------------");
		
		/*
		 * Write a Java program that converts mile to km 1 mile = 1.609344 km.
		 */
		 double km;
		 double mile;
		 mile = 40000;
		 km = 1.609344;
		 double convert;
		 convert = km * mile;
		 System.out.println("40000 mile equal to " + convert + " km.");
		
		 System.out.println("----------------------------------------");
		 
		 /*
		  * Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas:
		  * perimeter = 2 * radius * pi
		  * area = (radius * radius) * pi 
		  */
		 
		 double radius = 5.5;
		 double pi = 3.14;
		 double per;
		 double area;
		 area = (radius * radius) * pi;
		 per = 2 * radius * pi;
		 System.out.println("Perimeter of a circle is " + per + "\nArea of a circle is " + area);
		 
		 System.out.println("----------------------------------------");
		 
		 /*
		  * Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
		  * area = width * height
		  */
		 
		 double height = 7.9;
		 double width = 4.5;
		 double areaRec;
		 areaRec = width * height;
		 System.out.println("The area of a rectangle: " + area);
		 
		 System.out.println("------------------------------------------");
		 
		 /*
		  * Write a Java program that calculates the average of 3 numbers
		  */
		 
		 int a1, b1, c1;
		 a1 = 14;
		 b1 = 242;
		 c1 = 68;
		 double d1 = a1 + b1 + c1;
		 double ave = d1 / 3;
		 System.out.println("The average of numbers " + a1 + ", " + b1 + ", " + c1 + " = " + ave);
		 
		 System.out.println("------------------------------------------");
		 
		 /*
		  * Write a program to print the area and perimeter of a rectangle with width=5 and height=8.
		  * Your program should say "The perimeter of a rectangle with width___ and height___ is equal to___ and the area is____"
		  */
		 
		 int width11, height11;
			width11 = 5;
			height11 = 8;
			
			int per11 = 0;
			int area11 = 0;
			
			per11 = 2 * (width11 + height11);
			area11 = width11 * height11;
			
			System.out.println("The perimetr of a rectangle with width " + 
			width11 + " and height " + height11 + " is equal to " + per11 + " and the area is " + area11);
		 
			System.out.println("--------------------------------------------");
	}


}
