package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_DISA {

	public static void main(String[] args) {
		// Uso de las clases FILE, FILEREADER Y BUFFEREADER
		//Cada una nos sirve para una tarea espec�fica
		//File - identifica la ruta del archivo
		//FileReader - nos permite abrir el archivo en modo lectura
		//Buffereader - nos permite leer el contenido del archivo y acceder al mismo
		
		//Declaramos un String donde podamos guardar la informaci�n que vamos a leer de un archivo de prueba
		
		/*String linea;
		
		//Utilizar una estructura try & catch para intentar realizar la comunicaci�n o lectura del archivo y 
		//as� poder controlar una excepci�n si esta surgiera
		
		try { //Intentar ejecutar siguiente bloque de c�digo
			//Clase File - Representaci�n del archivo en memoria
			
			File archivo = new File ("C:\\Users\\dysa9\\OneDrive\\Escritorio\\fichero.txt");
			
			//Para poder leer el archivo hacemos uso de la clase FileReader
			
			FileReader fr = new FileReader (archivo); //carga el cache, copia elegible
			
			//Ahora s� vamos a leer el contenido del archivo con BuffeReader
			
			BufferedReader buffer = new BufferedReader (fr);
			
			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar en mi string
			//linea para poder mostrarlo finalmente en consola
			
			// AQUI SE HIZO COMENTARIOlinea = buffer.readLine();
			
			//Si quiero leer m�s l�neas de texto, voy a recurrir al uso de un ciclo
			while ((linea = buffer.readLine()) !=null) { //null = no esta vac�a
				System.out.println(linea);
			}
		
		} catch (Exception e) { //si algo falla, con el catch se controla la excepci�n, dictandole como hacerlo
			System.out.println("No se encontro el archivo");
		}
		*/
		
		// SEGUNDA PARTE CON ERROR, LO ANTERIOR ESTA COMENTADO PARA SUPRIMIR EL RESULTADO EN CONSOLA

		String linea;
		
		//Utilizar una estructura try & catch para intentar realizar la comunicaci�n o lectura del archivo y 
		//as� poder controlar una excepci�n si esta surgiera
		
		try { //Intentar ejecutar siguiente bloque de c�digo
			//Clase File - Representaci�n del archivo en memoria
			
/*			 //AQUI SE ESTABLECE EL ERROR: se cambia el nombre del archivo txt
			
			//Para poder leer el archivo hacemos uso de la clase FileReader
			
			FileReader fr = new FileReader (archivo);
			
			//Ahora s� vamos a leer el contenido del archivo con BuffeReader
			
			BufferedReader buffer = new BufferedReader (fr);
			
			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar en mi string
			//linea para poder mostrarlo finalmente en consola
			
			// AQUI SE HIZO COMENTARIOlinea = buffer.readLine();
			
			//Si quiero leer m�s l�neas de texto, voy a recurrir al uso de un ciclo
			while ((linea = buffer.readLine()) !=null) { //null = no esta vac�a
				System.out.println(linea);
			}
*/
			//Escritura de archivo -FileWritter
			
			String cancion = "\nLa ciudad de la furia"; // \n - es para introducir un salto de l�nea
			
			File archivo = new File ("C:\\Users\\dysa9\\OneDrive\\Escritorio\\fichero.txt");
			
			//Hacemos uso de la clase FileWritter para escribir informaci�n en el archivo
			FileWriter line = new FileWriter(archivo, true); //AQUI se tiene que agregar , true. agregar el valor booleano
			// true es para respetar la info del archivo originalmente
			//con un false lo sobreescribe
			
			//Utilizamos el m�todo .write para escribir en nuestro archivo el valor del String canci�n
			line.write(cancion); 
			
			//Para confirmar la escritura, utilizamos el m�todo .close()
			line.close();
			
		} catch (Exception e) { //si algo falla, con el catch se controla la excepci�n, dictandole como hacerlo
			System.out.println("No se encontro el archivo");
			
			//Se genero el error y no se encontr� el archivo, y se atrapa la excepcion en la variable "e" 
			e.printStackTrace(); //Este m�todo permite ver el error en consola (ver la excepci�n atrapada)
			
		}

	}

}
