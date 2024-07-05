package com;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Procesador amd = new Procesador("AMD", "Core i9", 3.8);
		Almacenamiento ssd = new Almacenamiento("Kingstone", "SSD", 1200.50);
		Ram ddr5 = new Ram("Kingstone", "DDR5", 16.0);

		Laptop nuevaLaptop = new Laptop();

		nuevaLaptop.setMarca("Lenovo");
		nuevaLaptop.setModelo("ThinkCentre");
		nuevaLaptop.setColor("Azul");
		nuevaLaptop.setCpu(amd);
		nuevaLaptop.setDisco(ssd);
		nuevaLaptop.setMemoria(ddr5);

		System.out.println(nuevaLaptop);

		// Creemos un Jardin simple pasandole un solo elemento por parametro

		Planta jacaranda = new Planta("Jacaranda", "Roja", 0.8);
		Planta jeraneo = new Planta("jeraneo", "Amarilla", 1.2);
		Planta rosa = new Planta("Rosa", "Violeta", 1.5);

		Flor girasol = new Flor("Girasol", "Amarillo", "Sol");
		Flor clavel = new Flor("Clavel", "Morado", "Sol");
		Flor hortensia = new Flor("Hortensia", "Amarillo", "Sombra");

		Arbol higo = new Arbol("Higo", 5.2, 6);
		Arbol ciruela = new Arbol("Ciruela", 3, 1);

		Fuente caida = new Fuente("Concreto", 1.3, 0.8);

		Jardin residencial = new Jardin("Residencial", 6.0, "Frontal", jacaranda, girasol, higo, caida);

		System.out.println(residencial);

		// creando un jardin con multiples elementos

		List<Planta> plantas = Arrays.asList(jacaranda, jeraneo, rosa);
		List<Flor> flores = Arrays.asList(girasol, clavel, hortensia);
		List<Arbol> arboles = Arrays.asList(higo, ciruela);
		List<Fuente> fuentes = Arrays.asList(caida);
		JardinList multijardin = new JardinList("Comunitario", 16.5, "frontal", plantas, flores, arboles, fuentes);
		
		System.out.println(multijardin);
	}

}
