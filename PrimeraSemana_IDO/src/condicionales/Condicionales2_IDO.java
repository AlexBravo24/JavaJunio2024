package condicionales;

import java.util.Scanner;

public class Condicionales2_IDO {

	public static void main(String[] args) {
		// .Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar.
		
		int a ; //Variable del  numero
	
		
		Scanner num1 = new Scanner (System.in) ; // en donde va guardar el  numero
		
		System.out.println("Introduce el Primer numero"); // mensaje solicitando el  numero
		
		a = num1.nextInt(); // Dato acumulado
		
		if (a%2 == 0) {
			System.out.println("El Numero es Par");
						
		}else {
			System.out.println("El Numero es Impar");
		}
	}

}
