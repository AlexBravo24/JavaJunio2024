package ciclos;

import java.util.Scanner;

public class Ciclos2_EJOG {

	public static void main(String[] args) {
		/*Programa un algoritmo que realice la tabla de multiplicar de un numero 
		  introducido desde teclado, hasta la iteración deseada por el usuario. 
		  Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???*/
		
		int inicio,fin,resultado;
		
		Scanner Entrada = new Scanner (System.in);
		
		System.out.println("======================================");
		System.out.println("====	Tablas de Multiplicar     ====");
		System.out.println("======================================");
		
		System.out.println("Introduce con cual tabla quieres iniciar:");
		inicio=Entrada.nextInt();
		System.out.println("Introduce con cual tabla quieres finalizar:");
		fin=Entrada.nextInt();

		do {
			System.out.println("====	Tabla de Multiplicar  de "+inicio+"   ====");
			
			for (int j = 1; j <= 10; j++) {
				resultado=inicio*j;
				
				System.out.println(inicio+" x " +j +" = "+resultado);
			}			
			
			inicio++;
			
		}while (inicio<=fin);

		

	}

}
