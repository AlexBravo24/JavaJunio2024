package com;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// Arrays o arrelgos son una estructura que nos 
		//permite almacenar una especie de colección de datos
		
		//una vez declarado su tamaño o longitau, este no puede
		//crecer en tiempo de ejecución
		
//formas de declarar un array
		//Declarando un array de numeros enteros con su tamaño

		
		int [] numeros= new int [5];
		numeros [0]=1;
		numeros [1]=10;
		numeros [2]=20;
		numeros [3]=30;
		numeros [4]=40;
		
		//imprimir en consola determinada posicion del array
		
		System.out.println(numeros [4]);
		
		//Declarando un Scanner 
		Scanner input =new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
		for (int i=0; i < numeros2.length; i++) {
			
			System.out.println("ingresa el numero en la posicion "+ i);
			numeros2 [i]= input.nextInt();
		}
		
		//si ya no utilizo mi Scanner para introducir datos
		//lo correcto es cerrarlo para ahorrar memoria 
		input.close();
		
		//vamos a imprimir un valor guardado una vez teniendo numeros en el array
		System.out.println(numeros2  [3]);
		
		//para imprimir todos los datos guardados
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]+ " ");
			
			
		}
		}
}