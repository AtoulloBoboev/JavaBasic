package com.neotech.lesson21;

public class TestTeacher {
	
	public static void main(String[] args) {
		
		Teacher t = new Teacher("Elion", "Kurhan");
		MathTeacher mt = new MathTeacher("Atoullo", "Boboev", "Calculus");
		ChemistryTeacher ct = new ChemistryTeacher("Komron", "Baba", "Chemistry");
		JavaTeacher jt = new JavaTeacher("Mufasa", "Simsek", true);
		
		t.teaching();
		System.out.println("---------------------");
		
		jt.teaching();
		jt.teachingJava();
		System.out.println("---------------------");
		
		ct.teaching();
		ct.teachingChemistry();
		System.out.println("---------------------");
		
		mt.teaching();
		mt.teachingMath();
		System.out.println("---------------------");
	}

}
