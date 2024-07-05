package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_DISA {

	public static void main(String[] args) {
		// Uso de las clases FILE, FILEREADER Y BUFFEREADER
		//Cada una nos sirve para una tarea específica
		//File - identifica la ruta del archivo
		//FileReader - nos permite abrir el archivo en modo lectura
		//Buffereader - nos permite leer el contenido del archivo y acceder al mismo
		
		//Declaramos un String donde podamos guardar la información que vamos a leer de un archivo de prueba
		
		/*String linea;
		
		//Utilizar una estructura try & catch para intentar realizar la comunicación o lectura del archivo y 
		//así poder controlar una excepción si esta surgiera
		
		try { //Intentar ejecutar siguiente bloque de código
			//Clase File - Representación del archivo en memoria
			
			File archivo = new File ("C:\\Users\\dysa9\\OneDrive\\Escritorio\\fichero.txt");
			
			//Para poder leer el archivo hacemos uso de la clase FileReader
			
			FileReader fr = new FileReader (archivo); //carga el cache, copia elegible
			
			//Ahora sí vamos a leer el contenido del archivo con BuffeReader
			
			BufferedReader buffer = new BufferedReader (fr);
			
			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar en mi string
			//linea para poder mostrarlo finalmente en consola
			
			// AQUI SE HIZO COMENTARIOlinea = buffer.readLine();
			
			//Si quiero leer más líneas de texto, voy a recurrir al uso de un ciclo
			while ((linea = buffer.readLine()) !=null) { //null = no esta vacía
				System.out.println(linea);
			}
		
		} catch (Exception e) { //si algo falla, con el catch se controla la excepción, dictandole como hacerlo
			System.out.println("No se encontro el archivo");
		}
		*/
		
		// SEGUNDA PARTE CON ERROR, LO ANTERIOR ESTA COMENTADO PARA SUPRIMIR EL RESULTADO EN CONSOLA

		String linea;
		
		//Utilizar una estructura try & catch para intentar realizar la comunicación o lectura del archivo y 
		//así poder controlar una excepción si esta surgiera
		
		try { //Intentar ejecutar siguiente bloque de código
			//Clase File - Representación del archivo en memoria
			
/*			 //AQUI SE ESTABLECE EL ERROR: se cambia el nombre del archivo txt
			
			//Para poder leer el archivo hacemos uso de la clase FileReader
			
			FileReader fr = new FileReader (archivo);
			
			//Ahora sí vamos a leer el contenido del archivo con BuffeReader
			
			BufferedReader buffer = new BufferedReader (fr);
			
			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar en mi string
			//linea para poder mostrarlo finalmente en consola
			
			// AQUI SE HIZO COMENTARIOlinea = buffer.readLine();
			
			//Si quiero leer más líneas de texto, voy a recurrir al uso de un ciclo
			while ((linea = buffer.readLine()) !=null) { //null = no esta vacía
				System.out.println(linea);
			}
*/
			//Escritura de archivo -FileWritter
			
			String cancion = "\nLa ciudad de la furia"; // \n - es para introducir un salto de línea
			
			File archivo = new File ("C:\\Users\\dysa9\\OneDrive\\Escritorio\\fichero.txt");
			
			//Hacemos uso de la clase FileWritter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo, true); //AQUI se tiene que agregar , true. agregar el valor booleano
			// true es para respetar la info del archivo originalmente
			//con un false lo sobreescribe
			
			//Utilizamos el método .write para escribir en nuestro archivo el valor del String canción
			line.write(cancion); 
			
			//Para confirmar la escritura, utilizamos el método .close()
			line.close();
			
		} catch (Exception e) { //si algo falla, con el catch se controla la excepción, dictandole como hacerlo
			System.out.println("No se encontro el archivo");
			
			//Se genero el error y no se encontró el archivo, y se atrapa la excepcion en la variable "e" 
			e.printStackTrace(); //Este método permite ver el error en consola (ver la excepción atrapada)
			
		}

	}

}
