package com;

public class Principal {

	public static void main(String[] args) {
		// En el cocepto de composicin, tenemos objetos mas 
		//pequeños que forman parte de uno mas grande
		
	//Entonces primero deben existir o crearse los objetos pequeños
		//para finalmnete crear el mas grande, que se compone de 
		//estos otros
		
Procesador amd= new Procesador("AMD","Ryzen 5", 4.5);

Almacenamiento adata =  new Almacenamiento("Adata","A4", 500);

Ram Kingston = new Ram("Kingston","DDR4", 16);

 Laptop lenovo = new Laptop("Lenovo","ideapad 335", "Negro",amd,adata, Kingston);
 
 System.out.println(lenovo);
 
 	//Realizar un objeto de composicion 
 	//Que tenga sus propios atributos y se compone de por lo menos otros 3 objetos
	// y lo manda a imprimir en esta misma clase principal
 
 //Conola de videojuegos
 Gpu RDNA= new Gpu("RDNA 2 con 36CUs",2.23, 2);

 Memoria dd=  new Memoria ("Adata","Toshisba", 1000);

 MemoriaRam rr  = new MemoriaRam ("GDDR6",5.5, 16);

  PS5 play = new PS5("PlayStation","PS5", "Blanco",RDNA,dd,rr);
  
  System.out.println(play);
 
 
	}

}
