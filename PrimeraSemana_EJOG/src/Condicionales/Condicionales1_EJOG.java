package Condicionales;

import java.util.Scanner;

public class Condicionales1_EJOG {

	public static void main(String[] args) {
		// .Realiza un programa que reciba dos n�meros por teclado e indique cu�l es 
		//mayor o si son iguales.
		
		double num1,num2;

		Scanner valores = new Scanner(System.in);
		
		//Asigna el primer Valor
		System.out.println("Introduce el primer n�mero: ");
		num1=valores.nextDouble();
		System.out.println("Introduce el segundo n�mero: ");
		num2=valores.nextDouble();
		//Cierra el Scanner
		valores.close();
		
		if (num1>num2) {
			System.out.println("El n�mero "+num1+" es mayor que "+num2);
		}else if (num2>num1) {
			System.out.println("El n�mero "+num2+" es mayor que "+num1);
			
		}else {
			System.out.println("El n�mero "+num1+" es igual que "+num2);
		}
		

		

	}

}
