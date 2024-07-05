package com;

public class Principal {

	public static void main(String[] args) {
		/* En el concepto de composición, tenemos objetos mas pequeños que forman parte de uno mas grande.
		 *Entonces primero deben existir o crearse los objetos pequeños para finalmente crear el mas grande, que se
		 *compone de estos otros
		 */
		
		Procesador amd = new Procesador("AMD", "Rizen 5", 4.5);
		Almacenamiento adata = new Almacenamiento ("Adata", "A5", 480);
		Ram kingston = new Ram("Kingston", "DDR4", 8);
		
		Laptop lenovo = new Laptop("Lenovo", "L15", "Negro", amd, adata, kingston);
		
		//System.out.println(lenovo);

		//ACTIVIDAD
		//Realizar un objeto de composición que tenga sus propios atributos y se componga de por lo menos otros 3
		//objetos y lo mandan a imprimir en esta misma clase principal.
		
		Motor motor = new Motor(3.7, 4200, 5);
		Bateria batery = new Bateria(3.7, 1200, 185);
		Camara camera = new Camara("4K", 5.8, 2100);
		Dron dji = new Dron("DJI" , "Mini 3 Pro", "Blanco", motor, camera, batery);
		
		System.out.println(dji);
		
		
	} // main

} //class
