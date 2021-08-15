package com.neotech.lesson26;

	import java.util.ArrayList;
import java.util.Iterator;
	
	public class CarTest {
		
		
		public static void main(String[] args) {
			
			//we want an arrayList with Car objects
			ArrayList<Car> cars = new ArrayList<>();
				
			cars.add(new Car("Toyota", "Camry", 2020));
			cars.add(new Car("Honda", "Accord",2020));
			cars.add(new Car("MB", "GLE", 2002));
			
			
			
			
			
			//1st way: Using FOR loop
		//	[car1, car2, car3]
		//  [0, 	1, 	   2 ]
			
			for(int i = 0; i < cars.size(); i++)
			{
				cars.get(i).printInfo();
//				this line can be done in two steps:
//				Car c = cars.get(i);
//				c.printInfo();
				
				System.out.println("This car is a " + cars.get(i).make + " " + cars.get(i).model +" " +cars.get(i).year);
				
			}
			
			System.out.println("----------------------------");
			//2nd way: Enhanced For
			
			for (Car car:cars)
			{
				car.printInfo();
			}
			
			//using Iterator
			Iterator<Car> it = cars.iterator();
			
			System.out.println("----------------------------");
			while(it.hasNext())
			{
				//System.out.println("-------------1st way-----------");
				//1 way
				//it.next().printInfo();
				
				//System.out.println("-------------2nd way-----------");
				//2nd way
				Car str = it.next();
				str.printInfo();
		}
	}

}
