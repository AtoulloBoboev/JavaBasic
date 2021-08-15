package com.neotech.lesson10;

import java.util.Scanner;

public class HomeWorkLess10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		/*
		 * Ask the user to enter an integer and build the following pattern:
		 
//		 *********
//		  *******
//		   *****
//		    ***
//		     *		 

		 */
		
		
		
		System.out.println("Task 1: ");
		
		System.out.print("Enter the number of raws: ");
		int raws = scan.nextInt();
                        
        for (int a = 1; a <= raws; a++)
        {
            for (int b = 1; b < a; b++)
            {
                System.out.print(" ");
            }
            for (int c = 1; c <= raws - a + 1; c++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
		
        System.out.println("--------------------------");
		System.out.println();
        
        /*
         
//      1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1

         */
        
		System.out.println("Task 2:");
		System.out.print("Enter the number of rows: ");
//		System.out.println();
		
		int rows = scan.nextInt();
						
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for (int i = rows; i >= 1; i--) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		
				
	}

}
