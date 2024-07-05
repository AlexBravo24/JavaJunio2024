package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//en comcepto de composiscion tenemos objetos mas grandes 
		
		//entonces primero deben existir o deben crearse los objetos mas pequeños 
		
		Procesador amd = new Procesador("AMD", "Ryzen", 4.5);
		Almacenamiento adata= new Almacenamiento("Adata", "A5", 480);
		Ram Kingston =new Ram("Kingston", "DRR4", 8);
		
		Laptop lenovo= new Laptop("Lenovo", "L15", "Negro", amd, adata, Kingston);
		System.out.println(lenovo);

		
		Ruedas  barzo = new Ruedas("negro", "20", "montaña");
		Asiento  kubor = new Asiento("Kubor", "lite","negro", "piel");
		Pedal du = new Pedal("DU", "slim", "plata", "acero");
		
		Bicicleta Benoto= new Bicicleta("benoto", "turismo","Blanco/negro",barzo, kubor, du);
		System.out.println(Benoto);
		
		
	}

}
