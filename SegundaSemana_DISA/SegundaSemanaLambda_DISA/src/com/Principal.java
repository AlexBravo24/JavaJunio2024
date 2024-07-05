package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones o Funciones "LAMBDA".
		//Son aquellas expresiones "an�nimas" que implementan una interfase funcional
		
		//Esto nos permite definir ese m�todo para su uso inmediato, sin necesidad de crear una clase que lo defina
		//Nos van a pemritir crear un objeto de una clase an�nima que nos permita implementar el m�todo.
		
		//Su operador es (->)
		//Su sintaxis es: (Con estos par�metro) -> {(cuerpo de lambda)};
		
		//PASOS
		//Crear una instancia de una clase an�nima, que implemente nuestra interface funcional
		IFuncional suma = (x,y)-> System.out.println("La suma es: "+(x+y)); //"a" y "b" en esta l�nea podrian ser "x" y "y", item1 e item 2, etc.
		
		//Ya definido el m�todo, se puede utilizar el m�todo operaci�n, a trav�s del objeto suma.
		suma.operacion(23, 43);
		
		IFuncional resta = (item1,item2)-> System.out.println("La resta es: "+(item1-item2));
		resta.operacion(33, 12);

	}

}
