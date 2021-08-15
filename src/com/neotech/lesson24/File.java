package com.neotech.lesson24;

//Create a class File that will have the following behaviors: open, edit, close. Edit and close are
//implemented method while open is an abstract.

//▪ Create 3 subclasses: JavaFile, WordFile, PdfFile that
//will provide specific implementation of open
//behaviour: Example: to open .java file we need
//notepad++ or sublime text, to open .doc file we
//need Microsoft word to be installed etc


public abstract class File {
	
	abstract void open();
	
	public void edit()
	{
		System.out.println("File can be edited!");
	}
	
	public void close()
	{
		System.out.println("File can be closed!");
	}

}

class JavaFile extends File
{

	@Override
	void open() {
		System.out.println("Java files can be opened using notepad++.");
	}
		
}

class WordFile extends File
{

	@Override
	void open() {
		System.out.println("Word files are opened using MS Word.");
		
	}
	
}

class PDFile extends File
{

	@Override
	void open() {
		System.out.println("PDFile are opened ");
		
	}
	
}
