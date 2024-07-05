package com;

public class Principal {

	public static void main(String[] args) {
		// En el concepto de composici�n, tenemos objetos m�s peque�os 
		//que forman parte de uno m�s grande
		
		//Entonces primero deben existir o crearse los objetos peque�os
		//para finalmente crear el m�s grande, que se compone de estos
		
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4.5);
		
		Almacenamiento adata = new Almacenamiento("Adata", "A5", 480);
		
		Ram kingston = new Ram("Kingston", "DDR4", 8);
		
		Laptop lenovo = new Laptop("Lenovo", "L15", "Negro", amd, adata, kingston);
		
		System.out.println(lenovo);

	

	//ACTIVIDAD 
	//Realizar un objeto de composici�n 
	//que tengan sus propios atributos y se compongan de por lo menos otros 3 objetos
	//y lo mandan a imprimir en esta misma clase pprincipal 
	
	Motor motor1 = new Motor("Manual", "250 HP", "4X4");
	
	Interior interior1 = new Interior("Gris", "Piel", "Estereo Bluetooth");
	
	Exterior exterior1= new Exterior(5072, 1979, "Faros led");
	
	Camioneta Ford = new Camioneta("Ford", "Azul", 4, motor1, interior1, exterior1);
	
	System.out.println(Ford);
	
	
	
	}	
}
