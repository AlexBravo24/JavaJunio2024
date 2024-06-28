package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
	//Array Bidimensional
	//nos permite almacenar datops de forma tabular pasandop a un concepto de "tabla"
   //permitiendonos tener datos en filas y columnas
		
		//Declarar un array de dos dimensiones con su tamaño inicial
		
		int [][] matriz = new int [3][3];
		
		// [0,0][0,1][0,2]
		// [1,0][1,1][1,2]
		// [2,0][2,1][2,2]
		
		
// tenemos que llamar co el nombre de nuestro array(matriz)
// tenemos que indicar la posicion de la fila y la posicion de la columna
//donde vamos almacenar nuestro primer numero
		
		//primer fila
		matriz[0][0]=1;// esta es la posicion que ocupa en la fila
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
	 
		//declarando una matriz o un array bidimensional con valoresd asignados desde un inicio 
		int [][] matriz2 = {{ 1,2,3,}, {4,5,6}, {7,8,9}};
		
		//System.out.println(matriz2.length);
		
		//para recorrer este array necesitamos dos ciclos for, uno anidadfo dentro del otro
		
		  for (int i = 0; i < matriz2.length; i++) {
			  System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " ");
	    }
			
	  }
		  
//existe una clase en java que nos permite almacenar mas de un  tipo de dato y seria la clase Object
	 System.out.println();	  
     Object [] array = {1,"Alex",'B',10000.50};  //crearemos un array de objetos y podremos 
                                                   //almacenar varios tipos de datos
		  
     
     for (Object i : array) {
    	 System.out.println(i);
		
	}
    }

}
