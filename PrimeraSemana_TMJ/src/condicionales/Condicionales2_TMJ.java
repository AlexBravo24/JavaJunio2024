package condicionales;

import java.util.Scanner;

public class Condicionales2_TMJ {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.
		int numero;// declaramos la variable
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el numero:");// solicitamos los datos de entrada
		numero = entrada.nextInt();
//		
//		realizamos le calculo 
		//considerando que   los números pares 
		//son aquellos que al dividirlos por 2 el residuo es 0 
		// entonces realizamos lo siguente 
		if (numero %2==0) {
			System.out.println("El numero,"+ numero+" es par");
		}else {
			System.out.println("El numero"+ numero+ " es impar");
		}
	}

}
