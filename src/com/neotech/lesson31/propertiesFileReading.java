package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class propertiesFileReading {
	
	public static void main(String[] args) throws IOException {
		
		//How to read the file?
		
		//1. Have a file, we need the location
		String filePath = "C:\\Users\\Atoul\\eclipse-workspace\\JavaBasic\\configs\\example.properties";
		
		//2. Create an object of FileInputStream
		FileInputStream fileInput = new FileInputStream(filePath);
		
		//to handle .properties files we need to use Properties java class
		Properties prop = new Properties();
		
		//We are loading all the properties into the prop object
		prop.load(fileInput);
		
		System.out.println(prop);
		
		//String username = "Ihsan";
		String str = prop.getProperty("username");
		System.out.println("The value of the username is: " + str);
		
		//It is case sensitive
		String pass = prop.getProperty("password");
		System.out.println("The password is -> " + pass);
		
		//Getting all the key from the property file
		Set<Object> keys = prop.keySet();
		
		//Gettinh all the values from the property file
		Collection<Object> values = prop.values();
		
		for (Object key:keys) {
			System.out.println(key);
		}
		
		for (Object v: values) {
			System.out.println(v);
		}
		
		
	}

}
