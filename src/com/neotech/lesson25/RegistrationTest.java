package com.neotech.lesson25;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		Registration r = new Registration();
		
		System.out.println("___Email___");
		r.setEmail("abc@abc.com");
		System.out.println(r.getEmail());
		
		
		r.setEmail("abc@yahoo.com");
		System.out.println(r.getEmail());
		
		System.out.println("___Username___");
		r.setUserName("Atoullo");
		System.out.println(r.getUserName());
		
		
		r.setUserName("atoulloboboev");
		System.out.println(r.getUserName());
		
		
		System.out.println("___Password___");
		r.setPassword("1234");
		System.out.println(r.getPassword());
		
		r.setPassword("atoullo1234");
		System.out.println(r.getPassword());
	}

}
