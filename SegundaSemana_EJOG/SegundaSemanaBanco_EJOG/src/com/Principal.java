package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Vamos a crear nuestra BD
		
		//Declaramos nuestro hashMap		
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		//Para agregar cuentas a nuestro HashMap podemos hacerlo de dos formas
		//Creando la cuenta y agregandola despues.
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//Creando las cuentas directamente en el HashMap
		cuentas.put(1002,new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003,new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004,new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Si nos acordamos, para recuperar el valor de un objeto en un HashMap
		//System.out.println(cuentas.get(1004));
		
		//Crear mi nuevo Cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		Cajero cdmxNorte = new Cajero("CdmxNorte", cuentas);
		
		//Probar el método consultar de la clase o objeto Cajero
		System.out.println(angelopolis.consultar(1001));
		
		
		//Probar Método retirar
		System.out.println(angelopolis.retirar(1001, 5000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		System.out.println(cdmxNorte.retirar(1003, 1000));
		//Método deposito
		System.out.println(angelopolis.depositar(1003, 5000));
		System.out.println(angelopolis.retirar(1001, 100));
		
	}

}
