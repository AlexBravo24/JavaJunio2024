package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado carlos = new Empleado("Carlos", "Hombre", 35, "JGAKJGDJ4656", "Ayudante general", 118, 1756.21, "Diurno");
		carlos.Dormir();
		int fechaNacimiento = carlos.FechaNacimiento(2024);
		System.out.println(fechaNacimiento);
		carlos.FechaNacimiento();
		System.out.println(carlos.FechaNacimiento("1989"));
		
		
		Empleado obrero = new Empleado("Juan", "Hombre", 25, "JGAKJGDJ4656", "Ayudante general", 118, 1756.21, "Diurno");
		Empleado obrero2 = new Empleado(carlos.getNombre(), carlos.getGenero(), carlos.getEdad(), "JHAJNDKn", "Ayudante general", 118, 1756.21, "Diurno");
		
		System.out.println(obrero);
		System.out.println(obrero2);
		
		
		Refrigerador sencillo = new Refrigerador("Mabe","AH90", 9999.99, 16.8, false);
		Cocina parrilla = new Cocina("Generica", "AOI756", 2599.99, 2, false);
		Lavadora express = new Lavadora("Mabe", "Spring", 8999.99, 16, 12);
		RefrigeradorDeDosPuertas moderno = new RefrigeradorDeDosPuertas("Daewo", "9lP0", 19999.99, 32.98, true, true);
		
		System.out.println(sencillo);
		System.out.println(parrilla);
		System.out.println(express);
		System.out.println(moderno);
		
		carlos.Sumar(19, 15);
		carlos.Sumar();
		
	}

}
