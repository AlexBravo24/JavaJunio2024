package condicionales;

import java.util.Scanner;

public class Condicionales3_DISA {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.
        
		Scanner sc = new Scanner(System.in);
		System.out.println("===========DIVISI�N=========");
		System.out.println("Escribe el n�mero dividendo: ");
		 
		 int a= sc.nextInt();
		 
		System.out.println("Escribe el n�mero divisor: ");
		int b= sc.nextInt();
		if (b==0) {
			System.out.println("ERROR");
		int c= a/b;
		System.out.println("El resultado de la divisi�n "+a+"/"+b+" es igual a: "+c);
		
		}
			
		
	}
		
}
