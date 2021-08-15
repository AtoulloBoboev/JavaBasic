package com.neotech.lesson20;

public class Student {
	
	/*
	 *  Write program as a Student class that has instance variables name and address. 
	 *  Create a constructor that will initialize those variables. 
	 *  Print name & address of given student using displayInfo method.
	 */
	
	
	//instance variable
	String name, address;
	
	
	//default constructor
	public Student(String a, String b) {
		name = a;
		address = b;
	}
	
	void displayInfo() {
		System.out.println("Student " + name + " lives in " + address + " address");
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Samanta", "525 2th avenue");
		s1.displayInfo();
	}
	
	
}
