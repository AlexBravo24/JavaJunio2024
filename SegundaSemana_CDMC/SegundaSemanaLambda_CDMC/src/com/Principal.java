package com;

public class Principal {

	public static void main(String[] args) {
		// Expresionaes o funciones lambda
		// son funciones que implementa el emtodo de una interface funcional 
		//Esto nos permite definir ese metedo para uso inmediato 
		//sin necesidad de crear una clase definida
		
		//Sin necesidad de crear una clase , podemos implemntar este codigo
		
		//su operador es (->)
		
		IFuncional suma = (a,b) -> System.out.println("La suma es:"+(a+b));
		
		suma.operacion(19, 2);

		IFuncional resta = (a,b) -> System.out.println("La resta es:"+(a-b));
		
		resta.operacion(7, 2);

	}

}
