package com.neotech.lesson24;

public class FileTest {
	
	public static void main(String[] args) {
		
//		File f1 = new File();
	
		//upcasting
		File javaFile = new JavaFile();
		
		
		int[] grades = { 3, 4, 5, 6, 3, 4 };
		
		//when we declare objects inside here, they are automatically upcasted
		File[] files = {new JavaFile(), new WordFile(), new PDFile()};
		
		for (File f: files)
		{
			f.open();
			System.out.println("========================");
		}
		//first loop: object of JavaFile --> can only downcast to JavaFile
		//second loop: object of WordFile --> " - " WordFile objects
		
		
		
		
	}

}
