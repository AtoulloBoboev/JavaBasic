package com.neotech.lesson14;

public class DogInstances {
	
	public static void main(String[] args) {
		
	
	Dog dog1 = new Dog();
	dog1.breed = "Bulldog";
	dog1.size = "large";
	dog1.colour = "light gray";
	dog1.year = 5;
	
	
	Dog dog2 = new Dog();
	dog2.breed = "Beagle";
	dog2.size = "large";
	dog2.colour = "orange";
	dog2.year = 6;
	
	
	Dog dog3 = new Dog();
	dog3.breed = "German Shepherd";
	dog3.size = "large";
	dog3.colour = "white & orange";
	dog3.year = 6;
	
	dog1.eat();
	dog1.run();
	dog1.sleep();

	}
}
