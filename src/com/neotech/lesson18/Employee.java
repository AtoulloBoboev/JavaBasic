package com.neotech.lesson18;

public class Employee {
	
	int eID, salary;
	static String CEO = "Elion";
	
	void info()
	{
		System.out.println("eID: " + eID + " salary: " + salary + " CEO " + CEO);
	}
	
	public static void main(String[] args) {
		
		Employee emply1 = new Employee();
		emply1.eID = 25;
		emply1.salary = 70000;
		
		
		Employee emply2 = new Employee();
		emply2.eID = 13;
		emply2.salary = 90000;
		
		emply1.info();
		emply2.info();
	}

}
