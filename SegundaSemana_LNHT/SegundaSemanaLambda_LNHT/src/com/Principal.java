package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones o funciones lambda son expresiones o funciones anonimas que implementa el metodo de una 
		//interface funcional
		
		//Esto nos permite definir ese metodo para us uso inmediato sin necesidad de crear una clase que lo defina 
		
		//Su operador es un ->
		//su sintaxis es (parametro) -> (Cuerpo lambda)
		
		IFuncional suma = (a,b) -> System.out.println("La suma es "+ (a+b));
		suma.operacion(29, 2);
		
		IFuncional resta = (x,y) -> System.out.println("La resta es :"+ (x-y));
		resta.operacion(12, 2);
	}

}
