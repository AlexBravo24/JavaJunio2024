package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		// Crear base de datos: (dos formas)
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Para agregar cuentas en nuestro HashMap podemos hacerlo de la siguiente manera:
		//1.Forma: Creando la cuenta y agregandola después:
		
		Cuenta dylan = new Cuenta("Dylan", 11000, 4000, 20000, "Debito");
		cuentas.put(1001, dylan);
		
		//2.Forma: Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Isabel", 1000, 100, 1500, "Debito"));
		cuentas.put(1003, new Cuenta("Kelly", 100000, 10000, 500000, "Debito"));
		cuentas.put(1004, new Cuenta("Esteban", 16000, 1500, 25000, "Debito"));
		
		//Si nos acordamos, ppara recuperar el valor de un objeto en el HashMap:
		//System.out.println(cuentas.get(1003));
		
		//Crear nuevo Cajero
		Cajero reforma=new Cajero ("Reforma", cuentas);
		
		//Probar el método consultar:
		System.out.println(reforma.consultar(1006)); //Si se busca una cuenta que no existe habrá un resultado null
		
		//Probar el método retirar exitoso
		System.out.println(reforma.retirar(1001, 8000)); //Probando si el monto excede el saldo minimo o no
		
		//Probar retirar dinero de una cuenta inexistente
		System.out.println(reforma.retirar(1008, 8000));
		
		//Probar depositar dinero en una cuenta:
		System.out.println(reforma.depositar(1001, 4000));
		
		
		
		

	}

}
