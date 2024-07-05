package com;

public class Principal {

	public static void main(String[] args) {
		
		// En el concepto de composicion tenemos objetos mas pequeños
		//que forman parte de uno mas grande 
		//Entonces primero deben existir o crearse los objetos mas pequeños
		//para finalmente crear al mas grande que se compone de estos otros
		
		Procesador amd = new Procesador ("AMD", "Ryzen 5", "4.5");
		
        Almacenamiento adata = new Almacenamiento("Adata", "A5", "480");
        
        Ram kingston = new Ram("Kingston", "DDR4", "8");
        
        Laptop lenovo = new Laptop("Lenovo", "L15", "Negro", amd, adata, kingston);
        
        System.out.println(lenovo);
        
        // Van realizar un objeto de composicion 
        // que tenga sus propios atributos  y se componga de por lo menos otros 3
        //y lo mandan a imprimir en esta clase principal
        
        Saborizante sab = new Saborizante("manzana", "limon", "cola");
        
        Temperatura temp = new Temperatura("frio", "templado", "caliente");
        
        Envasado env = new Envasado("vidrio", "plastico", "carton");
        
        Refresco refresco = new Refresco("pepsi", 350, 20.5, sab, temp, env);
        
        System.out.println(refresco);
        
        
        
	}

}
