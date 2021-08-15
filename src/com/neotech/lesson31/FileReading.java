package com.neotech.lesson31;

public class FileReading {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Atoul\\eclipse-workspace\\JavaBasic\\configs\\conf.properties";
		System.out.println(filePath);
		
		//Finding user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		//Getting username
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//Getting operating system of your computer
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String dynamicPath = System.getProperty("user.dir") + "\\configs\\\\conf.properties";
		System.out.println(dynamicPath);
		
		//HW continue to read the file using dynamicPath
	}

}
