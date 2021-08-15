package com.neotech.lesson21;

//Write program for multilevel inheritance where class A 
//inherited by B and class B inherited by class by C.

public class A extends Object {
	
	String name = "A";
	
	void method() {
		System.out.println("This is a method in class A!");
	}
	
//	A() {
//		super();
//	}
	
	
}

class B extends A {
//	B() {
//		super();
//	}
	
	String name = "B";
	
	void method() {
		System.out.println("This is a method in class B!");
		System.out.println(this.name); //B
		System.out.println(super.name); //A
		super.method();
	}
}


class C extends B {
//	C() {
//		super();
//	}
	
	String name = "C";
	
	void method() {
		System.out.println("This is a method in class C!");
		System.out.println(super.name);
		super.method();
	}
}