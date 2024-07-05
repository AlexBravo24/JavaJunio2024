package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Los arrays o arreglos o tambien concocidos comom vectores son una estructura de datos
		//que nos permiten almacenar tipo de dato en comun 
		// son una especie de coleccion de datos
		
		/*
		 * una vez declarado su tamaño o longitud este peude crecer en tiempo de ejecucuion 
		 * 
		 * Formas de declarar un array
		 */
		
		int [] numeros = new int[5];
		
		//Guardar o posicionar numeros en el array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		//imprimir la posicion de numero del array
		
		//El array no puede creeser en tiempos de ejecucion 
		//System.out.print(numeros[4]);
		
		
		//Declarando con Scanner para agregar valores por teclado
		
		Scanner input = new Scanner(System.in);
		
		int[] numeros2 = new int[5];
		for (int i = 0; i < numeros2.length; i++) {
			//System.out.println("Ingresa un numero en la posisicion del array"+ i);
			//numeros2[i]=input.nextInt();
			// Si ya no utlizo Scanner para introduccir datos , lo correcto seria 
			//cerrarlo para ahorras recuros y datos 
			
		}
		
		input.close();
		/*
		//Se va a imprimir el valor guardado una vez obteniendo los datos 
		System.out.println(numeros2[3]);
		
		//0 para imprimirlos todos se pueden hacer uso nuevamente de un ciclo 
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros[i]+", ");
		}
		*/
		//otra manera de declarar un array es con sus valores definidos desde el inicio
		int [] numeros3 = {1,2,3,4,5};
		
		char [] nombre = {'A','l','e','x'};
		
		String [] nombres = {"Abram","Rafael","Cesar","Daniel","Luis"};
		
		
		for (String i:nombres){ //para cada elemnto del array 
			System.out.println(i); //impremenlo cada uno en una nueva lista
		}
		
	}

}
