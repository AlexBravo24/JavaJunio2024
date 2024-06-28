package condicionales;
import java.util.Scanner;


public class Condicionales1_MAD {

	// 1. Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n1,n2;
		
		System.out.print("Por favor digite el numero uno: ");
		n1 = entrada.nextInt();
		System.out.print("Por favor digite el numero dos: ");
		n2 = entrada.nextInt();
		
		if (n1<n2) {
			System.out.println("El numero dos: "+n2+", es el numero mayor");
		}
		else if (n2<n1) {
			System.out.println("El numero uno: "+n1+", es el numero mayor" );
		}
		else {
			System.out.println("Los numeros son iguales");
		}

	}

}
