package com.neotech.lesson07;

public class logicalNOT {
	
	public static void main(String[] args) {
		// !(NOT) - reversing the value of a boolean varible
		
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);
		
		// != not equal if (number != 5)
		
		// ! is put in front of a boolean
		
		boolean cold = !false;
		
		if (!cold) {
			System.out.println("Cold!");
		} else {
			System.out.println("Not cold!");
		}
		
	}

}
