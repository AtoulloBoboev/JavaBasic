package com.neotech.lesson26;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		//INTRO:
		// -wrapper class: converting primitive data types to objects
		
		
		/*
		 * class Integer {
		 * 		int value;
		 * 
		 * 		getter();
		 * 		setter();
		 * }
		 */
		
		int a = 10;
		
		Integer c = new Integer(10); //boxing -- converting a primitive type int into a Integer
		Integer b = 10; //autoboxing
		
		//Long way
//		String str = new String("Saturday");
		//short way
//		String str2 = "Saturday";
		
		//unboxing -- converting the value of an Integer object to an int primitive type
		int d = b.intValue();
		//automatic unboxing
		int e = b;
		
		//c, b are objects of type Integer
		//a, d, e are primitive int data types
		
		System.out.println("Other wrapper classes: ");
		
		
		//boolean
		Boolean bool = true; //auto - boxing
		System.out.println(bool);
		
		Byte b1 = 25; //Byte object
		
		byte b2 = b1; //unboxing Byte object into a byte primitive data type
		System.out.println(b2);
		
		
		Double d1 = 2.45; //auto boxing
		
		Character c1 = new Character('T'); //boxing
		Character c2 = 'T'; //autoboxing - short way
		
		
		//==================================================================================================================
		
		int num = 15;
		
		
	}

}
