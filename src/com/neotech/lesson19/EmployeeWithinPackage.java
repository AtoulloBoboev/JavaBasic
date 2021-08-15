package com.neotech.lesson19;

public class EmployeeWithinPackage {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.company = "Neotech";
		emp.empName = "Atoullo";
		emp.empLastName = "Boboev";
		emp.salary = 90;
	//  emp.ssn = 123456; 
		
		emp.method1();
		emp.method2();
		emp.method3();
	//	emp.method4();
		
		
	}

}
