package com.first;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		int edad;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad");
		
		edad = entrada.nextInt();
		
		System.out.println("Tu edad es" + " " + edad);
	}
}
