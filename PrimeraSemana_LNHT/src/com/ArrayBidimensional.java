package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//Array bidumencional nos permiten almacenar datos de forma tabular pasando a un concepto de "tabla"
		//permitiendo tener datos en fila y columnas
		
		//Declarar un array de dos dimenciones con su tamaño inicial
		
		int[][] matriz = new int[3][3];
		/* [0,0][0,1][0,2]
		 * [1,0][1,1][1,2]
		   [2,0][2,1][2,2]*/

		matriz [0][0]= 1;
		matriz [0][1]= 2;
		matriz [0][2]= 3;
		
		matriz [1][0]= 4;
		matriz [1][1]= 5;
		matriz [1][2]= 6;
		
		matriz [2][0]= 7;
		matriz [2][1]= 8;
		matriz [2][2]= 9;

		
		// matriz bidimencional con valores asignados desde inicio 
		int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//para recorrer este array necesitamos dos ciclos for, uno anidado dentro del otro
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]+" ");
			}//for j
		}//for i
		Object[] array = {1,"alex",'B',1000.50};
		
		for (Object object : array) {
			System.out.println(object);
		}
		
		
	}

}
