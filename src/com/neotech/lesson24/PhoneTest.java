package com.neotech.lesson24;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		
//		Phone ph = new Phone(); //We cannot creat instance
	
	
		//We can indirectly create object
		//using upcasting
		Phone iPhone = new iPhone();
		
		iPhone.call();
		iPhone.text();
		iPhone.takePicture();
		iPhone.playMusic();
		
		
		Phone samsung  = new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
	
	
	
	
	
	
	}

}
