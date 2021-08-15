package com.neotech.lesson12;

public class Task3 {
	
	public static void main(String[] args) {
		
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country.
		//(use 2 different loop).
		
		String [] countries = {"Mexico", "Turkey", "Tajikistan", "Uzbekistan"};
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("Tajikistan")) {
				System.out.println("Dushanbe");
			} else if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (countries[i].equals("Mexico")) {
				System.out.println("Mexico City");
			} else if (countries[i].equals("Uzbekistan")) {
				System.out.println("Tashkent");
			}
		}
	}

}
