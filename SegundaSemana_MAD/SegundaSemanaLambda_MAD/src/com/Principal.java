package com;

public class Principal {
public static void main(String[] args) {
/*Expresiones o funciones Lambda. Son expresiones o funciones anonimas que implementan una interface funcional.	
 * Esto nos permite defininr ese metodo para uso inmediato, sin necesidad de crear una clase que lo defina. 
 * 	Su operador es -> y su sintaxis es (parametros) -> {(cuerpo de lambda)};	 */
	
	// Crear una instancia anonima que implemente nuestra interface funcional.
	
	
	IFuncional suma = (item1,item2)->System.out.println("La suma es: "+(item1+item2)); 
		
	// Puedo utilizar el metodo operacion, a traves del objeto suma.
	
	suma.operacion(7,8);
	
	IFuncional resta = (minus1,minus2)->System.out.println("La resta es: "+(minus1-minus2));
	
	resta.operacion(250, 100);
	
	
	
	
	
	
	
}//main
}//class
