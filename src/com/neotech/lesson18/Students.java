package com.neotech.lesson18;

public class Students {
	
	// Create a Class called Students 
	// ▪ Create three variables studentName, studentID and numberOfStudents
	// ▪ Create three objects of the Students Class
	// ▪ Set the value for studentName , studentID and increment the numberOfStudents for each object
	// ▪ Print out total number of students

	String studentName;
	int studentID;
	static int numberOfStudents;
	
	 static void totalNum() {
		System.out.println("Total number of students: " + numberOfStudents);
	}
	 
	 void nameOfStudents() {
		 System.out.println("Name: " + studentName);
	 }

	 public static void main(String[] args) {
									
			Students mathClass = new Students();
			mathClass.studentName = "Atoullo";
			mathClass.studentID = 23;
			numberOfStudents++;		
			
			Students compClass = new Students();
			compClass.studentName = "Mehmet";
			compClass.studentID = 32;
			numberOfStudents++;
			
			Students historyClass = new Students();
			historyClass.studentName = "Lola";
			historyClass.studentID = 12;	
			numberOfStudents++;
			
			Students.totalNum();
	 }
}