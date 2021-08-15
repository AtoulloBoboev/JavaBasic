package com.neotech.lesson28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Create a Set collection that will hold Objects of Student Type. 
 * In this set we do not care about the insertion order. 
 * Each student object should have name and studentID. 
 * Display name of each student.
 */

public class Student {
	
	private String name;
	private int studentID;
	
	Student(String name, int studentID)
	{
		this.name = name;
		this.studentID = studentID;
	}
	
	public void printName()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("Jacob", 1));
		students.add(new Student("Nicole", 2));
		students.add(new Student("Samanta", 3));
		students.add(new Student("Taylor", 4));
		
		System.out.println("Size of the set before removal: " + students.size());
		
		Iterator<Student> studentIt = students.iterator();
		
		while(studentIt.hasNext()) {
			
			//one-liner
			//studentIt.next().printName();
			
			//2nd way
			Student s = studentIt.next();
			s.printName();
			
			if(s.name.equalsIgnoreCase("Nicole")) {
				studentIt.remove();
				
			}
			
		}
			System.out.println("Size of the set after removal: " + students.size());
		
		
		
	}

}
