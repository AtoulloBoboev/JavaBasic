package com.neotech.lesson24;

public interface Drivable {
	
	//this is a PUBLIC STATIC FINAL boolean MOVE_FAST, this is added by java itself.
	boolean MOVE_FAST = true;
	
	
	
	//even though we are not saying abstract in front of it, Java adds it itself
	//because every method creates in an interface is abstract
	public void drive();

}


abstract class Vehicles
{
//here we can define implemented methods and undefined/abstract methods
	void start()
	{
		System.out.println("Vehicles can start!");
	}
	
	abstract void stop();
	
}


class Cars extends Vehicles implements Drivable
{

	@Override
	public void drive() {
		System.out.println("Cars drive");
		
	}

	@Override
	void stop() {
		System.out.println("Cars stop!");
		
	}
	//a class extends another class
	//a class implement an interface 
	//an interface extends an interface
}