package com.first;

import java.util.ArrayList;

public class Revsersa {

	
	public static String reverse(String texto) {
		String reversedString = "";
		
		for (int i = texto.length()-1; i >= 0; i--) {
			reversedString += texto.charAt(i);
		}
	
		return reversedString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(reverse("Mucha Lucha!"));
		
	}

	
	
	
}
