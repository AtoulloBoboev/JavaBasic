package com.neotech.lesson29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Create a map of car models that you have in your garage and for each model the number of car you have.
	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
	For example:
	"BMW" -> 2
	"Mercedes" -> 3
	"Audi" -> 3
	"Ferrari" -> 1

- Check how many entries you have.
- Update the number of Audis to 5.
- Add a new model with any number of cars.
- Check how many Ferraris you have.
- Check if you have Honda in your map.
- Remove Mercedes from the map.
- Get all models from the map. (use keySet() method)

	Note: After each step print the map.
 */

public class Homewowrk1 {
	
	public static void main(String[] args) {
		
	//Map<K,V>
	Map<String, Integer> cars = new LinkedHashMap<>();
	
	//input elements on the map
	cars.put("BMW", 2);
	cars.put("Mercedes", 4); 
	cars.put("Audi", 3);
	cars.put("Ferrari", 1);
	
	System.out.println(cars);
	System.out.println("Cars map hs " + cars.size() + " entries!");
	
	//- Update the audi's number
	cars.replace("Audi", 5);
	System.out.println(cars);
	
	//- Add a new model with any number of cars
	cars.put("Infinity", 5);
	System.out.println(cars);
	
	//- Check how many Ferrari's you have
	System.out.println(cars.get("Ferrari"));
	
	//- Check if you have Honda in your map
	System.out.println(cars.containsKey("Honda"));
	
	//- Remove Mercedes from the map.
	cars.remove("Mercedes");
	System.out.println(cars);
	
	//- Get all models from the map. (use keySet() method)
	Set<String> models = cars.keySet();
	System.out.println(models);
	
	
	
	

	}
}
