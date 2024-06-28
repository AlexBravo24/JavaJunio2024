package condicionales;

import java.util.Scanner;

public class Condicionales2_MAD {

	// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numero;
		
		System.out.print("Por favor digite un numero: ");
		numero = entrada.nextInt();
		
		if (numero%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}

	}

}
