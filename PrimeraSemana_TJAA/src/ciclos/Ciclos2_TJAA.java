package ciclos;

import java.util.Scanner;

public class Ciclos2_TJAA {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner entrada = new Scanner (System.in);
		int tabla, limite;
		System.out.println("Introduce el número de la tabla que desea");
		tabla= entrada.nextInt();
		
		System.out.println("Introduce el limite");
		limite= entrada.nextInt();
		
		System.out.println("Tabla de multiplicar" + tabla + ":");
		
		for (int i = 1; i <=limite; i++) {
			System.out.println(tabla + "x" + i + "=" + (tabla*i));
			
			
		}
		
		
		

	}

}
