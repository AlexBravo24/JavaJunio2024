package com;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	//Arrays
	
	/*
	 * Los arrays o arreglos o tambien conocidos como vectores, son una estructura de datos que nos permiten almacenar
	 * un tipo de datos en común.
	 * Son una especie de colexión de datos.
	 * 
	 * Una vez declarado su tamaño o longitud este no puede crecer durante el tiempo de ejecución.
	 * 
	 */
	
	 // Formas de declarar un array: 
		 // Declarando un array en números enteros:
	int [] numeros = new int [5];
	
	// Guardar o asignar valores a cada posición del array
	numeros[0]=1;
	numeros[1]=10;
	numeros[2]=20;
	numeros[3]=30;
	numeros[4]=40;
	
//	numeros[5]=15; /* Si quiero agregar una posicion mas, "puedo hacerlo", porque la sintaxis es correcta, si 
//	sin embargo el indice no existe porque el array ya tiene un tamaño declarado.
//*/
	
	//Imprimir en consola determinada posicion del array
	
	System.out.println(numeros[4]);
	
	
	// Declarando un Scanner para solicitar los valores por teclado
	
	Scanner Input = new Scanner(System.in);
	 int numeros2 [] = new int [5];
	 
	 for (int i = 0; i < numeros2.length; i++) {
		System.out.print("Ingresa un numero en la posicion "+i+": ");
		numeros2[i]=Input.nextInt();		
	}
	
	 for (int i = 0; i < numeros2.length; i++) {
		 System.out.println("El array " +i+ " contiene el valor: "+numeros2[i]);
	}
	 
	 // Otra manera de declarar un array, es con sus valores definidos desde el inicio.
	 
	 int numeros3[] = {1,2,3,4,5};
	 char nombre [] = {'A','B','C','D'};
	 String nombres [] = {"Manuel", "Alejandro", "Abraham"};
	 
	 for (String i: nombres) { // Para cada elemento del array 
		 System.out.println(i); //Imprimelo cada uno en una nueva linea
	 }
} //main
} //class
