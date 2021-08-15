package com.neotech.lesson25;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Komron");
				
		System.out.println(emp.getName());
		
		emp.setAge(25);
		System.out.println("This age of the employee is " + emp.getAge());
		
		emp.setSalary(95000);
		System.out.println(emp.getSalary());
	}

}
