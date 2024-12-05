package com;
import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// introducir valores que puedan ser leidos desde el teclado 
		//ejemplo, guardar un valor numerico 
		//declarar variable para guardar el valor 
		
		
		//siempre poner el import, para agregar automaticamente las clases 
		//se pone scanner + ctrl+ espacio 
		int edad;
		
		//crear una variable de una clase llamada Scanner
		Scanner entrada= new Scanner(System.in);
	
        //antes de asignar un valor puedo mandar una impresion en consola que
		//indique que se esta solicitando 
		
		System.out.println("introduce tu edad");
		edad=entrada.nextInt();
		System.out.println("introduce tu nombre");
		//podemos seguir utilizando el scanner y guardar un nombre
		String nombre=entrada.next();
		//si queremos ahorrar memoria y que el scanner no se quede abierto si no se usará mas 
		entrada.close();
		
		//una vez guardado el valor podemos hacer uso de el 
		System.out.println("El proximo año tendrás " + (edad+1)+ " años");
		//cuando no quiero que se ejecute una linea le agrego las diagonales para que aparezca como comentario
		
		System.out.println("El proximo año " + nombre + " tendras:" + ( edad+1) + " años");
		
		
		//operador modulo %
		//nos ayuda a devolver el valor del residuo de una division 
		
		int x=10;
		int resultado= 10%3;
				
	 System.out.println(resultado);
	 
		
		
	}

}
