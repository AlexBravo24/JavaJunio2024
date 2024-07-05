package com;

public class Principal {

	public static void main(String[] args) {
		//Expresiones o Funciones Lambda
		//Son expresiones o funciones "anonimas" que implementan el m�todo de una interface funcional
		
		//Esto nos permite definir este m�todo para su uso inmediato, sin necesidad de crear una clase
		//que lo defina
		
		//Su operador es (->)
		//Su sintaxis es  (parametros) -> {(cuepor de lambda)};

		//Crear una instancia de una clase anonima, que implemente nuestra intercade funcional
		IFuncional suma = (a,b) -> System.out.println("La suma es:"+(a+b));
		
		//Puedo Utiliar el m�todo llamado operaci�n, a trav�s del objeto suma
		suma.operacion(15, 2);
		
		IFuncional resta = (x,y) ->System.out.println("La resta es:"+(x-y));
		
		resta.operacion(10, 7);
		
		}
}
