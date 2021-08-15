package com.neotech.lesson14;

public class School {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "Atoullo";
		s1.surname = "Boboev";
		s1.school = "Neotech Academy";
		s1.studentId = 1;
		s1.age = 24;
		
		s1.study();
		s1.doHomework();
		
		Student s2 = new Student();
		s2.name = "Hakan";
		s2.surname = "K";
		s2.school = "Neotech Academy";
		
		s2.studentInfo();
		
		System.out.println(s2.name + " " + s2.surname + " " + s2.school );
		
		
		
		
	}

}
