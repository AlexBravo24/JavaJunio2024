package condicionales;

import java.util.Scanner;

public class Condicionales4_JAOP {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras  mayusculas
		
		
		String palabra;
		String x;
		
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Inserte una cadena:");
		palabra = entrada.next();
		
		x = palabra.toLowerCase();
		 
		if	((x).equals(palabra)){
			
			System.out.println("No contiene mayusculas");
		
		}else {
			
			System.out.println("Si contiene mayusculas");
			
		}
		
		
		
		
	}

}
