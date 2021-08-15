package com.neotech.lesson24;

public class DrivableTest {
	
	public static void main(String[] args) {
		
		//Vehicles v = new Vehicles()
			
		Vehicles v = new Cars();
		v.start();
		v.stop();
		
		
		Drivable dr = new Cars();
		dr.drive(); //runs the implemented method in Cars class 
		System.out.println(Drivable.MOVE_FAST);
		
	//	Drivable.MOVE_FAST = false; //its public static final
			
		}

}
