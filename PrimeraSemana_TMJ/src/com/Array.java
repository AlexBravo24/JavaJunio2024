package com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Los arrays, arreglos o vectores  son una estructura de datos que nos permiten guardar datos que
		//sean del mismo tipo , creando una coleccion 
		//una vez que se declara el tamaño del arreglo este no puede crecer en tiempo de ejecucion
		
		//FORMAS DE DECLARAR UN ARRAY 
		
		int []numeros = new int [5];
		
		// Implementamos un modo de como guardar informacion en el array
		numeros [0]=1;
		numeros [1]=10;
		numeros [2]=21;
		numeros [3]=31;
		numeros [4]=41;
		
		//se pueden agregar mas posiciones dentro del arreglo sin embargo 
		//si las posiciones nuevas no estandentro del limite estas no seran leidas en el momento de la ejecucion 
		//para mostrar en consola la determinada posicion en el array
		System.out.println(numeros[4]);
		
		Scanner entrada = new Scanner(System.in);
		int []numero2 = new int [5];
		for (int i = 0; i < numero2.length; i++) {
			System.out.println("Ingresa un numero en la posicion:"+i);
			numero2[i]= entrada.nextInt();
			//para cerrar scanner

			}
		//cerramos scanner
	//	entrada.close();
		// se puede mandar a imprimir un valor o todo el arreglo 		
		
		System.out.println(numero2[3]);
		
		//para imprimir todo el arreglo 
		for (int i = 0; i < numero2.length; i++) {
			System.out.print(numero2[i]+",");
		
		}
		
		
		//otro modo de declarar arreglos es el siguiente 
		int [] numero3 = {1,2,3,4,5};
		
		char[] nombre = {'a','l','e','x'};
		
		String [] nombres = {"Jovany", "Timoteo"};
		
		for (String i:nombres) {
			System.out.println(i);
		}
		
	
	}
	

}
