import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		//Cada una nos sirve para una tarea especifica
		//File - identifica la ruta del archivo
		//FileReader nos permite abrir el archivo en modo lectura
		// BufferedReader - nos permite leer el contenido del archivo y acceder al mismo
		
		String linea;
		
		// Utilizar una estructura try & catch para intentar realizar las comunicación o lectura del archivo y asi poder controlar una excepción si esta surgiera
		
		try {
			
			/*	File archivo = new File("C:\\Users\\erorg\\OneDrive\\Escritorio\\fichero.txt");
			//Para poder leer el archivo hacenos uso de la clase FilReader
			FileReader fr = new FileReader(archivo);
			
			//Ahora si vamos a leer el contenido del archivo con BufferReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar en mi String Linea para poder mostrarlo en consola
			//linea=buffer.readLine();
			
		//Si quiero leer mas lineas de texto, voy a recurrir al uso de un ciclo	
			
			while((linea = buffer.readLine())!=null) {
				System.out.println(linea);
			}
			
			*/
			
			//Escritura en un archivo
			String nombre ="\nGENERACION X";// \n - es introducir un salto de linea
						
			File archivo = new File("C:\\Users\\erorg\\OneDrive\\Escritorio\\fichero.txt");
			
			//Hacemos uso de la clase  FileWriter para escribir información
			
			FileWriter line = new FileWriter(archivo,true); // Agrego elvalor booleano true, para respetar la información contenida orignal
			
			//Utilizamos el metodo .write para escribir en nuestro archivo el valor del String nombre
			
			line.write(nombre);
			
			//Para finalziar la escritura se debe cerrar con el metodo .close()
			line.close();
			
			
		}catch(Exception e){//Si algo falla , se controla la excepción
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//Este metodo me permite ver la traza de error en consola , es decir, ver la excepcion que se atrapo aqui
		}
		

	}

}
