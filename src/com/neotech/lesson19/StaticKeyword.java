package com.neotech.lesson19;

public class StaticKeyword {
	
	//instance variable
	String color;
	int memory;
	
	//instance variables
	static String brand;
	static boolean touchscreen;
	
	//not static -- instance method
	//instance methods can access and use all the variables inside the class.
	void displaySpecificInfo()
	{
		System.out.println("We build a " + brand + " and touchscreen is " + touchscreen);
	//	System.out.println("We build a " + brand + " with " + memory + "Gb with " + color + " color!");
	}
	
	static void displaySpecificInfo_2() 
	{
		System.out.println("Brand is " + brand + " and touchsreen is " + touchscreen);
	//	System.out.println("We build a " + brand + " with " + memory + "Gb with " + color + " color!");
	}
	
	public static void main(String[] args) {
		
		//when we access static variables, we do not need an object
		StaticKeyword.brand = "iPhone";
		StaticKeyword.touchscreen = true;
		
		StaticKeyword obj1 = new StaticKeyword();
		obj1.color = "black";
		obj1.memory = 64;
		
		obj1.displaySpecificInfo();
		
		//the static keyword has to be access as static 
		StaticKeyword.touchscreen = false; //correct way to access a static variable
		//obj1.touchscreen = false;		   //wrong way to access a static variable	
		
		obj1.displaySpecificInfo_2(); //not the right way to access it
		StaticKeyword.displaySpecificInfo_2();
		
		//because we are in the same class, we can all these STATIC varibale/method without the class name
		touchscreen = true;
		
	}

}
