package com.neotech.lesson24;

public abstract class Phone {
	
	//implemented method
	public void call()
	{
		System.out.println("Phone make calls!");
	}
	
	public void text()
	{
		System.out.println("Phone can send text!!");
	}
	
	abstract void takePicture();
	
	
	abstract void playMusic();
	
}


class iPhone extends Phone
{

	@Override
	public void takePicture() {
		System.out.println("iPhones can take picture!");
	}

	@Override
	void playMusic() {
		System.out.println("iPhones can play music!");
	}
	
	public void call()
	{
		System.out.println("iPhones can make calls!");
	}
	
}

class Samsung extends Phone
{

	@Override
	void takePicture() {
		System.out.println("Samsung can take picture!");
		
	}

	@Override
	void playMusic() {
		System.out.println("Samsung can make calls!");
		
	}
	
}

