package com.neotech.lesson23;

public class ParentChildClass {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.bye();
//		p.hello(); //private method
		
		Child ch = new Child();
		
		
		Child.bye();
	}

}
