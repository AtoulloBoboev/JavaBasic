package com.neotech.lesson18;

public class LocalVariables {
	
	public static void main(String[] args) {
		
		LocalVariables obj = new LocalVariables();
		obj.method1();
		
		//System.out.println(name);
		
		boolean flag = true; //scope of this variables is the main() method
		
		if(flag) 
		{
			String answer = "yes"; //the scope of this variables is only the if condition
			System.out.println(answer);
			System.out.println(flag);
		}
		
		System.out.println(flag);
		//System.out.println(answer); this is alive only inside the if condition brackets
		
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(i);
		}
		
		//System.out.println(i);
		
		
		//what if we declare it this way???
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
	}
	
	void method1()
	{ //local variables are only visible within their scope, in this case method().
		String name = "Sabah";
		int age = 30;
		
		System.out.println(name);
	}
	
	void method2()
	{
		String name = "Komron";
	}

}
