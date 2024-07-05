package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		lista.add("Julio");
		lista.add("Carlos");
		lista.add("César");
		lista.add("José");
		lista.add("Antoño");
		lista.add("Julio");
		System.out.println(lista);
		System.out.println(lista.get(1));

		System.out.println(lista.contains("Julio"));
		System.out.println(lista.indexOf("Julio"));
		System.out.println(lista.lastIndexOf("Julio"));

//		System.out.println(lista.remove(1));
		lista.add(4, "Pancho");
		System.out.println(lista);
		lista.set(1, "Carlangas");
		System.out.println(lista);

		for (String nombres : lista) {
			System.out.println(nombres);
		}

		List<Object> colleciones = new ArrayList<Object>();
		
		colleciones.add(123);
		colleciones.add("Julio");
		colleciones.add(true);
		colleciones.add(false);
		colleciones.add('O');
		colleciones.add(lista);
		
		List<Object> coleciones2 = new ArrayList<Object>();
		coleciones2.add(colleciones);
		coleciones2.add(lista);
		System.out.println(coleciones2);
		
	}
}
