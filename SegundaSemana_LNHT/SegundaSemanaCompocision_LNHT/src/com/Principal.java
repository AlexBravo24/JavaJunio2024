package com;

public class Principal {

	public static void main(String[] args) {
		// En el concepto de composicion tenemos un objeto mas pequeños que forman parte de uno mas grande
		
		//Entonces primero deben de existit o crearse los objetos pequeños para finalmente
		//crear el mas grande , que se compone de estos otros
		
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4.5);
		Almacenamiento adata = new Almacenamiento("Adata", "A5", 480);
		Ram kingston = new Ram("kingston", "DDR4", 8);
		Laptop lenovo= new Laptop("Lenovo", "L15", "Negro", amd, adata, kingston);
		System.out.println(lenovo);

		//Actividad Realizar un objeto de composicion
		//que tebga sus propios atributos y se componga de por lo menos 3 objetos 
		//y lo manda imprimir en la clase principal
		Estereo sony = new Estereo("SONY", "dx-400", 50, 2);
		Amplificador ampliR = new Amplificador("Rock Series", "1000x a4", 250);
		Llantas llanta= new Llantas("Pireli", "Todo terreno", 15);
		Camara canon = new Camara("Canon", "R-250A", 28);
		Camioneta camioneta2024 = new Camioneta ("RAM 800", 1.8, "RAM", "2024", 4, sony, ampliR, llanta, canon);
		
		System.out.println(camioneta2024);

	}

}
