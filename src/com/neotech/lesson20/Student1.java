package com.neotech.lesson20;

public class Student1 {
	
	// Write a java program of Class Student that takes students name and 3 subject
	// grades. Inside your class also have a method to Calculate Average Grade. Test
	// Student class for 5 different students with different marks. Your program
	// should print an average mark of each students name.
	
	String studentName;
	int grade1, grade2, grade3;
			
		Student1(String stName, int gr1, int gr2, int gr3) {
		studentName = stName;
		grade1 = gr1;
		grade2 = gr2;
		grade3 = gr3;
		
	}
	
	int gradeAverage() {
		return (grade1 + grade2 + grade3) / 3;
		
	}
	
	
	public static void main(String[] args) {
		
		//Creating objects using the constructor with parameters
		Student1 st1 = new Student1("Humaira", 80, 90, 85);
		Student1 st2 = new Student1("Komron", 100, 95, 76);
		Student1 st3 = new Student1("Mufasa", 67, 80, 100);
		Student1 st4 = new Student1("Murat", 80, 90, 82);
		Student1 st5 = new Student1("Shodmon", 100, 90, 76);
		
		//for each object I am printing the name and the average
		System.out.println("Student " + st1.studentName + " has an average of " + st1.gradeAverage());
		System.out.println("Student " + st2.studentName + " has an average of " + st2.gradeAverage());
		System.out.println("Student " + st3.studentName + " has an average of " + st3.gradeAverage());
		System.out.println("Student " + st4.studentName + " has an average of " + st4.gradeAverage());
		System.out.println("Student " + st5.studentName + " has an average of " + st5.gradeAverage());
		
	}

}
