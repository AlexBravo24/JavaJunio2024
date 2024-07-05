package Ciclos;

import java.util.Scanner;

public class Ciclos3_MAD {

	public static void main(String[] args) {
// 3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner (System.in);
		String stringEvaluar, reverseString = "";
		boolean revision = true;
		
		System.out.println("===========================");
		System.out.println("=====EJERCICIO CILOS 3=====");
		System.out.println("===========================");	
		System.out.println("");
		
		System.out.print("Introduce un String: ");
		stringEvaluar = entrada.nextLine();
		
		for (int i= stringEvaluar.length() -1; i>=0; i--) {
			reverseString += stringEvaluar.charAt(i);
	
        }		
		System.out.println("Palabra invertida: " +reverseString);
		stringEvaluar = stringEvaluar.replace(" ", "");
		reverseString = reverseString.replace(" ", "");
		
		revision = stringEvaluar.equalsIgnoreCase(reverseString);
		
		if (revision ==true) {
			System.out.println("\nEl String es un Palindromo");
		}
		else {
			System.out.println("\nEl String no es un Palindromo");
		}
       
		System.out.println("");
		System.out.println("===========================");
		System.out.println("=====FIN DEL EJERCICIO=====");
		System.out.println("===========================");

	}

}
