package com.neotech.lesson21;

//Write a Java program called Teacher. Identify features and 
//behaviour of that Class. Create 3 subclasses MathTeacher, 
//ChemistryTeacher and PianoTeacher that would have it their 
//own features and behaviour. Test all 4 classes.

public class Teacher {
		
	String firstName, lastName;
	
	Teacher() {
		System.out.println("Default constructor for Teacher class");
	}
	
	Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void teaching() {
		System.out.println("Teaching....");
	}

}
