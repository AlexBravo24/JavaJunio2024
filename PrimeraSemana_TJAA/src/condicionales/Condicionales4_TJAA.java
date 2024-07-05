package condicionales;

import java.util.Scanner;

public class Condicionales4_TJAA {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.
		
		
		Scanner entrada = new Scanner (System.in);
		String texto, minusculas; //Declaramos 2 String, uno para guardar la cadena original
		//y otro para convertirlo a minusculas
		
		System.out.println("Escribe tu cadena de texto");
		texto = entrada.nextLine();
		
		minusculas = texto.toLowerCase();
		
		if (minusculas.contentEquals(texto)==true) {
			System.out.println("La cadena no contiene letras mayúsculas");
		}else {
			System.out.println("La cadena contiene letras mayúsculas");
		}
		
		
		
		
		

	}

}
