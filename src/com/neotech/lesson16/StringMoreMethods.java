package com.neotech.lesson16;

import java.util.Scanner;

public class StringMoreMethods {
	
	public static void main(String[] args) {
		
		//charAt()
		
//		Scanner scan = new Scanner (System.in);
//		char letter = scan.next().charAt(2);
//		System.out.println(letter);
				
		String name = "Hakan";
		char oneLetter = name.charAt(4);
		System.out.println(oneLetter);
		
		//indexOf()  //уточняет какой индекс
		int index = name.indexOf('p'); //если нет такой буквы, то печатает -1
		System.out.println("index is " + index);
		
		//substring()
		String message = "Komron is the best";
		String substr = message.substring(3); //only one parameter, beginIndex
		System.out.println(substr);
		
		String substr2 = message.substring(0,3); //(Kom) - 3 index not included 
		System.out.println(substr2);
	}

}
