package condicionales;

import java.util.Scanner;

public class Condicionales1_TMJ {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		int a;
		int b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de a:");
		a=entrada.nextInt();
		System.out.println("Ingrese el valor de b:");
		b= entrada.nextInt();
		
		if(a>b) {
			System.out.println("El valor de a es: " + a + " es mayor que el valor de b: "+ b);
		}else if(a<b) {
			System.out.println("El valor de b es: " + b + " es mayor que el valor de a: "+ a);
		}else if(a==b) {
			System.out.println("Ambos valores son iguales");
		}else {
		}
		
	
		
		
		
	}

}
