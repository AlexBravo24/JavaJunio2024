package com;

import java.io.File;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases file, FileReader y BufferedReader
		//Cada una nos sirve para una tarea especifica
		//File- Identifica la ruta del archivo
		//FileReader- nos permite abrir el archivo en modo lectura
		//BuferedReader-Nos permite leer el contenido del archivo yu acceder al mismo
		
      //Declaramos un string donde podamos guardar la informacion que vamos a leer de un archivo de prueba
	  
		String linea;
		
		//Utilizar una estructura try & catch para intentar
		//realizar la comunicacion o lectura del archivo y asi poder controlar una situacion que surgiera
		
		try {// intentar ejecutar el siguiente bloque de codigo
			
			File archivo = new File (linea);
			
		} catch (Exception e) { //Si algo falla se controla la excepcion
			// TODO: handle exception
		}
		
	
	
	}

}
