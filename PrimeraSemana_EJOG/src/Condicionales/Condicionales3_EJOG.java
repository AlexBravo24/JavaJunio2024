package Condicionales;

import java.util.Scanner;

public class Condicionales3_EJOG {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y muestre el resultado 
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error
		
		double num1,num2,resultado;

		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		num1=Entrada.nextDouble();
		System.out.println("Introduce un n�mero: ");
		num2=Entrada.nextDouble();
		
		Entrada.close();
		
		if(num2==0) {
			System.out.println("Error");
		}else {
			resultado=num1/num2;
			
			System.out.println("El resultado de dividir "+num1+ " entre "+num2+" es "+resultado);
			
		}
		
		
	}

}
