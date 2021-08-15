package com.neotech.lesson25;

public class Employee {
	
	//define private variables
	private String name;
	private int age;
	private double salary;
	
	//define getter and setter methods
	//getter --> this method is used to get the value
	//setter --> this method is used to set the value
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		if (!name.isEmpty() && name.length() > 3) {
			this.name = name;
		} else {
			System.out.println("This is a short name!");
		}
		
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
