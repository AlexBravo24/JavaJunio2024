package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones o Funciones "LAMBDA".
		//Son aquellas expresiones "anónimas" que implementan una interfase funcional
		
		//Esto nos permite definir ese método para su uso inmediato, sin necesidad de crear una clase que lo defina
		//Nos van a pemritir crear un objeto de una clase anónima que nos permita implementar el método.
		
		//Su operador es (->)
		//Su sintaxis es: (Con estos parámetro) -> {(cuerpo de lambda)};
		
		//PASOS
		//Crear una instancia de una clase anónima, que implemente nuestra interface funcional
		IFuncional suma = (x,y)-> System.out.println("La suma es: "+(x+y)); //"a" y "b" en esta línea podrian ser "x" y "y", item1 e item 2, etc.
		
		//Ya definido el método, se puede utilizar el método operación, a través del objeto suma.
		suma.operacion(23, 43);
		
		IFuncional resta = (item1,item2)-> System.out.println("La resta es: "+(item1-item2));
		resta.operacion(33, 12);

	}

}
