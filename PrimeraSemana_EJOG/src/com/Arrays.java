package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		/*Los arrays o arreglos, o tambien conocidos como vectores son una estrucutra de datos que nos permiten almacenar un tipo
		 * de datos en comun.
		 * Son una especie de coleccion de datos
		 */
		
		//Una vez declarado su tamaño o longitud, este no puede crecer en tiempo de ejecución
		
		//Formas de declarar un array
		
		//Declarando un array de numero enteros
		
		int [] numeros = new int [5];
		
		//Guardar o asignar valores a cada posición del array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//Imprimir en consola determinada posición del array
		System.out.println(numeros[4]);
		
		//Declarando un Scanner para solicitar los valores por teclardo
		/*
		Scanner input = new Scanner (System.in);
		
		int [] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un número en la posición "+i);
			numeros2[i]=input.nextInt();
			
		}
		
		//cierra Scanner 
		input.close();

		//Imprimir un valor guardado del array
		System.out.println(numeros2[3]);
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]+ ", ");
		}
		*/
		//Otra manera de declarar un array
		// Es con sus valores definidos desde un inicio
		int [] numeros3= {1,2,3,4,5};
		char [] nombre = {'A','k','w','w'};
		String [] nombres = {"Ernesto","Joel","Pedro","Jafet"};
		
		//Otra forma de imprimir todos los valores de un array es un ciclo for each
		
		for(String i:nombres) {
			System.out.println(i);
		}
		
	}

}
