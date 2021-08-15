package com.neotech.lesson10;

public class TaskLess10 {
	
	public static void main(String[] args) {
		
		/*
		 * Print the following pattern
		 * 55555  //we want the inner loop to run 5 times --- value of i is 5
		 * 4444   //							  4 time  --- value of i is 4
		 * 333
		 * 22
		 * 1
		 * 
		 */
		
		
		for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
		
		
        }
		
		System.out.println();
		
		/*
		 * Print the following pattern
		 * [*]
		 * [**]
		 * [***]
		 * [****]
		 * [*****]
		 * [****]
		 * [***]
		 * [**]
		 * [*]
		 * 
		 */
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		for (int k = 5; k > 0; k--)
		{
			for (int l = 1; l < k; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 
		 */
		
		for (int t = 1; t <= 5; t++)
		{
			System.out.println();
			for (int a = 1; a <=t; a++)
			System.out.print(t);
		}
		System.out.println();
	}

	
}


