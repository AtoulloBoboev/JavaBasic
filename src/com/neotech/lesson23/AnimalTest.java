package com.neotech.lesson23;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal obj = new Tiger();
		obj.eat();
		obj.sleep();
		//obj.run(); //
		
		System.out.println("=====================");
		
		Animal obj2 = new Animal();
		obj2.eat();
		obj2.sleep();
		
		System.out.println("=====================");
		
		Tiger obj3 = new Tiger();
		obj3.eat();
		obj3.sleep();
		obj3.run();
		
		System.out.println("=====================");
		
		Cub obj4 = new Cub();
		obj4.eat();
		obj4.sleep();
	}

}
