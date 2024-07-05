package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// vamos a crear nuestra base de datos 
		
		//declaramos nuestro hasmap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		//Para agregar ceuntas en nuestro HasMap podemos hacerlo de dos formas 
		//creando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000,4000,50000,"Debito");
		cuentas.put(1001, alex);
		
		
		//Creando las ceuntas directamente el el HAsMp
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Alberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Si nos acordasmos para recueperar el valor de un  objeto en mi HasMAp 
		System.out.println(cuentas.get(1003));
		
		//crear nuevo cajero
		Cajero angelopolis = new Cajero ("angelopolis", cuentas);
		
		//probar el metodo consultar
		
		System.out.println(angelopolis.consultar(1006));
		

	}

}
