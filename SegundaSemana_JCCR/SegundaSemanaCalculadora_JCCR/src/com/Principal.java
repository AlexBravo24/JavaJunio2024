package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calculadoraCientifica = new Cientifica("Casio", "Gris", 150);
		
		calculadoraCientifica.Sumar();
//		calculadoraCientifica.Restar();
//		calculadoraCientifica.Multiplicar();
//		calculadoraCientifica.Dividir();
		calculadoraCientifica.TomarTemperatura();
	}
}
