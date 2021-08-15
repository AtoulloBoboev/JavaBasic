package com.neotech.lesson16;

import java.util.Scanner;

public class HomeWorkLess16_3 {
	
	public static void main(String[] args) {
		
		/*
		 * Task 3:
		 * Write a program that reads two parent's first names and if they expecting boy or girl?
		 * Based on the input suggests a name for a baby:
		 * If it is a boy get half from dad and half from mom.
		 * If it is a girl get half from mom and half from dad.
		 * 
		 * Example Output:
            Mom's first name? Mary
            Dad's first name? Daniel
            Boy or Girl? boy
            Suggested baby name: DANRY
        Example Output:
            Mom's first name? Mary
            Dad's first name? Daniel
            Boy or Girl? girl
            Suggested baby name: MAIEL
		 */
		
				Scanner scan = new Scanner(System.in);
				
				//Two parent's first names: mom and dad
				System.out.print("Mom's first name: ");
				String mom = scan.next();
				
				System.out.print("Dad's first name: ");
				String dad = scan.next();
				
				//scanner boy or girl
				System.out.print("Boy or girl?: ");
				String gender = scan.next();
				
				//If it is a boy get half from dad and half from mom.
				if (gender.equalsIgnoreCase("boy")) {
					//get half from dad
					String dadPart = dad.substring(0, dad.length()/2);
					//get half from mom
					String momPart = mom.substring(mom.length()/2, mom.length());
					//dad + mom = name
					String resultBoy = dadPart.concat(momPart);
					System.out.println(resultBoy.toUpperCase());
					
				} else {
					if (gender.equalsIgnoreCase("girl")) {
						//get half from mom
						String momPart = mom.substring(0, mom.length()/2);
						//get half from dad
						String dadPart = dad.substring(dad.length()/2, dad.length());
						//mom + dad = name
						String resultGirl = momPart.concat(dadPart);
						System.out.println(resultGirl.toUpperCase());
								
					}
				}
	}

}
