package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(0, "Usuario 1");
		usuarios.put(1, "Usuario 2");
		usuarios.put(2, "Usuario 3");

		System.out.println(usuarios.get(1));

		usuarios.remove(1);
		System.out.println(usuarios);

		System.out.println(usuarios.keySet());

		System.out.println(usuarios.values());

		for (Integer i : usuarios.keySet()) {
			System.out.println("Llave: " + i + " Valor: " + usuarios.get(i));
		}
		for (String string : usuarios.values()) {
			System.out.println(string);
		}
		
		
	}

}
