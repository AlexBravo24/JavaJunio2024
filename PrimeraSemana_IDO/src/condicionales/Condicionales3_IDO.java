package condicionales;

import java.util.Scanner;

public class Condicionales3_IDO {

	public static void main(String[] args) {
		//.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int a ; //Variable del primer numero
		int b ; //Variable del segundo numero
		
		Scanner num1 = new Scanner (System.in) ; // en donde va guardar el primer numero
		
		System.out.println("Introduce el Primer numero"); // mensaje solicitando el primer numero
		
		a = num1.nextInt(); // Dato acumulado
		
		
		Scanner num2 =  new Scanner(System.in); 
		System.out.println("Introduce el Segundo Numero ");
		
		b = num2.nextInt();
		if (b == 0) {
			System.out.println("Error el segundo numero no debe de ser cero");
		}
		
		 System.out.println("El resultado de la division es: " + (a/b));

	}

}
