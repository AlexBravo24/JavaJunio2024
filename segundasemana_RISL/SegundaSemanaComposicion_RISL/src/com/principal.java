package com;

public class principal {

	public static void main(String[] args) {
		// En el concepto de composicion tenemos objetos peque�os
		//que forman parte de objetos mas grandes 
		
		//procesador amd=new procesador("AMD", "Rizen 5", 4.5);
		
		//Almacenamiento adata= new Almacenamiento("Adata", "A5",480);
		
	//	Ram kingston= new Ram("Kingston","DDR4",8);
		
		//Laptop Lenovo= new Laptop("lenovo","L15", "negro",amd , adata, kingston);
		
		//System.out.println(Lenovo);
		
		//autos 
		
Llanta michelin= new Llanta("michelin",16,"Deportivas");
		
		motor volkswagen=new motor(100, 6, "volkswagen");
		
		asientos deportivo=new asientos("Deportivos", "beige", "piel");
		
		Stereo pioneer=new Stereo("Pioneer", "DEH-S1200", "Bluetooth", 50);
		
		Autos audi=new Autos("Audi", 2023, "rojo",michelin, volkswagen, deportivo);
		System.out.println(audi);
		System.out.println(michelin);
		System.out.println(volkswagen);
		System.out.println(deportivo);
		System.out.println(pioneer);
		
		
		
		
		
		
		
		
	}

}