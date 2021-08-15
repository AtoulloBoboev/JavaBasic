package com.neotech.lesson23;

public class Degree {
	
	void getPrerequisite()
	{
		System.out.println("To get a degree you need hgh school diploma");
	}

}

class Bachelor extends Degree
{
	
}

class Masters extends Degree
{
	void getPrerequisite()
	{
		System.out.println("To get a Master you need bachelor's diploma");
	}

	public static void main(String[] args) {
		
		Degree dr = new Degree();
		dr.getPrerequisite();
		
		Bachelor br = new Bachelor();
		br.getPrerequisite();
		
		Masters mr = new Masters();
		mr.getPrerequisite();
		
	}
}

