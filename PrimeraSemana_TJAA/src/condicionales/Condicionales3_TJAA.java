package condicionales;

import java.util.Scanner;

public class Condicionales3_TJAA {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos n�meros y muestre el resultado
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner (System.in);
		int numero1;
		System.out.println("Escriba un n�mero");
		numero1 = entrada.nextInt(); 
		
		int numero2; 
		System.out.println("Escriba otro n�mero");
		numero2 = entrada.nextInt();
		
		
		if (numero2 == 0) {
			System.out.println("Error");
		}else 
			System.out.println("La divisi�n de los numeros es " + (numero1/numero2));
	}

}
