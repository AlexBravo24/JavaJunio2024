package com;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// Arrays
		
		/*
		 * Los Arrays o arreglos o tambien conocidos como vectores
		 * son una estructura de datos que nos permiten almacenar
		 * un tipo de datos en comun
		 * son una especie de coleccion de datos.
		 * 
		 */

		/* 
		 * Una vez declarado su tamaño o longitud, este no puede
		 * crecer en tiempo de ejecucion.
		 */
		
		//Formas de declarar un Array
		
		//Declarando un Array de numeros enteros con su tamaño
		
		int [] numeros = new int [5];
		
		//Guardar o asignar valores a cada posicion del array
		 
		        numeros [0]=1;
				numeros [1]=10;
				numeros [2]=20;
				numeros [3]=30;
				numeros [4]=40;
				
				//numeros [5]=15; // Si quiero agregar una posicion más puedo hacerlo,
                                //porque la sintaxis es correcta sin embargo el indice 
				                //no existe porque el array ya tiene 			
		                        //un tamaño declarado
				                //Imprimir en consola determinada posicion del array
				
				//System.out.println(numeros[4]);
				
				//Declarando un scanner para solicitar los valores por teclado
				
				/*Scanner input = new Scanner (System.in);
				
				int [] numeros2 = new int [5];
				
				for (int i = 0; i < numeros2.length; i++) {
					
					System.out.println("Ingresa un numero en la posicion" +i);
					numeros2 [i] = input.nextInt();*/
				
					//Si ya no utilizamos el scanner lo correcto es cerrarlo para ahorrar memoria
				
					//input.close();
					
					//Vamos a imprimir un valor guardado una vez teniendo numeros en el array
					
					//System.out.println(numeros2[3]);}
					
					// O para imprimirlos todos puedo hacer uso nuevamente de un ciclo
				
				//for (int i = 0; i < numeros2.length; i++){
						
					//System.out.print(numeros2[i]+ ", ");
						
				
	              
				
				//Otra manera de declarar un array es con sus valores definidos desde un inicio
	
	            int [] numeros3 = {1,2,3,4,5};
	            
	            char [] nombre = {'A','l','e','x'};
	            
	            String [] nombres = {"Abraham","Rafael","Ronaldo","Ronaldinho","vela"};
				
	            //Otra form de imprimir todos los valores de un array
	            //Es con el ciclo for each
	            
				for (String i:nombres) {//Para cada elemento del array imprimelo cada uno en una nueva linea
	            	                  
	            	System.out.println(i);
				}}}
				
				
				
	
	
				
	
					
					
					
					
					
				
					
					
					
					
				
				
				
				
				
				
				
	


