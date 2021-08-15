package com.neotech.lesson04;

public class Recap {
	public static void main(String[] args) {
		//order of arithmetic operations
		
		int num1 = 10 + 10 * 10;
		System.out.println(num1);
		
		int num2 = (10 + 10) * 10;
		System.out.println(num2);
		
		int num3 = 10 * 10 + 10 / 10;
		System.out.println(num3);
		
		int num4 = 15;
		int num5 = 4;
		
		int div = num4 / num5;
		System.out.println("div is --> " + div); //3.75 but the 0.75 is lost 
		
		int rem = num4 % num5;
		System.out.println("rem is --> " + rem);
		
		int remainder = 19 % 6;
		System.out.println("remainder is --> " + remainder);		
		
		System.out.println("***********************");
		System.out.println("Addition vs Concatenation");
		
		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sunday";
		boolean z = true;
		
		System.out.println(x + " " + y); //Java Sunday
		System.out.println(x + " " + y +  " " + a); //Java Sunday 10
		System.out.println(x + " " + z); //Java true
		
		System.out.println(x + y + a + b); //JavaSunday1020
		System.out.println(a + b + x + y); //30JavaSunday
		System.out.println(a + (b + x + y)); //1020JavaSunday
		System.out.println(a + "" + b + x + y); //1020JavaSunday
		
		System.out.println("--------------------");
		System.out.println(a + b + (x + y)); //30JavaSunday
		System.out.println(x + y + a * b); //JavaSunday200
	}

}
