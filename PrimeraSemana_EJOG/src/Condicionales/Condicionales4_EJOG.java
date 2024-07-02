package Condicionales;

import java.util.Scanner;

public class Condicionales4_EJOG {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas
		
		String cadena,cadena2;
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto:");

		cadena=Entrada.nextLine();
		//boolean valida = cadena.matches(".*[A-Z].*");
		
		Entrada.close();
		
		cadena2=cadena.toLowerCase();
		
		if(cadena2.equals(cadena)==true) {
			
			System.out.println("La cadena no contiene letras mayúsculas");
			
		}else {
			System.out.println("La cadena contiene letras mayúsculas");
		}
		
	}

}
