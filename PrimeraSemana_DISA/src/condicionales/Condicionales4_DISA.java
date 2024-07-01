package condicionales;

import java.util.Scanner;

public class Condicionales4_DISA {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		
		//Primero se declara la cadena de texto que se va a utilizar, en este caso, alguna aleatoria
		Scanner entrada = new Scanner (System.in); 
		String original;
		System.out.println("Introduce tu cadena de texto");
		original =entrada.nextLine();
		
		String minusculas=original.toLowerCase();
		if (minusculas != original) {
			System.out.println("La palabra o cadena de texto contiene mayúsculas");
		}else {
			System.out.println("La palabra o cadena de texto NO contiene mayúsculas");
		}
		
		
		
	}
		
}
