package com;

import org.omg.CORBA.OBJ_ADAPTER;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nos permiter almenar datos de forma tabular 
		//pasando a un concepto de "tabla"
		//Permitiendonos tener datos en filas y columnas 
		
		//Declarar un Array de 2 Dimenciones 
		//Con su tamañao inicial 
		
		int[] [] matriz = new int [3][3];
		
		matriz [0] [0]=1;
		matriz [0] [1]=2;
		matriz [0] [2]=3;
		
		matriz [1] [0]=4;
		matriz [1] [1]=5;
		matriz [1] [2]=6;
	
		matriz [2] [0]=7;
		matriz [2] [1]=8;
		matriz [2] [2]=9;
		
		
		int[] []  matriz2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		//System.out.println(matriz2.length);
		
		
		//para correr este este array necesitamos 2 ciclos for uno anidado de otro
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + "  ");
			}
		}
		System.out.println();
		Object []array = {1,"Alez",10000.50};
		for (Object i:array) {
			System.out.println(i);
		}
	}

}
