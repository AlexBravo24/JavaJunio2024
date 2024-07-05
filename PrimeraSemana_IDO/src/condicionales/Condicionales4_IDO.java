package condicionales;

import java.util.Scanner;

public class Condicionales4_IDO {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.

		Scanner entrada = new Scanner (System.in);; // donde guardara la Cadena
		
		
		System.out.println("Introduce un texto");
		
		String texto = entrada.next();
		
        entrada.close(); // Cierra el objeto Scanner

		
		boolean contieneMayusculas = texto.chars().anyMatch(Character::isUpperCase);
		  // Muestra el resultado
        if (contieneMayusculas) {
            System.out.println("La cadena contiene letras mayúsculas.");
            
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }
		
        
		
		
	}

}
