package Condicionales;

import java.util.Scanner;

public class Condicionales2_EJOG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar
		
		int num1,resultado;

		Scanner Entrada = new Scanner(System.in);
		
		//Asigna el primer Valor
		System.out.println("Introduce un número entero: ");
		num1=Entrada.nextInt();
		
		resultado= num1%2;
		
		Entrada.close();
		
		if(resultado==0) {
			System.out.println("El número "+num1+ " es par");
		}else {
			System.out.println("El número "+num1+ " es impar");
		}
		

	}

}
