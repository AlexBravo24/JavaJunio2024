package condicionales;

import java.util.Scanner;

public class Condicionales2_DISA {
	
	public static void main(String[] args) {
		//Realiza un programa que pida un n�mero por teclado y nos indique si es par o
		// impar.
		 Scanner sc  = new Scanner(System.in);
		 int x;
		 System.out.println("Ingresar n�mero a evaluar: ");
		 x= sc.nextInt();
		 
		 if (x / 2 == 0) {
			 System.out.println(x+" es n�mero par.");
		 }else {
			 System.out.println(x+" es n�mero impar.");
		 }
		
	}
		
}
