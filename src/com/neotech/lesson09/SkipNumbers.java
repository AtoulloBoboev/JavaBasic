package com.neotech.lesson09;

public class SkipNumbers {
	
	public static void main(String[] args) {
	
		//I want to print numbers from 1 to 10
		// but i want to skip 4,6,9
		
		for (int j = 1; j <=10; j++ ) {
			
			if (j == 4 || j == 6 || j ==9) {
				continue;
			}
			System.out.println(j);
		}
		System.out.println("--------------------------------");
		
		for (int a = 10; a <=50; a++) {
			if (a >= 25 && a<= 45) {
				continue;
			}
			System.out.println(a);
		}
		}
	}


