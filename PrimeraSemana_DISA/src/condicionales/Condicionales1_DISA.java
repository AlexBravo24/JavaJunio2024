package condicionales;

import java.util.Scanner;

public class Condicionales1_DISA {
	
	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===========MAYOR O MENOR=========");
		System.out.println("Escribe el primero numero: ");
		 
		 int a= sc.nextInt();
		 
		System.out.println("Escribe el segundo numero: ");
		int b= sc.nextInt();
		
		if (a>b) {
			System.out.println("El numero "+ a + " es mayor a "+ b);
		}else if (a<b)
			System.out.println("El numero "+ a + " es menor a "+ b);
		
		/*	Scanner sc = new Scanner(System.in);
		 
		 System.out.println("===========MAYOR O MENOR=========");
		 System.out.println("Escribir los digitos a evaluar: ");
		 
		 int cantidadNumeros= sc.nextInt();
		 
		 int a=0;
		 int b=0;
		
		 for (int i = 0; i < cantidadNumeros; i++) {
			 System.out.println("Escribe el numero:");
			 int tmp= sc.nextInt();
			 if (i==0) {
				 a=tmp;
				 b=tmp;
			 }else if (tmp<a) {
				 a=tmp;
			 }
			 if (tmp>b) {
				 b=tmp;
			 }
			
		}
		 
		 System.out.println("El numero menor es "+a);
		 System.out.println("El numero mayor es "+b);
		 
		
		*/ 
		
		
	}
}
