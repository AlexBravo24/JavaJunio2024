package condicionales;

import java.util.Scanner;

public class Condicionales1_TJAA {

	public static void main(String[] args) {
	
		// 1. Realiza un programa que reciba dos n�meros por teclado 
		//e indique cu�l es mayor o si son iguales

		Scanner entrada = new Scanner (System.in);
		int a;
		System.out.println("Introduce un n�mero");
		a = entrada.nextInt();
		
		int b; 
		System.out.println("Introduce otro n�mero");
		b = entrada.nextInt();
		
		entrada.close();
		

		if (a < b) {
			System.out.println("El n�mero " + (b) + " es mayor que el n�mero " + (a));
		}else if (a > b) {
			System.out.println("El n�mero " + (a) + " es mayor que el n�mero " + (b)); 
		}
		if(a == b) {
			System.out.println("Los n�meros son iguales");
		}
	
		
		

		
		

	}

}
