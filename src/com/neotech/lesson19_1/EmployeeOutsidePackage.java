package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		
	//	Employee.company = "Neotech"; //company has default
		emp.empName = "Komron";
	//	emp.empLastName = "Babakhanzoda";
	//	emp.salary = 90;
	//	emp.ssn = 123456;
		
		emp.method1();
	//	emp.method2();
	//	emp.method3();
	//	emp.method4();
		
	}

}
