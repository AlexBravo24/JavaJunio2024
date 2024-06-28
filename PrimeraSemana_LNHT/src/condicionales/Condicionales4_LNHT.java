package condicionales;

import java.util.Scanner;

public class Condicionales4_LNHT {

	public static void main(String[] args) {
		// . Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
		String cadenaTexto;
		String cadena;
		Scanner scan= new Scanner(System.in);
		System.out.println("ingrese una cadena de texto");
		cadenaTexto = scan.next();
		cadena = cadenaTexto;
		cadena = cadena.toLowerCase();
		System.out.println(cadena + cadenaTexto );
		if(cadenaTexto.equals(cadena)) {
			System.out.println("la cadena de texto -" + cadenaTexto + "- No contiene mayusculas ");
		} else {
			System.out.println("La cadena de texto " + cadenaTexto +" contiene mayusculas");
		}

	}// main

}
