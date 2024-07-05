package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		/*
		 * Uso de las clases File, FileReader, BufferedReader
		 * Cada una nos sirve para una tarea especifica
		 * File - identifica la ruta del archivo
		 * FileReader - Nos permite abrir el archivo en modo lectura 
		 * BufferedReader - Nos permite leer el contenido del archivo y acceder al mismo
		 */
		
		// Declaramos un String donde podamos guardar la informaci�n que vamos a leer de un archivo de prueba
		
		String linea;
		
		// Utilizar una estructura try & catch para intentar realizar la comunicacion o lectura del archivo y asi poder
		// controlar una excepcion si esta surgiera.
		
		try { // Intentar ejecutar el siguiente bloque de codigo
			
//			// File - representaci�n del archivo en memoria
//			File archivo = new File ("C:\\Users\\mauri\\OneDrive\\Desktop\\Fichero.txt");
//			
//			//Para poder leer el archivo hacemos uso de la clase FileReader para ponerlo en modo lectura			
//			FileReader fr= new FileReader(archivo);
//			
//			//Leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Una vez que se tiene acceso al contenido y leerlo, se puede guardar en mi String linea para poder 
//			// mostrarlo finalmente en consola
//			
////			linea = buffer.readLine();
////			Si quiero leer mas lineas de texto, voy a recurrir al uso de un ciclo while
//		
//			while ((linea= buffer.readLine())!=null) { //mientras haya lineas por leer
//			System.out.println(linea);
//			}
			
			//Escritura de archivos - FileWriter
			
			String nombre= "\nGeneracion 157"; //\n significa introducir un salto de linea 
			
			File archivo = new File ("C:\\Users\\mauri\\OneDrive\\Desktop\\Fichero.txt");
			
			// Hacemos uso de la clase FileWriter para escribir informaci�n dentro del archivo
			
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano true para respetar la informaci�n
			// contenida en nuestro archivo originalmente
			
			// Utilizamos el m�todo .write para escribir en el archivo el valor del String nombre
			
			line.write(nombre);
			
			// Para confirmar la escritura utilizamos el m�todo .close
			
			line.close();
			
		} catch (Exception e) { // Si algo falla se controla la excepcion
			System.out.println("No se encontr� el archivo");
			
			// Si algo falla y e atrapa la excepcion:
			e.printStackTrace(); // Este metodo me permite ver la traza de error en consola, es decir, ver la excepcion
			//que se atrapo
		}

	}

}
