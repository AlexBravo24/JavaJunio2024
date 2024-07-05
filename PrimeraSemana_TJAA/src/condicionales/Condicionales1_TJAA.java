package condicionales;

import java.util.Scanner;

public class Condicionales1_TJAA {

	public static void main(String[] args) {
	
		// 1. Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales

		Scanner entrada = new Scanner (System.in);
		int a;
		System.out.println("Introduce un número");
		a = entrada.nextInt();
		
		int b; 
		System.out.println("Introduce otro número");
		b = entrada.nextInt();
		
		entrada.close();
		

		if (a < b) {
			System.out.println("El número " + (b) + " es mayor que el número " + (a));
		}else if (a > b) {
			System.out.println("El número " + (a) + " es mayor que el número " + (b)); 
		}
		if(a == b) {
			System.out.println("Los números son iguales");
		}
	
		
		

		
		

	}

}
