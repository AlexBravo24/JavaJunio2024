package com;

public class Principal {

	public static void main(String[] args) {
		
		// En el concepto de composici�n tenemos objetos m�s peque�os que forman parte de uno m�s grande.
		
		//1. se definen los objetos peque�os:
/*		Procesador amd = new Procesador("AMD", "Ryzen 5", 4.5);
		
		Almacenamiento adata = new Almacenamiento("Adata", "A5", 400);
		
		Ram kingston = new Ram("Kingston", "DDR4", 8);
		
		//2.Se definen el objeto m�s grande:
		Laptop lenovo = new Laptop("Lenovo", "L15", "negro", amd, adata, kingston);
		
		System.out.println(lenovo);
*/		
		
		Videojuegos COD = new Videojuegos(2, "guerra", 25);
		
		Control control1 = new Control("inalambrico", 18, "negro");
		
		Desarrollador PlayStationStudios = new Desarrollador("Sony", "Ken Kutaragi", "Jap�n");
		
		ConsolaVideojuegos PlayStation3 = new ConsolaVideojuegos (128, "negro", COD, control1, PlayStationStudios);
		
		System.out.println(PlayStation3);
				
	}

}
