package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones o funciones lambda- son expresiones o funciones que implementan una interface funcional
		//esto permite definir ese metodo para su uso imnediato
		//sin necesidad de crear una clase que lo defina
		
//su operador es (->)
		//su sintaxis es (parametros)->(cuerpo de lambda);
		
		//Crear una instancia de una clase anonima que implemente la clase
		//funcional
		
		IFuncional suma = (a,b) -> System.out.println("La suma es: "+ (a+b));
		
		//puedo utilizar el metodo llamado operacion
		//a traves del objeto suma
		 
		suma.operacion(19, 2);
		
		IFuncional resta= (x,y)-> System.out.println("La resta es: "+ (x-y));
		
		resta.operacion(10, 5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}