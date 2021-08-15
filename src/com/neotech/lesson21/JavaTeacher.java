package com.neotech.lesson21;

public class JavaTeacher extends Teacher {
	boolean certified;
	
	JavaTeacher (String firstName, String lastName, boolean certified) {
		super (firstName, lastName);
		this.certified = certified;
		
	}
	
	void teachingJava() {
		System.out.println("Teaching Java...");
	}
}
