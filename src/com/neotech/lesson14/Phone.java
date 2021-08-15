package com.neotech.lesson14;

public class Phone {
	
	/*
	 *  Create a Class “Phone”. Create 3 Objects of it: 
	 *  iPhone, Android, Nokia with specific  attributes and behaviors.
	 */
	
	String model, price, weight, battery, storage;
	int year;
	
	
	void mod ()
	{
		System.out.println(model + " better then pervious model");
	}
	
	void weigh ()
	{
		System.out.println("This phone is more convenient beacause it weighs " + weight);
	}
	
	
}
