package com.neotech.lesson23;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
	
	
	private void hello()
	{
		System.out.println("Hello from the Parent Class");
	}
	
	static void bye()
	{
		System.out.println("Bye from the parent Class");
	}

}

class Child extends Parent
{
	Child()
	{
		System.out.println("Child Class Constructor");
	}
	
	private void hello()
	{
		System.out.println("Hello from the Child Class");
	}
	
	static void bye()
	{
		System.out.println("Good bye from the Child Class");
	}
}
