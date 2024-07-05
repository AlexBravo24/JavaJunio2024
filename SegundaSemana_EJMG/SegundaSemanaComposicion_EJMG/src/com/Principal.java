package com;

public class Principal {

	public static void main(String[] args) {
		//En el concepto de composicion , tenemos objetos mas 
		//pequeños que forman parte de nuno mas grande
		
		
		Procesador amd = new Procesador("AMD","rayzen 5", 4.5);
		Almacenamiento adata =new Almacenamiento("adta", "A5", 480);
        Ram kingston= new Ram("kingston", "DDR4", 8);
        
        Laptop lenovo = new Laptop("Lenovo", "L15", "Negro", amd, adata, kingston);
        
        System.out.println(lenovo);
        
        
        Sala reclinable= new Sala("LG", "Reclinable",55) ;
        Cocina mabe= new Cocina("Mabe", "whirpool", "Redonda", 4);
        Habitacion matrimonial = new Habitacion("king size", "samsung", 2);
        
        Casa azul = new Casa("azul", 4, 2, reclinable, mabe, matrimonial);
        
        System.out.println(azul);
	}
	
	

}
