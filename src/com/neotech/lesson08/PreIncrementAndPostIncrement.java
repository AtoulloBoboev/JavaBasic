package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {
	
	public static void main(String[] args) {
		
		
		/*
		 * 			++ and --
		 * 			
		 */
		
		//declare x
		int x;
		
		//declare and initialize y
		int y = 10;
		
		//post increment - firstly use the variable, then increase it
		x = y++;  //x is equal to y, then increment y by 1
		
		System.out.println(x);
		System.out.println(y);
		
		//PRE increment -- firstly increase the variable vale, then use it in the 
		int a;
		int b = 15;
		
		a = ++b; // b is increased to 16 and then assigned to a
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
