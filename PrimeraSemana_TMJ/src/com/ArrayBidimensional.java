package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// un array bidimencional permite guardar datos de forma tabular
		//utilizando un concepto de tabla , conteniendo datos en filas y 
		//columnas
		
		//declaramos un array de dos dimenciones con tamaño inicial 
		
		int [][] matriz= new int[3] [3] ;
		
//		[0,0][0,1][0,2]
//		[1,0][1,1][1,2]
//		[2,0][2,1][2,2]
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;
		
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		// declarando una matriz  o array bidimencional  con valores asignados 
		// desde el inicio
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		//para recorre este array se necesitan 
		// dos ciclos for 
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.println(matriz2[i][j]);
			}
			
		}
		
		}
	}

