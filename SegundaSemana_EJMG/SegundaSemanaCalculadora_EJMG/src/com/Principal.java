package com;

public class Principal {

	public static void main(String[] args) {
		 //creamos un objeto de la clase cientifica
		
		Cientifica c1= new Cientifica();
		
		c1.sumar(12, 15);
        c1.restar(20, 15);
        c1.multiplicar(5, 8);
        c1.dividir(50, 10);
        c1.tomarTemperatura();
        
	}

}
