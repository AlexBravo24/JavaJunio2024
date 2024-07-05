package condicionales;

import java.util.Scanner;

public class Condicionales4_MAD {

	/*
	 * 4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena, compare;
		
		System.out.print("Digite una cadena: ");
		cadena = entrada.next();
		
		compare = cadena.toLowerCase();
		
		if (compare.contentEquals(cadena)==true) {
			System.out.println("La cadena no contiene letras mayusculas");
		}
		else {
			System.out.println("La cadena contiene letras mayusculas");
		}
		
	} //main
} //class
