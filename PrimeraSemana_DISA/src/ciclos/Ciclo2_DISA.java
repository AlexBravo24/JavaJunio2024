package ciclos;

import java.util.Scanner;

public class Ciclo2_DISA {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
		//hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("========TABLA DE MULTIPLICAR========");
		 System.out.println("Digitar número a multiplicar:");
		 
		 int numero1= sc.nextInt();
		 
		 System.out.println("Digitar hasta que numero multiplicar:");
		 int numero2= sc.nextInt();
		 		 
		 for (int i = 1; i <= numero2 ; i++) {
			 //numero2=i;
			 //numero1*i = producto
			 System.out.println(numero1+"*"+i+"="+(numero1*numero2));
		}
		 
		 
		 

	}

}
