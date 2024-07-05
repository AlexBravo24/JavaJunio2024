package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		// cada una nos sirve para una tarea especifica
		//File - Identifica la ruta del archivo
		//FileReader nos permite abrir el archivo en modo lectura
		//BufferReader - noa permite leer contenido del archivo y acceder al mismo 
		
		//Declaramos un string donde podamos guardar la informacion que vamos a leer de un archiv de prueba
		
		String linea;
		
		//utilizar una estructura try & catch para intertar realizar la comunicacion o lectura
		// del archivoy asi podemos controlar una xvepcion si esta surgiera
		
		try {//intentar ejecutar el siguiente bloque de codigo
			/*File archivo =new File("C:\\Users\\x\\Desktop\\fichero.txt");
			
			//paara poder leer el archivo hacemos uso de la clase FileReades
			FileReader fr = new FileReader(archivo);
			
			//ahora si vamos a leer el contenido del archivo con BufferesReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//ahorra que ya podemos acceder y leer, lo voy a guardar en mi string linea para poder mostralo al
			//final en consola
			
			// = buffer.readLine();
			//si quiero leer mas lineas de texto, voy a recurrir al uso de un ciclo
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			} */
			
			//Escritura de archivos - FileWriter
			String nombre = "\n Generacion 164";
			File archivo = new File("C:\\Users\\x\\Desktop\\fichero.txt");
			
			//hacemos uso de la clase FileWriter para escribir informacion en el archivo
			FileWriter line = new FileWriter(archivo,true);//agrego el calor true para respetar la informacion 
			//contenida originalmente
			//utilizamos el metodo .Write para escribir en nuestro archivo el valor del string
			line.write(nombre);
			
			// para confirmar la escritura utilizamos el metodo .close()
			line.close();
			
		} catch (Exception e) {//si algo falla se controla la excepcion
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//Este metodo me permite ver la traza de error e la consala
			//es decir ver la excepcion que se atrapo aqui
		}

	}

}
