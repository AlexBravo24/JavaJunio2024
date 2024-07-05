package com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// ARRAYS
		
		/*Los arrays o arreglos, o tambi�n conocidos como "vectores" con estructuras de datos
		 * que nos permiten almacenar un tipo de datos en com�n.
		 * Son una especie de colecci�n de datos 
		 */
		
		//Una vez declarado su tama�o o longitud, este no puede crecer en tiempo de ejecuci�n
		
		//Formas de declar un array
		
		//-DECLARANDO UN ARRAY DE NUMEROS ENTEROS CON SU TAMA�O
		int[] numeros = new int[5];
		
		//Guardae o asignar valores a cada posici�n del array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//numeros[50]=15; //Si quiero agregar una posici�n m�s, puedo "hacerlo", porque la
		//sintaxis es correcta, sin embargo, el �ndice no existe, porque el array ya tiene un tama�o
		//Imprimir en consola determinada posici�n del array
		System.out.println(numeros[4]);
		
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int [] numeros2= new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posici�n " + i);
			numeros2[i]=input.nextInt();
			
			
		}
		//Si ya no utilizo mi Scanner para introducir datos, lo correcto ser�a cerrarlo para ahorrar recursos en memoria
		input.close();
		
		//Vamos a imprimir un valor guardado una vez teniendo numeros en el array
		System.out.println(numeros2[3]);
		
		//O para imprimirlos todos puedo hacer uso nuevamente de un ciclo
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]+ ", ");
			//Con "syso.out.print" se imprime la info en una sola linea en la consola
			//Con syso.out.println" se impirme en distinta linea
			
		}
		
		//Otra manera de declarar un array es con sus valores definidos desde un inicio
		int [] numeros3 = {1,2,3,4,5}; 
		
		//Tambien se pueden usar caracteres y asignarles valores definidos:
		char [] nombre = {'D','y','l','a','n'};
		
		//De igual manera se pueden imprimir en String
		
		String [] nombres = {"Dylan", "Israel"};
		
		//Otra forma de imprimir todos los valores de un array es con un ciclo for each
		for (String i:nombres) { //Para cada elemento del array
			System.out.println(i); //imrimelo cada uno en una nueva linea
		}
	}

}
