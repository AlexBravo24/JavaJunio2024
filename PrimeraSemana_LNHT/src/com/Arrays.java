package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// los arrays son arreglis o tambien conocidos como "ventores "
		/* son una estrusctura de datos que nos permiten almacenar un tipo de datoen comun
		 * ¨son una especie de coleccion de datos
		 */
		
		//Una vez declarando su tamaño o longitud este no puede crecer en tiempo de ejecucuiion
		//formas de declararun arrays de numeros enteros con su tamaño
		int[] numeros= new int[5];
		
		//guardar o asignar valores de cada posicion
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//imprimir en consola determinda posicion array
		System.out.println(numeros[4]);
		// Declarar un sccaner para solicitar valores x teclado
		
		Scanner input =new Scanner(System.in);
		int[] numero2 = new int[5];
		
		for (int i = 0; i < numero2.length; i++) {
			System.out.println("Ingresa un numero para la posicion "+ i);
			numero2[i]= input.nextInt();
		}
		// si ya no utilizo mu scanner para introducur datos lo correcto seria cerrarlo para ahorrar memoria
		input.close();
		
		//vamos a imprimir un valor guardado unca vez teniendo numeros en el array
		System.out.println(numero2[3]);
		
		//o para verlos todo puedo hacer nuevamente un ciclo
		
		for (int i = 0; i < numero2.length; i++) {
			System.out.print(numero2[i]+",");
			
		}
		
		//otra manera de declarar un array es con sus valores definidos desde el inicio
		
		int[] numero3= {0,11,22,33,44};
		char[] nombre = {'a','l','e','x'};
		
		String[] nombres= {"abraham","nahum","luis","jareth","Marcos"};
		
		//para otra forma de imprimir todos los valores de un array es con un ciclo for each
		 for (String j : nombres) {
			System.out.println(j);
		}
	}

}
