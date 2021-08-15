package com.neotech.lesson18;

public class DogDemo {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Bubi";
		dog1.age = 4;
		
		dog1.displayDogInfo();
		
		//How can we access static variable???
		Dog.breed = "Golden Retriever";
		
		Dog dog2 = new Dog();
		dog2.name = "Chak";
		dog2.age = 3;
		
		//experiment - you can access it this way, but you don't need to
		//dog2.breed = "Golden Retriever";
		
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		
		Dog dog3 = new Dog();
		dog3.name = "Bob";
		dog3.age = 5;
		
		
		Dog.breed = "Shepherd";
		dog3.displayDogInfo();
		dog1.displayDogInfo();
	}

}
