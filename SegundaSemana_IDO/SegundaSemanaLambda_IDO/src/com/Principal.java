package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// expresiones o funciones Lambda  son expresiones o funciones anonimas
		//que implementan una interface funcional
		
		//Esto nos permite definir este metodo para su uso inmediato sin nesecidad de crear
		//una clase que lo defina
		
		//Su operador es (->)
		//Su sintaxis es (Parametros)-> (Cuerpo de lambda);
		
		// Crear una instancia de una clase anonima que implemente nuestra interface funcional 
		
		//definicion de metodo
		IFuncional suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		IFuncional resta = (a,b) -> System.out.println("La resta es: " + (a-b));

		//ya definido el metodo 
		//puedo utilizar el metodo llamado operacion a travez del objeto suma
		
		suma.operacion(34, 45);
		resta.operacion(10, 7);
		
	}

}
