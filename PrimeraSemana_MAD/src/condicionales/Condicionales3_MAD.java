package condicionales;

import java.util.Scanner;

public class Condicionales3_MAD {

	// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
	//   Si el segundo número es 0, debe mostrar un mensaje de error.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double n1, n2;

		System.out.print("Por favor digite un numero: ");
		n1 = entrada.nextInt();
		System.out.print("Por favor digite un segundo numero: ");
		n2 = entrada.nextInt();
		
		if (n2==0) {
			System.out.println("Error");
		}
		else {
			System.out.println("El resultado de la división es "+(n1/n2));
		}
	}

}
