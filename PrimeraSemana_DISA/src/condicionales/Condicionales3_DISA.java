package condicionales;

import java.util.Scanner;

public class Condicionales3_DISA {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		//Si el segundo número es 0, debe mostrar un mensaje de error.
        
		Scanner sc = new Scanner(System.in);
		System.out.println("===========DIVISIÓN=========");
		System.out.println("Escribe el número dividendo: ");
		 
		 int a= sc.nextInt();
		 
		System.out.println("Escribe el número divisor: ");
		int b= sc.nextInt();
		if (b==0) {
			System.out.println("ERROR");
		int c= a/b;
		System.out.println("El resultado de la división "+a+"/"+b+" es igual a: "+c);
		
		}
			
		
	}
		
}
