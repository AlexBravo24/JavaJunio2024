package condicionales;

import java.util.Scanner;

public class Condicionales1_IDO {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales. ''
		
		
		int a ; //Variable del primer numero
		int b ; //Variable del segundo numero
		
		Scanner num1 = new Scanner (System.in) ; // en donde va guardar el primer numero
		
		System.out.println("Introduce el Primer numero"); // mensaje solicitando el primer numero
		
		a = num1.nextInt(); // Dato acumulado
		
		
		Scanner num2 =  new Scanner(System.in); 
		System.out.println("Introduce el Segundo Numero ");
		
		b = num2.nextInt();
		
		
		if (a>b) {
			System.out.println("El numero 1 es mayor");
		
		
		}else if (a<b) {
			System.out.println("El numero 2 es mayor"); 
		}else {
			System.out.println("Los Nunmeros son Iguales");
		}
	}

}
