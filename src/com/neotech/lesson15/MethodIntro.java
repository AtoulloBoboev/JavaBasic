package com.neotech.lesson15;

public class MethodIntro {
	
	//Let me create a method for greeting
	void greet() {
		System.out.println("Hello");
		System.out.println("How are you doing?");
		System.out.println("Bye");
	}
	
	//Let me create a method that will be greeting by name
	void greet2(String name) {
		System.out.println("Hello " + name);
		System.out.println("How are you doing?");
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {
		MethodIntro object = new MethodIntro();
	}

}
