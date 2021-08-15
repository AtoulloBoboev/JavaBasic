package com.neotech.lesson20;

public class CarTest {
	
	public static void main(String[] args) {
		
		//1st way
		Car c = new Car();
		c.printDetails(); //тут будет null потому что надо печатать после
		
		c.brand = "Tesla";
		c.model = "Modes S";
		c.year = 2021;
		
		c.printDetails();
		
		//2nd way
//		Car ct = new Car("Model s", "Tesla", 2021);
//		ct.printDetails();
		
	}
	
	

}
