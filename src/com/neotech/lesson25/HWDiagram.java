package com.neotech.lesson25;

public class HWDiagram {
	
public static void main(String[] args) {
		
		ChromeDriver ch = new ChromeDriver();
		ch.close();
		
		FirefoxDriver f = new FirefoxDriver();
		f.open();
		
		System.out.println("UPCASTING");
		
		RemoteWebDriver rwd1 = ch;
		rwd1.open();
		RemoteWebDriver rwd2 = new FirefoxDriver();
		rwd2.open();
		

	}

}
