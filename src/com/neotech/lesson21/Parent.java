package com.neotech.lesson21;

public class Parent {
	
	String name = "Parent";
	String lastName = "Parent LastName";
	
	
	void hello()
	{
		System.out.println("I am the parent class");
	}
	
	

}

class Child extends Parent
{
	String name = "Child";
	
	void display()
	{
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(super.lastName);
		System.out.println(lastName);
	}
	
	void sayHello() 
	{
		display();
		hello();
		super.hello();
	}
}
