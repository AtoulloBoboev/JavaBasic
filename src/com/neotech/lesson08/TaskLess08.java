package com.neotech.lesson08;

public class TaskLess08 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a boolean variable workDay and assign true create int variable day and assign it to 1
		 * As long as it is workDay print “I need a day off” and increase day.
		 * Once day is 6 print “I do not need a day off any more”
		 * 
		 */
		
		//boolean wd = false;
		int day = 1;
		
		while (day <= 7 ) {
			if (day <= 5) {
				System.out.println("The day " + day + " " + "I need a day off");
			} else if (day > 5) {
				System.out.println("The day " + day + " " + "I do not need a day off");
			} 
			
			day ++;
		}
	}

}
