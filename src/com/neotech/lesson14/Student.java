package com.neotech.lesson14;

public class Student {

	String name, surname, school;
	int studentId, age;
	
	
	void study()
	{
		System.out.println(name + " " + surname + " is studying.");
	}
	
	void doHomework()
	{
		System.out.println(name + " is doing the homework.");
	}
	
	void studentInfo()
	{
		System.out.println(name + " " + surname + " " + school + " " + studentId);				
	}
}
