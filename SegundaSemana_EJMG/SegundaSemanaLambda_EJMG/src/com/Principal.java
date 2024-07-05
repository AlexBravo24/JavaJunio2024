package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones o funciones Lambda son exprwesiones o funciones "anonimas "
		//que implementan una interface funcional 
		
		//esto nos permite definir este metodo para su uso inmediato , sin necesidad de 
		//crear una clase que lo defin a 
		
		//su operador es -> y su sintaxis es (parametros ) -> (cuerpo de Lambda)
		
		//crear una istancia de una clase anonima , qu implemente nuestra intyerface funcional 
		IFuncional suma = (a,b) ->System.out.println("LA SUMA ES: " + (a+b));
		
		//puedo utilizar el metodo aperacion artravez del onjeto suma 
		
		suma.operacion(19, 2);
		
		IFuncional resta= (x,y) -> System.out.println("LA RESTA ES: " + (x-y));
		
		resta.operacion(10, 7);
		
		
		
		
	}

}
