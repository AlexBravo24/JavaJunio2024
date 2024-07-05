package com;

import java.util.Scanner;

public class Array1_EJMG {

	public static void main(String[] args) {
		/*Arrays 
		* los arrays o arreglos o tambien conocidos como vectores son una estructura
		* de edatis que nos permiten almacenar un tipo de datos en coomun
		* son  una especie de coleccion de datos
		*/

		//una vez declarado su tamaño o longitud , este n puede crecer
		//en tiempo de ejecucion
		
		//formas de declarar un Array
		
		// declarando un array de nuemeros enteros con su tamaño
		
		
		//guardar o asigar valores a cada posicion del array
		
		int []numeros= new int[5];
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//numeros[5]=15; // si quiero agregar una posicion mas puedo hacerlo por que la sintaxis es conrrecta
		// sin embargo el indice no existe por que el array ya tienen un  tamaño declarado
		
		//imprimir en consola determinada posicion del array
		
		System.out.println(numeros[4]);
		
		
		//Declarando un  Scanner para solicitar los valores por teclado
		
		Scanner input =new Scanner (System.in);
		
		int [] numeros2 =new int[5];
		
		for (int i = 0;  i < numeros2.length; i++) {
			System.out.println("INGRESA UN NUMERO EN LA POSOCION " + i);
			numeros2[i]=input.nextInt();
			
			                                   // si ya no utilizo mi scanner para i ntroducir datos
			                                   //lo correcto seria cerrarlo para ahorrar recuersos en la memoria
		
		}
			input.close();
			
			                                    //vamos a imprimir un valor guardado una  vez teniendo numeros en el array
			//System.out.println(numeros2[3]);
			                                        //o para imprimirlos todos puedo hacer uso nuevamente de un ciclo
			
			//for (int i = 0; i< numeros2.length; i++) {
		    //System.out.print(numeros2[i]+ ", ");
			//}                                     //otra manera de declarar u n array es con sus valores definidos desde un inicio
				
				int[]numero3 = {1,2,3,4,5};
				
				char[]nombre = {'A','l','e','x'};
				
				
				String [] nombres = {"Abraham","Rafael","Jaret","marcos"};
				
				                                              //otra forma de imprimir todos los valores de un array
				                                               // es un ciclo for each
				
				for (String i:nombres) {                      //para cada elemento del array
					System.out.println(i);                    //imprimelo cada uno en una nueva linea
				}
			
		}
	
	
}
