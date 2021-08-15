package com.neotech.lesson14;

public class PhoneBehavior {
	
	public static void main(String[] args) {
		
				
		Phone iPhone = new Phone();
		iPhone.model = "iPhone 12";
		iPhone.price = "$900";
		iPhone.weight = "130 g";
		iPhone.battery = "2775 mAh";
		iPhone.storage = "6 GB"; 
		iPhone.year = 2020;
		
		Phone Android = new Phone();
		Android.model = "Samsung Galaxy S5";
		Android.price = "$600";
		Android.weight = "145 g";
		Android.battery = "2800 mAh";
		Android.storage = "16 GB";
		Android.year = 2018;
		
		Phone Nokia = new Phone();
		Nokia.model = "Nokia 5.3";
		Nokia.price = "$500";
		Nokia.weight = "185 g";
		Nokia.battery = "4000 mAh";
		Nokia.storage = "6 GB";
		Nokia.year = 2020;
		
		iPhone.mod();
		iPhone.weigh();
		
		Nokia.mod();
		
	}

}
