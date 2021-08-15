package com.neotech.lesson14;

public class DogObHW {
	
	public static void main(String[] args) {
		
		Dog_HW dog1 = new Dog_HW();
		dog1.breed = "Husky";
		dog1.color = "silver";
		dog1.size = "large";
		dog1.year = 6;
		
		Dog_HW dog2 = new Dog_HW();
		dog2.breed = "Bulldog";
		dog2.color = "black";
		dog2.size = "small";
		dog2.year = 2;
		
		Dog_HW dog3 = new Dog_HW();
		dog3.breed = "Labrador";
		dog3.color = "white";
		dog3.size = "large";
		dog3.year = 7;
		
		dog1.age();
		dog2.age();
		dog3.age();
		
	}

}
