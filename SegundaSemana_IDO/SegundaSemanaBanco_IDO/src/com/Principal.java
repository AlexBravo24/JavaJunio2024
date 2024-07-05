package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Creamos BD osea el HM
		
		//primera opcion declaramos el HM
		
		Map<Integer, Cuenta> cuentas= new  HashMap <Integer, Cuenta>();
		
		// Para agregar cunetas en nuestro HM
		
		//crear una cuenta y agregarla despues
		//ejemplo1
		
		Cuenta alex = new Cuenta ("Alex", 13000, 4000, 50000, "Debito");
		cuentas.put(1001, alex);
		//ejemplo 2
		//Creando las cuentas directamenete en el HM
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 1000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));

		//recordemos que recuperar un valor de un objeto de mi HM 
		//podria se 
		//ejem
		//esto lo tiene que hacer el cajero
		//System.out.println(cuentas.get(1003));
		
		//Crear Nuevo Cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		// Probarl el metodo consultar de la clase Cajero
		//System.out.println(angelopolis.consultar(1001));
		
		
		// Probar el Metodo Retirar exitoso
		
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		System.out.println(angelopolis.retirar(1006, 10000));
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Probar ticket deposito
		System.out.println(angelopolis.depositar(1001, 5000));
		
	}

}
