package com;

//cuando creamos un ainterface fuincional no esta de mas agregarle antes del nombre de 
//nuestra interface una anotacion llamada 

@FunctionalInterface


public interface IFuncional {

	//interface funcional es aquella que cuenta con un solo metodo abstracto
	
	public void operacion(int a , int b); 
	//esta ya seria nuestra primer interface funcional
	
	
	
	//public void saludar(String saludo); si le agragamos un metodo mas esa interfaz ya no es funcional 
	
	
}
