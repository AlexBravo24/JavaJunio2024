package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// ciclos o bucles 
		//son estructuras  que se pueden ejecutar n veces
		//deacuerdo a una condicion o condiciones
		
	//Regular mente se suelen apoyar en el cambio de una variable  generalmente numerica
		
		// ciclo while - se ejecuta mientras se cumpla algo
		// para controlar la ejecucion  del ciclo while usamos x+1;
		
		int x=1;
		while (x<5) {
			System.out.println(x+ " .HOLA MUNDO");
			x ++;
		}
		/*ciclo do while
		 * util  si nos encontramos en una situacion  en la que puede que no se cumpla
		 * la condicion y nos aseguramos de que se ejecute por al menos una vez
		 * */
		do {
		System.out.println("HOLA MUNDO");	
		}while(x>10);
//ciclo while se puede considerar un ciclo o bucle indeterminado 
		// el ciclo for es un ciclo determinado  ya que desde un inicio se establecen 
		// las condiciones sobre las cuales funcionara 
		
		// ciclo for 
		/*para estas condiciones 
		 * se ejecuta el bloque de codigo
		 * }
		 * para (una variable de control; una condicion y un incremento)*/
		for (int i = 1; i <=5 ; i++) {
			System.out.println(i+" .Hola Mundo");
			
		}
		
	}

}
