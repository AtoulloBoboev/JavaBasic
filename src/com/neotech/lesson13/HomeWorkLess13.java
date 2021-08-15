package com.neotech.lesson13;

public class HomeWorkLess13 {
	
	public static void main(String[] args) {
		
		/*
		 * Create an array of countries: 
		 * north America countries, south America countries, Europe countries, Asian countries, African countries. 
		 * Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		 * 
		 */
		
		System.out.println("Task 1: ");
		
		String [][]countries = {
				{"Notrh America countries",  "South America countires",  "Europe countries",  "Asian countries",  "African countries" },
				{"Antigua",					 	"Argentina",				"Germany",				"China",		   "Nigeria"	},
				{"Bahamas",						"Bolivia",					"United Kingdom",		"India",			"Egypt"},
				{"Barbados",					"Brazil",					"France",				"Indonesia",		"Tanzania"},
				{"Belize",						"Chile",					"Italy",				"Japan",			"Kenya"},
				{"Canada",						"Colombia",					"Spain",				"Turkey",			"Algeria"},
				{"Costa Rica",					"Ecuador",					"Ukraine",				"Iraq",				"Sudan"},
				{"Cuba",						"Guyana",					"Poland",				"Tajikistan",		"Morocco"},
		};
		
		//using a for loop
		for (int i = 0; i < countries.length; i++)
		{
			for (int j = 0; j < countries[i].length; j++)
			{
				System.out.println(countries[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("-------------------------------------");
		System.out.println();
		
		//using for each:
		for (String[] count : countries)
		{
			for(String input : count)
			{
				System.out.println(input + " ");
			}
			System.out.println();
		}
	}

}
