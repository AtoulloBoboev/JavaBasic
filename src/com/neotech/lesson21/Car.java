package com.neotech.lesson21;

public class Car {
	
	String make, model;
	
	Car()
	{
		System.out.println("I am a parent default constructor!");
	}
	
	
	Car (String make)
	{
		this.make = make;
	}
	
	
	Car (String make, String model)
	{
		this.make = make;
		this.model = model;
	}

}


class Mercedes extends Car
{
	String sportsModel;
	
	Mercedes()
	{
		
		this("Default make", "Default model", "Default Sports");
		System.out.println("I am a child default constructor!!!");
	}
	
	Mercedes(String make, String model, String sportsModel)
	{
		//call the super constructor to initialize 
		//in the parent class
		super(make, model);
		
		//use this keyword to initialize instance 
		//child class
		this.sportsModel = sportsModel;
	}
	
	void display()
	{
		System.out.println(make + " " + model + " " + sportsModel);
	}
		
	}
	
	
