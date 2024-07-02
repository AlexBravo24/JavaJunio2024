package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array Bidimensional
		// Nos permite almacenar datos de forma tabular
		//Pasando a un concepto de tabla
		//Permitiendonos tener datos en filas y columnas
		
		//Declarar un array de dos dimensiones
		//con su tamaño inicial
		
		int [][] matriz = new int [3][3];
		
		//[0,0][0,1][0,2]
		//[1,0][1,1][1,2]
		//[2,0][2,1][2,2]
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;
		

		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		

		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		//DEclarando una matriz o arraza bidemencional desde un inicio
		
		int [][] matriz2 = {{1,2},{4,5,6},{7,8,9,10,20,232}};
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
		}
		//Existe una clase en Java que nos permite almacenar más de un tipo de dato y seria la clase Object
		System.out.println();
		
		Object [] array = {1,"Alex",10000.50};
		
		for (Object i:array) {
			System.out.println(i);
		}
	}

}
