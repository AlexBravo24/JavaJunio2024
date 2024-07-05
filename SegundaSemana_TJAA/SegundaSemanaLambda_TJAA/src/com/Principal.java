package com;

public class Principal {

	public static void main(String[] args) {
	
		//Expresiones o funciones Lambda
		//Son expresiones o funcioones "anonimas"
		//que implementan una interface funcional
		
		//Esto nos permite definir ese método para su uso
		//inmediato, sin necesidad de crear una clase que lo 
		//defina
		
		//Su operador es (->)
		//su sintaxis es (parametros) -> {(cuerpo de Lambda)};
		
		//Crear una instancia de una clase anonima, que implemente nuestra
		//interface funcional 
		IFuncional suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		
		//Puedo utilizar el método operacion, a través del objeto suma
		suma.operacion(19, 2);
		
		IFuncional resta = (a,b) -> System.out.println("La resta es: " + (a-b));
		
		resta.operacion(30, 15);
	}

}
