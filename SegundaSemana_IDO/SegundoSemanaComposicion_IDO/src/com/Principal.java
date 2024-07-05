package com;

public class Principal {

	public static void main(String[] args) {
		
		// En el concepto de compoosicion tenemos objetos mas pequeños
		//que forman parte de uno o mas grande
		
		//Entonces primero deben de existir o crearse los objetos
		//para finalmente crear el mas grande que se como pone de estos otros
		
		
		
		Procesador amd = new Procesador ("AMD", "Ryzen 5 ", 4.5);
		
		Almacenamiento adata = new Almacenamiento ("ADATA", "A5", 480);
		
		Ram kingston = new Ram("Kingstone", "DDR4", 8);
		
		Laptop lenovo = new Laptop("Lenovo", "Negra", "Modelos", amd, adata, kingston);
		

	}
	
	
	Llantas firestone = new Llantas(30, "Firestone");
    Rin ingles = new Rin(30, "Ingles");
    Frenos shimano = new Frenos("Shimano", "Montaña");

	
    Bicicleta bmx = new Bicicleta("BMX", "Carreras", "Blanca", firestone, ingles, shimano);

     

}
