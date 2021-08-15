package com.neotech.lesson21;

public class MathTeacher extends Teacher {
	
	String field;
	
	public MathTeacher() {
		System.out.println("Default constructor for MathTeacher class");
		
	}
	
	MathTeacher(String firstName, String lastName, String field) {
		super(firstName, firstName); //has to be the first line
		
		this.field = field;
		
	}
	
	void teachingMath() {
		System.out.println("Teaching Math...");
	}

}
