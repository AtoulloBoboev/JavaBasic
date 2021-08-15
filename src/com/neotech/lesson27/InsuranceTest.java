package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	
	public static void main(String[] args) {
		
		ArrayList<Insurance> insuranceList = new ArrayList<>();
		
		insuranceList.add(new CarInsurance("Geico", "Honda"));
		insuranceList.add(new PetInsurance("Cigna","Dog"));
		insuranceList.add(new HealthInsurance("Aenta"));
		
		Iterator<Insurance> iterator = insuranceList.iterator();
		
		while(iterator.hasNext()) {
			Insurance ins = iterator.next();
			ins.getQuote();
			ins.cancelInsurance();
			
			System.out.println("------------------------------------");
		}
	}

}
