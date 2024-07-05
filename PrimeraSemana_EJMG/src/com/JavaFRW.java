package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
	//uso de las clases File , FileReader y BufferedReader
		//cada una nos sirve para un a tarea especifica
		// clase File - identifica la ruta del archivo 
		//Filereader nos permite abrir el archivo en modo de lectura
		//bufferedReader - nos permite leer el contenido
		//del archivo y accder al mismo
		
		//declaramos un String donde podamos guardar la informacion 
		//que vamos a leer de un  archivo de prueba
		
		String linea;
		//utilizar una estructura try & catch para intentar 
		//realizar la comunicacion o lectura del archivo y asi poder 
		//controlar una excepcion si esta surgiera
		
		try {//intentar ejecutar el siguiente bloque de codigo
			
			//clase file - esla representacion del archivo en memoria
			
			/* **************************       
			  File archivo= new File("C:\\Users\\janet\\OneDrive\\Escritorio//ficheroe.txt");
		
			//para poider leer el archivo hacem,os uso de la clase FileReader
			FileReader fr =new FileReader(archivo);
			
			//ahora si vamos a leer el contenido del archivo con BufferedReader	
			BufferedReader buffer = new BufferedReader(fr) ;	
			
			//ahora que ya podemos acceder al contenido y leerlo, lo vamos a guardar
			//en mi String linea para poder mopstrarlo finalmente en consola
			//linea = buffer.readLine();
			
			//si quiero leer mas lineas de texto , podemos recurrir al uso de un ciclo
			
			while ((linea =buffer.readLine()) !=null) {
				System.out.println(linea);
				
			}   
			
			*****************************************************/
			
			//Escritura de archivos con la clase FileWriter
			
			String nombre= "\nGENERACION 157";  //\n --es introducir un salto de linea ya sea antes o despues del string
			
			File archivo= new File("C:\\Users\\janet\\OneDrive\\Escritorio//fichero.txt");
			//hacemos uso de la clase FileWriter para escribir la informacion en ele archivo
			
			FileWriter line = new FileWriter(archivo, true);// grego el valor booleano true para respetar
			//la informacion contenida en nuestro archivo originalmente
			
			//Utilizamos el metodo .Write para escribir en nuestro aerchivo el valor de
			//el String nombre
			
			line.write(nombre);
			
			//para confirmar la escritura, utilizamos el metodo .close
			line.close();
			
			
			
			
		} catch (Exception e) {//si algo falñla , se controla la excepcion 
		
	System.out.println("NO SE ENCONTRO EL ARCHIVO");
	e.printStackTrace(); //este metodo me permite ver la traza de error en consola
	//es decir ver la excepcion que se atrapo aqui
		}

	}

}
